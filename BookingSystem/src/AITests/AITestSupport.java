package AITests;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.Window;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

import javax.swing.AbstractButton;
import javax.swing.JComboBox;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

import bookingManagment.BookingManager;
import dataManagement.MaintainAdministrator;
import dataManagement.MaintainUser;
import gui.AppFrame;
import roomManagement.RoomManager;

final class AITestSupport {
    private AITestSupport() {
    }

    static Date date(String value) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            format.setLenient(false);
            return format.parse(value);
        } catch (ParseException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @SuppressWarnings("unchecked")
    static <T> T getField(Object target, String name) {
        try {
            Class<?> type = target instanceof Class<?> ? (Class<?>) target : target.getClass();
            Field field = findField(type, name);
            field.setAccessible(true);
            return (T) field.get(target instanceof Class<?> ? null : target);
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(e);
        }
    }

    static void setField(Object target, String name, Object value) {
        try {
            Class<?> type = target instanceof Class<?> ? (Class<?>) target : target.getClass();
            Field field = findField(type, name);
            field.setAccessible(true);
            field.set(target instanceof Class<?> ? null : target, value);
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(e);
        }
    }

    @SuppressWarnings("unchecked")
    static <T> T invoke(Object target, String name, Class<?>[] parameterTypes, Object... args) {
        try {
            Method method = target.getClass().getDeclaredMethod(name, parameterTypes);
            method.setAccessible(true);
            return (T) method.invoke(target, args);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw (RuntimeException) cause;
            }
            if (cause instanceof Error) {
                throw (Error) cause;
            }
            throw new AssertionError(cause);
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(e);
        }
    }

    private static Field findField(Class<?> type, String name) throws NoSuchFieldException {
        Class<?> current = type;
        while (current != null) {
            try {
                return current.getDeclaredField(name);
            } catch (NoSuchFieldException ignored) {
                current = current.getSuperclass();
            }
        }
        throw new NoSuchFieldException(name);
    }

    static void resetBookingManager() {
        BookingManager manager = BookingManager.getInstance();
        HashMap<?, ?> bookings = getField(manager, "bookings");
        bookings.clear();
        setField(BookingManager.class, "numOfBookings", 0);
    }

    static RoomManager resetRoomManager() {
        RoomManager.getRoomManagerInstance().resetRooms();
        return RoomManager.getRoomManagerInstance();
    }

    static AppFrame freshApp() {
        AppFrame app = onEdt(AppFrame::getInstance);
        setField(app, "maintainUser", new MaintainUser());
        setField(app, "maintainAdministrator", new MaintainAdministrator());
        app.setCurrentUser(null);
        app.setCurrentAdministrator(null);
        installCardRecorder(app);
        return app;
    }

    static CardRecorder installCardRecorder(AppFrame app) {
        CardRecorder recorder = new CardRecorder();
        setField(app, "cardLayout", recorder);
        return recorder;
    }

    static final class CardRecorder extends CardLayout {
        private static final long serialVersionUID = 1L;
        private String lastCard;

        @Override
        public void show(Container parent, String name) {
            lastCard = name;
        }

        String getLastCard() {
            return lastCard;
        }
    }

    static AbstractButton findButton(Container root, String text) {
        for (Component component : root.getComponents()) {
            if (component instanceof AbstractButton && text.equals(((AbstractButton) component).getText())) {
                return (AbstractButton) component;
            }
            if (component instanceof Container) {
                AbstractButton nested = findButton((Container) component, text);
                if (nested != null) {
                    return nested;
                }
            }
        }
        return null;
    }

    static JComboBox<?> findComboBox(Container root) {
        for (Component component : root.getComponents()) {
            if (component instanceof JComboBox<?>) {
                return (JComboBox<?>) component;
            }
            if (component instanceof Container) {
                JComboBox<?> nested = findComboBox((Container) component);
                if (nested != null) {
                    return nested;
                }
            }
        }
        return null;
    }

    static void runClosingDialogs(Runnable action) {
        Timer timer = new Timer(25, event -> closeDialogs());
        timer.setRepeats(true);
        timer.start();
        try {
            action.run();
        } finally {
            timer.stop();
            closeDialogs();
        }
    }

    static void runSilencingError(Runnable action) {
        PrintStream original = System.err;
        try (PrintStream ignored = new PrintStream(new ByteArrayOutputStream())) {
            System.setErr(ignored);
            action.run();
        } finally {
            System.setErr(original);
        }
    }

    static void closeDialogs() {
        for (Window window : Window.getWindows()) {
            if (window instanceof Dialog && window.isShowing()) {
                window.dispose();
            }
        }
    }

    static void preserveFile(String fileName, Runnable action) {
        Path path = Paths.get(fileName);
        boolean existed = Files.exists(path);
        boolean directory = Files.isDirectory(path);
        byte[] original = null;
        try {
            if (existed && !directory) {
                original = Files.readAllBytes(path);
            }
            action.run();
        } catch (IOException e) {
            throw new AssertionError(e);
        } finally {
            try {
                deleteRecursively(path);
                if (existed) {
                    if (directory) {
                        Files.createDirectories(path);
                    } else {
                        Path parent = path.getParent();
                        if (parent != null) {
                            Files.createDirectories(parent);
                        }
                        Files.write(path, original);
                    }
                }
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    static void makeDirectoryAtFilePath(String fileName) {
        Path path = Paths.get(fileName);
        try {
            deleteRecursively(path);
            Files.createDirectories(path);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    static void writeText(String fileName, String text) {
        Path path = Paths.get(fileName);
        try {
            Path parent = path.getParent();
            if (parent != null) {
                Files.createDirectories(parent);
            }
            Files.write(path, text.getBytes(java.nio.charset.StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    private static void deleteRecursively(Path path) throws IOException {
        if (!Files.exists(path)) {
            return;
        }
        if (Files.isDirectory(path)) {
            try (java.util.stream.Stream<Path> stream = Files.walk(path)) {
                stream.sorted(Comparator.reverseOrder()).forEach(item -> {
                    try {
                        Files.deleteIfExists(item);
                    } catch (IOException e) {
                        throw new DeleteFailure(e);
                    }
                });
            } catch (DeleteFailure failure) {
                throw failure.ioException;
            }
        } else {
            Files.deleteIfExists(path);
        }
    }

    private static final class DeleteFailure extends RuntimeException {
        private static final long serialVersionUID = 1L;
        private final IOException ioException;

        private DeleteFailure(IOException ioException) {
            this.ioException = ioException;
        }
    }

    static <T> T onEdt(Callable<T> callable) {
        if (SwingUtilities.isEventDispatchThread()) {
            try {
                return callable.call();
            } catch (Exception e) {
                throw new AssertionError(e);
            }
        }
        AtomicReference<T> result = new AtomicReference<>();
        AtomicReference<Throwable> failure = new AtomicReference<>();
        try {
            SwingUtilities.invokeAndWait(() -> {
                try {
                    result.set(callable.call());
                } catch (Throwable t) {
                    failure.set(t);
                }
            });
        } catch (Exception e) {
            throw new AssertionError(e);
        }
        if (failure.get() != null) {
            throw new AssertionError(failure.get());
        }
        return result.get();
    }
}

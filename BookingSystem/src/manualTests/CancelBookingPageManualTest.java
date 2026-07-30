package manualTests;

import static org.junit.Assert.*;

import java.awt.Component;
import java.awt.Container;
import java.awt.Window;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bookingManagment.Booking;
import bookingManagment.BookingManager;
import gui.AppFrame;
import gui.CancelBookingPage;
import roomManagement.Room;
import roomManagement.RoomManager;
import userManagement.Student;

public class CancelBookingPageManualTest {

    private AppFrame app;
    private CancelBookingPage page;
    private BookingManager bookingManager;

    @Before
    public void setUp() throws Exception {
        app = AppFrame.getInstance();
        app.setVisible(false);
        page = getCard(CancelBookingPage.class);
        bookingManager = BookingManager.getInstance();
        cleanBookings();
        getDropdown().removeAllItems();
        app.setCurrentUser(new Student("GuiUser", "Abc123$#", "guiuser@yorku.ca", 9001, "900100001"));
    }

    @After
    public void tearDown() {
        cleanBookings();
        RoomManager.getRoomManagerInstance().resetRooms();
    }

    @Test
    public void testPageExists() {
        assertNotNull(page);
    }

    @Test
    public void testBookingDropdownExists() throws Exception {
        assertNotNull(getDropdown());
    }

    @Test
    public void testCancelBookingButtonExists() {
        assertNotNull(findButton(page, "cancel booking"));
    }

    @Test
    public void testBackButtonExists() {
        assertNotNull(findButton(page, "back"));
    }

    @Test
    public void testDropdownCanBeCleared() throws Exception {
        getDropdown().removeAllItems();
        assertEquals(0, getDropdown().getItemCount());
    }

    @Test
    public void testBackButtonShowsUserOptionsCard() throws Exception {
        findButton(page, "back").doClick();
        assertEquals("UserOptionPage", getVisibleCardSimpleName());
    }

    @Test
    public void testRefreshBookingsWithNoBookingsShowsEmptyDropdown() throws Exception {
        CancelBookingPage.refreshBookings(app);
        assertEquals(0, getDropdown().getItemCount());
    }

    @Test
    public void testRefreshBookingsAddsOnlyCurrentUserBookings() throws Exception {
        Date date = futureDate();
        bookingManager.createBooking("9001", "CLH-205", "guiCancel1", date, "10:00", "11:00", 20, 20, 20);
        bookingManager.createBooking("9001", "LAS-1001", "guiCancel2", date, "12:00", "13:00", 20, 20, 20);
        bookingManager.createBooking("9999", "VH-1191", "guiCancelOther", date, "12:00", "13:00", 20, 20, 20);

        CancelBookingPage.refreshBookings(app);

        assertEquals(2, getDropdown().getItemCount());
    }

    @Test
    public void testRefreshBookingsRemovesOldDropdownItems() throws Exception {
        getDropdown().addItem(new Booking("oldUser", "oldRoom", "oldBooking", futureDate(), "10:00", "11:00", 20, 20, 20));
        assertEquals(1, getDropdown().getItemCount());

        CancelBookingPage.refreshBookings(app);

        assertEquals(0, getDropdown().getItemCount());
    }

    @Test
    public void testCancelSelectedBookingRemovesItFromBookingManager() throws Exception {
        bookingManager.createBooking("9001", "CLH-205", "guiCancel1", futureDate(), "10:00", "11:00", 20, 20, 20);
        CancelBookingPage.refreshBookings(app);
        getDropdown().setSelectedIndex(0);

        clickAndCloseDialogs(findButton(page, "cancel booking"));

        assertNull(bookingManager.getBooking("guiCancel1"));
    }

    @Test
    public void testCancelSelectedBookingUpdatesRoomToVacant() throws Exception {
        Room room = RoomManager.getRoomManagerInstance().selectRoomID("CLH-205");
        room.setOccupied(true);
        assertTrue(room.isOccupied());

        bookingManager.createBooking("9001", "CLH-205", "guiCancel2", futureDate(), "10:00", "11:00", 20, 20, 20);
        CancelBookingPage.refreshBookings(app);
        getDropdown().setSelectedIndex(0);

        clickAndCloseDialogs(findButton(page, "cancel booking"));

        assertFalse(room.isOccupied());
    }

    @Test
    public void testCancelButtonWithNoSelectionDoesNotThrowException() throws Exception {
        getDropdown().removeAllItems();
        clickAndCloseDialogs(findButton(page, "cancel booking"));
        assertEquals(0, getDropdown().getItemCount());
    }

    private void cleanBookings() {
        bookingManager.cancelBooking("guiCancel1");
        bookingManager.cancelBooking("guiCancel2");
        bookingManager.cancelBooking("guiCancelOther");
    }

    private Date futureDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 1);
        return calendar.getTime();
    }

    @SuppressWarnings("unchecked")
    private JComboBox<Booking> getDropdown() throws Exception {
        Field field = CancelBookingPage.class.getDeclaredField("bookingDropdown");
        field.setAccessible(true);
        return (JComboBox<Booking>) field.get(null);
    }

    private void clickAndCloseDialogs(JButton button) throws Exception {
        Thread closer = new Thread(() -> {
            long end = System.currentTimeMillis() + 2000;
            while (System.currentTimeMillis() < end) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {
                }
                SwingUtilities.invokeLater(() -> {
                    for (Window window : Window.getWindows()) {
                        if (window instanceof JDialog && window.isShowing()) {
                            window.dispose();
                        }
                    }
                });
            }
        });
        closer.setDaemon(true);
        closer.start();
        button.doClick();
    }

    private <T> T getCard(Class<T> type) throws Exception {
        for (Component component : getCardContainer().getComponents()) {
            if (type.isInstance(component)) {
                return type.cast(component);
            }
        }
        return null;
    }

    private JPanel getCardContainer() throws Exception {
        Field field = AppFrame.class.getDeclaredField("cardContainer");
        field.setAccessible(true);
        return (JPanel) field.get(app);
    }

    private String getVisibleCardSimpleName() throws Exception {
        for (Component component : getCardContainer().getComponents()) {
            if (component.isVisible()) {
                return component.getClass().getSimpleName();
            }
        }
        return "";
    }

    private JButton findButton(Container root, String text) {
        for (JButton button : findAll(root, JButton.class)) {
            if (text.equals(button.getText())) {
                return button;
            }
        }
        return null;
    }

    private <T extends Component> List<T> findAll(Container root, Class<T> type) {
        List<T> matches = new ArrayList<T>();
        for (Component component : root.getComponents()) {
            if (type.isInstance(component)) {
                matches.add(type.cast(component));
            }
            if (component instanceof Container) {
                matches.addAll(findAll((Container) component, type));
            }
        }
        return matches;
    }
}

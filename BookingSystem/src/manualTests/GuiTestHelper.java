package manualTests;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.Window;
import java.lang.reflect.Field;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

import gui.AppFrame;

public class GuiTestHelper {
	
	//recursively searches a container for the first JButton with the given text.
	public static JButton findButtonByText(Container container, String text) {
	for (Component c : container.getComponents()) {
		if (c instanceof JButton && text.equals(((JButton) c).getText())) {
			return (JButton) c;
		}
		if (c instanceof Container) {
			JButton found = findButtonByText((Container) c, text);
			if (found != null) {
				return found;
			}
		}
	}
	return null;
	}
	
	//recursively searches a container for the first component of the given type.
	@SuppressWarnings("unchecked")
	public static <T extends Component> T findComponentOfType(Container container, Class<T> type) {
		for(Component c : container.getComponents()) {
			if (type.isInstance(c)) {
				return (T) c;
			}
			if (c instanceof Container) {
				T found = findComponentOfType((Container) c, type);
				if (found != null) {
					return found;
				}
			}
		}
		return null;
	}
	
	public static boolean isCardShowing(AppFrame app, Class<?> pageClass) throws Exception {
		Container cardContainer = (Container) getPrivateField(app, "cardContainer");
		for (Component c : cardContainer.getComponents()) {
			if (c.isVisible() && pageClass.isInstance(c) ) {
				return true;
			}
		}
		return false;
	}
	
	//reads a private field's value off any object, for verification/setup only.
	public static Object getPrivateField(Object object, String fieldName) throws Exception {
		Field field = object.getClass().getDeclaredField(fieldName);
		field.setAccessible(true);
		return field.get(object);
	}
	
	public static void clickAndDismissDialog(JButton button) throws InterruptedException {
		Thread worker = new Thread(button::doClick, "gui-test-dialog-clicker");
		worker.start();

		Dialog dialog = waitForDialog(3000);
		if (dialog != null) {
			// Dismiss on the EDT so the modal secondary loop exits correctly on macOS
			SwingUtilities.invokeLater(() -> {
				dialog.setVisible(false);
				dialog.dispose();
			});
		}
		worker.join(3000);
	}
	
	private static Dialog waitForDialog(long timeoutMillis) throws InterruptedException {
		long deadline = System.currentTimeMillis() + timeoutMillis;
		while (System.currentTimeMillis() < deadline) {
			for (Window w : Window.getWindows()) {
				if (w instanceof Dialog && w.isVisible()) {
					return (Dialog) w;
				}
			}
			Thread.sleep(15);
		}
		return null;
	}
	
}

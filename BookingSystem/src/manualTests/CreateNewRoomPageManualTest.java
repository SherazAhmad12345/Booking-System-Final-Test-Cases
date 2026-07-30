package manualTests;

import static org.junit.Assert.*;

import java.awt.Component;
import java.awt.Container;
import java.awt.Window;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import administratorManagement.Administrator;
import gui.AppFrame;
import gui.CreateNewRoomPage;
import roomManagement.RoomManager;

public class CreateNewRoomPageManualTest {

    private AppFrame app;
    private CreateNewRoomPage page;
    private Administrator admin;

    @Before
    public void setUp() throws Exception {
        RoomManager.getRoomManagerInstance().resetRooms();
        app = AppFrame.getInstance();
        app.setVisible(false);
        admin = new Administrator("GuiAdmin", "Abc123$#", "guiadmin@yorku.ca", 600);
        app.setCurrentAdministrator(admin);
        page = getCard(CreateNewRoomPage.class);
        callClearFields();
    }

    @After
    public void tearDown() {
        RoomManager.getRoomManagerInstance().resetRooms();
    }

    @Test
    public void testPageExists() {
        assertNotNull(page);
    }

    @Test
    public void testHasThreeTextFields() {
        assertEquals(3, findAll(page, JTextField.class).size());
    }

    @Test
    public void testCreateRoomButtonExists() {
        assertNotNull(findButton(page, "Create Room"));
    }

    @Test
    public void testCancelButtonExists() {
        assertNotNull(findButton(page, "cancel"));
    }

    @Test
    public void testCancelButtonShowsAdministratorOptionsCard() throws Exception {
        findButton(page, "cancel").doClick();
        assertEquals("AdministratorOptionPage", getVisibleCardSimpleName());
    }

    @Test
    public void testClearFieldsClearsRoomInputs() throws Exception {
        setRoomFields("TEST-1", "Test Location", "20");
        callClearFields();

        assertEquals("", getTextField("createRoomIDInputField").getText());
        assertEquals("", getTextField("roomLocationInputField").getText());
        assertEquals("", getTextField("roomCapacityInputField").getText());
    }

    @Test
    public void testMissingRoomIDDoesNotCreateRoom() throws Exception {
        setRoomFields("", "Somewhere", "20");

        clickAndCloseDialogs(findButton(page, "Create Room"));

        assertNull(admin.selectRoomID(""));
    }

    @Test
    public void testNonNumberCapacityDoesNotCreateRoom() throws Exception {
        setRoomFields("GUI-101", "GUI Test Room 101", "abc");

        clickAndCloseDialogs(findButton(page, "Create Room"));

        assertNull(admin.selectRoomID("GUI-101"));
    }

    @Test
    public void testNegativeCapacityDoesNotCreateRoom() throws Exception {
        setRoomFields("GUI-102", "GUI Test Room 102", "-5");

        clickAndCloseDialogs(findButton(page, "Create Room"));

        assertNull(admin.selectRoomID("GUI-102"));
    }

    @Test
    public void testDuplicateDefaultRoomIDDoesNotCreateRoom() throws Exception {
        setRoomFields("CLH-205", "Different Location", "30");

        clickAndCloseDialogs(findButton(page, "Create Room"));

        assertEquals("Curtis Lecture Hall 205", admin.selectRoomID("CLH-205").getRoomLocation());
    }

    @Test
    public void testDuplicateLocationDoesNotCreateRoom() throws Exception {
        setRoomFields("GUI-103", "Curtis Lecture Hall 205", "30");

        clickAndCloseDialogs(findButton(page, "Create Room"));

        assertNull(admin.selectRoomID("GUI-103"));
    }

    @Test
    public void testValidRoomCreationAddsRoomAndClearsFields() throws Exception {
        setRoomFields("GUI-104", "GUI Test Room 104", "40");

        clickAndCloseDialogs(findButton(page, "Create Room"));

        assertNotNull(admin.selectRoomID("GUI-104"));
        assertEquals("", getTextField("createRoomIDInputField").getText());
        assertEquals("", getTextField("roomLocationInputField").getText());
        assertEquals("", getTextField("roomCapacityInputField").getText());
        assertEquals("AdministratorOptionPage", getVisibleCardSimpleName());
    }

    private void setRoomFields(String roomID, String location, String capacity) throws Exception {
        getTextField("createRoomIDInputField").setText(roomID);
        getTextField("roomLocationInputField").setText(location);
        getTextField("roomCapacityInputField").setText(capacity);
    }

    private JTextField getTextField(String fieldName) throws Exception {
        Field field = CreateNewRoomPage.class.getDeclaredField(fieldName);
        field.setAccessible(true);
        return (JTextField) field.get(page);
    }

    private void callClearFields() throws Exception {
        Method method = CreateNewRoomPage.class.getDeclaredMethod("clearFields");
        method.setAccessible(true);
        method.invoke(page);
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

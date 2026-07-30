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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import org.junit.Before;
import org.junit.Test;

import gui.AppFrame;
import gui.ChiefEventCoordinatorPage;

public class ChiefEventCoordinatorPageManualTest {

    private AppFrame app;
    private ChiefEventCoordinatorPage page;

    @Before
    public void setUp() throws Exception {
        app = AppFrame.getInstance();
        app.setVisible(false);
        page = getCard(ChiefEventCoordinatorPage.class);
        callClearFields();
    }

    @Test
    public void testPageExists() {
        assertNotNull(page);
    }

    @Test
    public void testHasThreeTextInputs() {
        assertEquals(3, findAll(page, JTextField.class).size());
    }

    @Test
    public void testHasPasswordField() {
        assertEquals(1, findAll(page, JPasswordField.class).size());
    }

    @Test
    public void testCreateAccountButtonExists() {
        assertNotNull(findButton(page, "Create Account"));
    }

    @Test
    public void testLogoutButtonExists() {
        assertNotNull(findButton(page, "logout"));
    }

    @Test
    public void testLogoutButtonShowsWelcomeCard() throws Exception {
        findButton(page, "logout").doClick();
        assertEquals("WelcomePage", getVisibleCardSimpleName());
    }

    @Test
    public void testClearFieldsClearsUsernameEmailAndPassword() throws Exception {
        setAdminFields("tempUser", "temp@yorku.ca", "Abc123$#");
        callClearFields();

        assertEquals("", getTextField("administratorUsernameInputField").getText());
        assertEquals("", getTextField("administratorEmailInputField").getText());
        assertEquals("", new String(getPasswordField("administratorPasswordInputField").getPassword()));
    }

    @Test
    public void testMissingFieldsDoesNotCreateAdmin() throws Exception {
        String username = uniqueUsername("missing");
        setAdminFields(username, "", "Abc123$#");

        clickAndCloseDialogs(findButton(page, "Create Account"));

        assertFalse(app.getMaintainAdministrator().usernameExists(username));
    }

    @Test
    public void testInvalidEmailDoesNotCreateAdmin() throws Exception {
        String username = uniqueUsername("badEmail");
        setAdminFields(username, "admin@gmail.com", "Abc123$#");

        clickAndCloseDialogs(findButton(page, "Create Account"));

        assertFalse(app.getMaintainAdministrator().usernameExists(username));
    }

    @Test
    public void testWeakPasswordDoesNotCreateAdmin() throws Exception {
        String username = uniqueUsername("weakPass");
        setAdminFields(username, username + "@yorku.ca", "weak");

        clickAndCloseDialogs(findButton(page, "Create Account"));

        assertFalse(app.getMaintainAdministrator().usernameExists(username));
    }

    @Test
    public void testValidAdminCreationAddsAdminAndClearsFields() throws Exception {
        String username = uniqueUsername("validAdmin");
        setAdminFields(username, username + "@yorku.ca", "Abc123$#");

        clickAndCloseDialogs(findButton(page, "Create Account"));

        assertTrue(app.getMaintainAdministrator().usernameExists(username));
        assertEquals("", getTextField("administratorUsernameInputField").getText());
        assertEquals("", getTextField("administratorEmailInputField").getText());
        assertEquals("", new String(getPasswordField("administratorPasswordInputField").getPassword()));
    }

    private String uniqueUsername(String prefix) {
        return prefix + System.nanoTime();
    }

    private void setAdminFields(String username, String email, String password) throws Exception {
        getTextField("administratorUsernameInputField").setText(username);
        getTextField("administratorEmailInputField").setText(email);
        getPasswordField("administratorPasswordInputField").setText(password);
    }

    private JTextField getTextField(String fieldName) throws Exception {
        Field field = ChiefEventCoordinatorPage.class.getDeclaredField(fieldName);
        field.setAccessible(true);
        return (JTextField) field.get(page);
    }

    private JPasswordField getPasswordField(String fieldName) throws Exception {
        Field field = ChiefEventCoordinatorPage.class.getDeclaredField(fieldName);
        field.setAccessible(true);
        return (JPasswordField) field.get(page);
    }

    private void callClearFields() throws Exception {
        Method method = ChiefEventCoordinatorPage.class.getDeclaredMethod("clearFields");
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

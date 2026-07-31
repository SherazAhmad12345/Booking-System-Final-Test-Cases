package AITests;

import static org.junit.Assert.*;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.junit.Test;

import gui.LoginPage;

public class LoginPageTest {
    @Test
    public void buildsAndClearsLoginFields() {
        LoginPage page = new LoginPage(null);
        assertNotNull(AITestSupport.findButton(page, "Login"));
        assertNotNull(AITestSupport.findButton(page, "Back"));
        JTextField username = AITestSupport.getField(page, "usernameField");
        JPasswordField password = AITestSupport.getField(page, "passwordField");
        username.setText("user");
        password.setText("pass");
        AITestSupport.invoke(page, "clearFields", new Class<?>[0]);
        assertEquals("", username.getText());
        assertEquals(0, password.getPassword().length);
    }
}

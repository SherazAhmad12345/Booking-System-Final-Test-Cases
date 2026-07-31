package AITests;

import static org.junit.Assert.*;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.junit.Test;

import gui.ChiefEventCoordinatorPage;

public class ChiefEventCoordinatorPageTest {
    @Test
    public void buildsAndClearsAdministratorForm() {
        ChiefEventCoordinatorPage page = new ChiefEventCoordinatorPage(null);
        assertNotNull(AITestSupport.findButton(page, "Create Account"));
        JTextField username = AITestSupport.getField(page, "administratorUsernameInputField");
        JTextField email = AITestSupport.getField(page, "administratorEmailInputField");
        JPasswordField password = AITestSupport.getField(page, "administratorPasswordInputField");
        username.setText("a");
        email.setText("e");
        password.setText("p");
        AITestSupport.invoke(page, "clearFields", new Class<?>[0]);
        assertEquals("", username.getText());
        assertEquals("", email.getText());
        assertEquals(0, password.getPassword().length);
    }
}

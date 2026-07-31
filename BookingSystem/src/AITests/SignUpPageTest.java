package AITests;

import static org.junit.Assert.*;

import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.junit.Test;

import gui.SignUpPage;

public class SignUpPageTest {
    @Test
    public void buildsAndClearsSignUpForm() {
        SignUpPage page = new SignUpPage(null);
        assertNotNull(AITestSupport.findButton(page, "Create Account"));
        assertNotNull(AITestSupport.findButton(page, "Back"));
        JTextField username = AITestSupport.getField(page, "usernameField");
        JPasswordField password = AITestSupport.getField(page, "passwordField");
        JTextField email = AITestSupport.getField(page, "emailField");
        JComboBox<?> type = AITestSupport.getField(page, "userTypeBox");
        JTextField organization = AITestSupport.getField(page, "orgIdOrStudentNumberField");
        username.setText("u");
        password.setText("p");
        email.setText("e");
        type.setSelectedIndex(3);
        organization.setText("o");
        AITestSupport.invoke(page, "clearFields", new Class<?>[0]);
        assertEquals("", username.getText());
        assertEquals(0, password.getPassword().length);
        assertEquals("", email.getText());
        assertEquals(0, type.getSelectedIndex());
        assertEquals("", organization.getText());
    }
}

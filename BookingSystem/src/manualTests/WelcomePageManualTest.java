package manualTests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import javax.swing.JButton;

import org.junit.Test;

import gui.AppFrame;
import gui.LoginPage;
import gui.SignUpPage;
import gui.WelcomePage;

public class WelcomePageManualTest {
	@Test
	public void testSignUpAndLoginButtosExist() {
		AppFrame app = AppFrame.getInstance();
		WelcomePage page = new WelcomePage(app);
		
		JButton signUpButton = GuiTestHelper.findButtonByText(page, "Sign Up");
		JButton loginButton = GuiTestHelper.findButtonByText(page, "Login");
		
		assertNotNull(signUpButton);
		assertNotNull(loginButton);
	}
	
	@Test
	public void testSignUpButtonNavigatesToSignUpPage() throws Exception {
		AppFrame app = AppFrame.getInstance();
		WelcomePage page = new WelcomePage(app);
		
		JButton signUpButton = GuiTestHelper.findButtonByText(page, "Sign Up");
		signUpButton.doClick();
		
		assertTrue(GuiTestHelper.isCardShowing(app, SignUpPage.class));
	}
	
	@Test
	public void testLogiBnuttonNavigatesToLoginPage() throws Exception {
		AppFrame app = AppFrame.getInstance();
		WelcomePage page = new WelcomePage(app);
		
		JButton loginButton = GuiTestHelper.findButtonByText(page, "Login");
		loginButton.doClick();
		
		assertTrue(GuiTestHelper.isCardShowing(app, LoginPage.class));
	}
}

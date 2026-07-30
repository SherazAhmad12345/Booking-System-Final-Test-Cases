package manualTests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import javax.swing.JButton;
import javax.swing.JLabel;

import org.junit.Test;

import gui.AppFrame;
import gui.LoginPage;
import gui.SignUpPage;
import gui.WelcomePage;

public class WelcomePageManualTest {
	@Test
	public void testSignUpAndLoginButtonsExist() {
		AppFrame app = AppFrame.getInstance();
		WelcomePage page = new WelcomePage(app);
		
		JButton signUpButton = GuiTestHelper.findButtonByText(page, "Sign Up");
		JButton loginButton = GuiTestHelper.findButtonByText(page, "Login");
		
		assertNotNull(signUpButton);
		assertNotNull(loginButton);
	}
	
	@Test
	public void testOnlyTwoButtonsArePresent() {
		AppFrame app = AppFrame.getInstance();
		WelcomePage page = new WelcomePage(app);
		
		int buttonCount = countButtons(page);
		
		assertEquals(2, buttonCount);
	}
	
	@Test
	public void testTitleLabelIsPresentWithWelcomeText() {
		AppFrame app = AppFrame.getInstance();
		WelcomePage page = new WelcomePage(app);
		
		JLabel titleLabel = GuiTestHelper.findComponentOfType(page, JLabel.class);
		
		assertNotNull(titleLabel);
		assertTrue(titleLabel.getText().contains("Welcome"));
	}
	
	@Test
	public void testButtonsAreEnabledByDefault() {
		AppFrame app = AppFrame.getInstance();
		WelcomePage page = new WelcomePage(app);
		
		JButton signUpButton = GuiTestHelper.findButtonByText(page, "Sign Up");
		JButton loginButton = GuiTestHelper.findButtonByText(page, "Login");

		assertTrue(signUpButton.isEnabled());
		assertTrue(loginButton.isEnabled());
	}
	
	@Test
	public void testNoUnrelatedButtonsLikeSubmitOrCancelExist() {
		AppFrame app = AppFrame.getInstance();
		WelcomePage page = new WelcomePage(app);
		
		assertEquals(null, GuiTestHelper.findButtonByText(page, "Submit"));
		assertEquals(null, GuiTestHelper.findButtonByText(page, "Cancel"));
		assertEquals(null, GuiTestHelper.findButtonByText(page, "Back"));
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
	
	@Test
	public void testClickingSignUpDoesNotLeaveLoginPageShowing() throws Exception{
		AppFrame app = AppFrame.getInstance();
		WelcomePage page = new WelcomePage(app);
		
		GuiTestHelper.findButtonByText(page, "Sign Up").doClick();
		
		assertFalse(GuiTestHelper.isCardShowing(app, LoginPage.class));
	}
	
	@Test
	public void testClickingLoginDoesNotLeaveSignUpPageShowing() throws Exception{
		AppFrame app = AppFrame.getInstance();
		WelcomePage page = new WelcomePage(app);
		
		GuiTestHelper.findButtonByText(page, "Login").doClick();
		
		assertFalse(GuiTestHelper.isCardShowing(app, SignUpPage.class));
	}
	
	@Test
	public void testMultipleIndependentInstancesEachNavigateCorrectly() throws Exception{
		AppFrame app = AppFrame.getInstance();
		WelcomePage page1 = new WelcomePage(app);
		WelcomePage page2 = new WelcomePage(app);
		
		GuiTestHelper.findButtonByText(page1, "Sign Up").doClick();
		assertTrue(GuiTestHelper.isCardShowing(app, SignUpPage.class));
		
		GuiTestHelper.findButtonByText(page2, "Login").doClick();
		assertTrue(GuiTestHelper.isCardShowing(app, LoginPage.class));
	}
	
	private int countButtons(java.awt.Container container) {
		int count = 0;
		for (java.awt.Component c : container.getComponents()) {
			if (c instanceof JButton) {
				count++;
			}
			if (c instanceof java.awt.Container) {
				count += countButtons((java.awt.Container) c);
			}
		}
		return count;
	}
}

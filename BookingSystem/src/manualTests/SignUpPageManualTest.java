package manualTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.junit.Test;

import dataManagement.MaintainUser;
import gui.AppFrame;
import gui.LoginPage;
import gui.SignUpPage;
import gui.WelcomePage;
import userManagement.User;
import userManagement.UserFactory;

public class SignUpPageManualTest {

	private JTextField getUsernameField(SignUpPage page) throws Exception {
		return (JTextField) GuiTestHelper.getPrivateField(page, "usernameField");
	}

	private JPasswordField getPasswordField(SignUpPage page) throws Exception {
		return (JPasswordField) GuiTestHelper.getPrivateField(page, "passwordField");
	}

	private JTextField getEmailField(SignUpPage page) throws Exception {
		return (JTextField) GuiTestHelper.getPrivateField(page, "emailField");
	}

	@SuppressWarnings("unchecked")
	private JComboBox<String> getUserTypeBox(SignUpPage page) throws Exception {
		return (JComboBox<String>) GuiTestHelper.getPrivateField(page, "userTypeBox");
	}

	private JTextField getOrgIdField(SignUpPage page) throws Exception {
		return (JTextField) GuiTestHelper.getPrivateField(page, "orgIdOrStudentNumberField");
	}

	private void fillForm(SignUpPage page, String username, String password, String email, String userType,
			String orgId) throws Exception {
		getUsernameField(page).setText(username);
		getPasswordField(page).setText(password);
		getEmailField(page).setText(email);
		getUserTypeBox(page).setSelectedItem(userType);
		getOrgIdField(page).setText(orgId);
	}

	@Test
	public void testBackButtonNavigatesToWelcomePage() throws Exception {
		AppFrame app = AppFrame.getInstance();
		SignUpPage page = new SignUpPage(app);

		JButton backButton = GuiTestHelper.findButtonByText(page, "Back");
		backButton.doClick();

		assertTrue(GuiTestHelper.isCardShowing(app, WelcomePage.class));
	}

	@Test
	public void testMissingFieldsDoesNotCreateUser() throws Exception {
		AppFrame app = AppFrame.getInstance();
		MaintainUser maintainUser = app.getMaintainUser();
		int sizeBefore = maintainUser.users.size();

		SignUpPage page = new SignUpPage(app);

		JButton submitButton = GuiTestHelper.findButtonByText(page, "Create Account");
		GuiTestHelper.clickAndDismissDialog(submitButton);

		assertEquals(sizeBefore, maintainUser.users.size());
	}

	@Test
	public void testInvalidEmailForUserTypeDoesNotCreateUser() throws Exception {
		AppFrame app = AppFrame.getInstance();
		MaintainUser maintainUser = app.getMaintainUser();
		int sizeBefore = maintainUser.users.size();

		SignUpPage page = new SignUpPage(app);
		String username = "invalidEmailTestUser" + System.currentTimeMillis();
		
		fillForm(page, username, "Str0ng!Pw", "someone@yorku.ca", "Student", "111111111");

		JButton submitButton = GuiTestHelper.findButtonByText(page, "Create Account");
		GuiTestHelper.clickAndDismissDialog(submitButton);

		assertEquals(sizeBefore, maintainUser.users.size());
		assertFalse(maintainUser.usernameExists(username));
	}

	@Test
	public void testWeakPasswordDoesNotCreateUser() throws Exception {
		AppFrame app = AppFrame.getInstance();
		MaintainUser maintainUser = app.getMaintainUser();
		int sizeBefore = maintainUser.users.size();

		SignUpPage page = new SignUpPage(app);
		String username = "weakPasswordTestUser" + System.currentTimeMillis();
		fillForm(page, username, "weak", username + "@my.yorku.ca", "Student", "222222222");

		JButton submitButton = GuiTestHelper.findButtonByText(page, "Create Account");
		GuiTestHelper.clickAndDismissDialog(submitButton);

		assertEquals(sizeBefore, maintainUser.users.size());
		assertFalse(maintainUser.usernameExists(username));
	}

	@Test
	public void testDuplicateUsernameDoesNotCreateSecondUser() throws Exception {
		AppFrame app = AppFrame.getInstance();
		MaintainUser maintainUser = app.getMaintainUser();

		String existingUsername = "duplicateUsernameTestUser" + System.currentTimeMillis();
		User existingUser = UserFactory.createUser("Student", existingUsername, "Str0ng!Pw",
				existingUsername + "@my.yorku.ca", 700001, "333333333");
		maintainUser.addUser(existingUser);
		int sizeBefore = maintainUser.users.size();

		try {
			SignUpPage page = new SignUpPage(app);
			fillForm(page, existingUsername, "AnotherStr0ng!Pw", "someoneelse@my.yorku.ca", "Student", "444444444");

			JButton submitButton = GuiTestHelper.findButtonByText(page, "Create Account");
			GuiTestHelper.clickAndDismissDialog(submitButton);

			assertEquals(sizeBefore, maintainUser.users.size());
		} finally {
			maintainUser.users.remove(existingUser);
		}
	}

	@Test
	public void testValidSignUpCreatesUserSavesAndNavigatesToLogin() throws Exception {
		AppFrame app = AppFrame.getInstance();
		MaintainUser maintainUser = app.getMaintainUser();

		String username = "validSignUpTestUser" + System.currentTimeMillis();
		String email = username + "@my.yorku.ca";

		try {
			SignUpPage page = new SignUpPage(app);
			fillForm(page, username, "Str0ng!Pw1", email, "Student", "555555555");

			JButton submitButton = GuiTestHelper.findButtonByText(page, "Create Account");
			GuiTestHelper.clickAndDismissDialog(submitButton);

			assertTrue(maintainUser.usernameExists(username));
			assertTrue(GuiTestHelper.isCardShowing(app, LoginPage.class));
		} finally {
			maintainUser.users.removeIf(u -> u.getUsername().equals(username));
			maintainUser.save(AppFrame.USERS_CSV_PATH);
		}
	}
}
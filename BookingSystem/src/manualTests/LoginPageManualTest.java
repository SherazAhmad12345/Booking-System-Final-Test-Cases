package manualTests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import javax.swing.*;
import javax.swing.SwingUtilities;
import administratorManagement.Administrator;
import gui.*;
import userManagement.*;

class LoginPageManualTest {

	private AppFrame app;
	private LoginPage loginPage;

	private static final String TEST_USER     = "loginTestUser";
	private static final String TEST_ADMIN    = "loginTestAdmin";
	private static final String TEST_CEC      = "loginTestCec";
	private static final String TEST_PASS     = "Pass123!";

	@BeforeEach
	void setUp() {
		app = AppFrame.getInstance();
		app.getMaintainUser().addUser(
				UserFactory.createUser("Student", TEST_USER, TEST_PASS, "logintest@my.yorku.ca", 99991, "999991"));
		app.getMaintainAdministrator().addAdmin(
				new Administrator(TEST_ADMIN, TEST_PASS, "loginadmin@yorku.ca", 99992, false));
		app.getMaintainAdministrator().addAdmin(
				new Administrator(TEST_CEC, TEST_PASS, "logincec@yorku.ca", 99993, true));
		loginPage = new LoginPage(app);
	}

	@AfterEach
	void tearDown() {
		app.getMaintainUser().users.removeIf(u -> u.getUsername().equalsIgnoreCase(TEST_USER));
		app.getMaintainAdministrator().admins.removeIf(a ->
				a.getUsername().equalsIgnoreCase(TEST_ADMIN) ||
				a.getUsername().equalsIgnoreCase(TEST_CEC));
		app.setCurrentUser(null);
		app.setCurrentAdministrator(null);
	}

	// ── helpers ──────────────────────────────────────────────────────────────

	private JTextField usernameField() throws Exception {
		return (JTextField) GuiTestHelper.getPrivateField(loginPage, "usernameField");
	}

	private JPasswordField passwordField() throws Exception {
		return (JPasswordField) GuiTestHelper.getPrivateField(loginPage, "passwordField");
	}

	// ── tests ─────────────────────────────────────────────────────────────────

	@Test
	void testLoginAndBackButtonsExist() {
		assertNotNull(GuiTestHelper.findButtonByText(loginPage, "Login"), "Login button should exist.");
		assertNotNull(GuiTestHelper.findButtonByText(loginPage, "Back"), "Back button should exist.");
	}

	@Test
	void testUsernameAndPasswordFieldsExist() {
		assertNotNull(GuiTestHelper.findComponentOfType(loginPage, JTextField.class),
				"Username text field should exist on the page.");
		assertNotNull(GuiTestHelper.findComponentOfType(loginPage, JPasswordField.class),
				"Password field should exist on the page.");
	}

	@Test
	void testBackButtonNavigatesToWelcomePage() throws Exception {
		GuiTestHelper.findButtonByText(loginPage, "Back").doClick();
		assertTrue(GuiTestHelper.isCardShowing(app, WelcomePage.class),
				"Back button should navigate to the Welcome page.");
	}

	@Test
	void testBackButtonClearsInputFields() throws Exception {
		usernameField().setText("someUser");
		passwordField().setText("somePass");
		GuiTestHelper.findButtonByText(loginPage, "Back").doClick();
		assertEquals("", usernameField().getText(),
				"Back button should clear the username field.");
		assertEquals("", new String(passwordField().getPassword()),
				"Back button should clear the password field.");
	}

	@Test
	void testLoginAsValidUserNavigatesToUserOptionsPage() throws Exception {
		usernameField().setText(TEST_USER);
		passwordField().setText(TEST_PASS);
		GuiTestHelper.findButtonByText(loginPage, "Login").doClick();
		assertTrue(GuiTestHelper.isCardShowing(app, UserOptionPage.class),
				"Valid user login should navigate to User Options page.");
	}

	@Test
	void testLoginAsValidUserSetsCurrentUser() throws Exception {
		usernameField().setText(TEST_USER);
		passwordField().setText(TEST_PASS);
		GuiTestHelper.findButtonByText(loginPage, "Login").doClick();
		assertNotNull(app.getCurrentUser(),
				"A successful user login should set the current user on AppFrame.");
		assertEquals(TEST_USER, app.getCurrentUser().getUsername(),
				"The logged-in user's username should match the credentials entered.");
	}

	@Test
	void testLoginAsAdminNavigatesToAdministratorOptionsPage() throws Exception {
		usernameField().setText(TEST_ADMIN);
		passwordField().setText(TEST_PASS);
		GuiTestHelper.findButtonByText(loginPage, "Login").doClick();
		assertTrue(GuiTestHelper.isCardShowing(app, AdministratorOptionPage.class),
				"Admin login should navigate to Administrator Options page.");
	}

	@Test
	void testLoginAsAdminSetsCurrentAdministrator() throws Exception {
		usernameField().setText(TEST_ADMIN);
		passwordField().setText(TEST_PASS);
		GuiTestHelper.findButtonByText(loginPage, "Login").doClick();
		assertNotNull(app.getCurrentAdministrator(),
				"A successful admin login should set the current administrator on AppFrame.");
		assertEquals(TEST_ADMIN, app.getCurrentAdministrator().getUsername(),
				"The logged-in admin's username should match the credentials entered.");
	}

	@Test
	void testLoginAsChiefEventCoordinatorNavigatesToCECPage() throws Exception {
		usernameField().setText(TEST_CEC);
		passwordField().setText(TEST_PASS);
		GuiTestHelper.findButtonByText(loginPage, "Login").doClick();
		assertTrue(GuiTestHelper.isCardShowing(app, ChiefEventCoordinatorPage.class),
				"Chief Event Coordinator login should navigate to the CEC page.");
	}

	@Test
	void testLoginWithInvalidCredentialsShowsDialog() throws Exception {
		usernameField().setText("nobody");
		passwordField().setText("wrongPass");
		GuiTestHelper.clickAndDismissDialog(GuiTestHelper.findButtonByText(loginPage, "Login"));
		// Dialog was shown; verify no user was logged in
		assertNull(app.getCurrentUser(),
				"Failed login should not set a current user.");
	}

	@Test
	void testLoginWithInvalidCredentialsClearsFields() throws Exception {
		usernameField().setText("nobody");
		passwordField().setText("wrongPass");
		GuiTestHelper.clickAndDismissDialog(GuiTestHelper.findButtonByText(loginPage, "Login"));
		SwingUtilities.invokeAndWait(() -> {}); // flush EDT so clearFields() completes
		assertEquals("", usernameField().getText(),
				"Username field should be cleared after a failed login attempt.");
		assertEquals("", new String(passwordField().getPassword()),
				"Password field should be cleared after a failed login attempt.");
	}

	@Test
	void testSuccessfulLoginClearsInputFields() throws Exception {
		usernameField().setText(TEST_USER);
		passwordField().setText(TEST_PASS);
		GuiTestHelper.findButtonByText(loginPage, "Login").doClick();
		assertEquals("", usernameField().getText(),
				"Username field should be cleared after a successful login.");
		assertEquals("", new String(passwordField().getPassword()),
				"Password field should be cleared after a successful login.");
	}
}

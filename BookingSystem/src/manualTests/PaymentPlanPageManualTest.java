package manualTests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import javax.swing.JTextField;
import bookingManagment.BookingManager;
import gui.*;
import payment.*;
import userManagement.*;

class PaymentPlanPageManualTest {

	private AppFrame app;
	private PaymentPlanPage page;
	private PaymentPage paymentPageHelper; // used only to access static field via reflection

	private static final String TEST_BK = "PPLAN-TEST-BK001";
	private static final int    USER_ID = 77771;

	@BeforeEach
	void setUp() throws Exception {
		app = AppFrame.getInstance();

		// Set up a current user
		User testUser = UserFactory.createUser(
				"Student", "pplanUser", "Pass123!", "pplan@my.yorku.ca", USER_ID, "777771");
		app.setCurrentUser(testUser);

		// Create an active booking so ExtendBookingPage dropdown is non-empty
		BookingManager.getInstance().cancelBooking(TEST_BK);
		BookingManager.getInstance().createBooking(
				String.valueOf(USER_ID), "CLH-205", TEST_BK, new java.util.Date(), "09:00", "22:59", 0, 0, 20);

		// Populate ExtendBookingPage's static dropdown with that booking
		ExtendBookingPage.refreshBookings(app);

		// Set a valid new end time in ExtendBookingPage's static text field via reflection
		ExtendBookingPage extendHelper = new ExtendBookingPage(app);
		JTextField endTimeField = (JTextField) GuiTestHelper.getPrivateField(extendHelper, "endTimeInputField");
		endTimeField.setText("23:00");

		// Default to "extend" type so button handlers can find a selected booking
		PaymentPage.setTypeOfPayment("extend");

		page = new PaymentPlanPage(app);
		paymentPageHelper = new PaymentPage(app);
	}

	@AfterEach
	void tearDown() {
		BookingManager.getInstance().cancelBooking(TEST_BK);
		app.setCurrentUser(null);
		ExtendBookingPage.clearField();
	}

	// ── tests ─────────────────────────────────────────────────────────────────

	@Test
	void testAllButtonsExist() {
		assertNotNull(GuiTestHelper.findButtonByText(page, "Credit"),
				"Credit button should exist on the page.");
		assertNotNull(GuiTestHelper.findButtonByText(page, "Debit"),
				"Debit button should exist on the page.");
		assertNotNull(GuiTestHelper.findButtonByText(page, "Institutional Billing"),
				"Institutional Billing button should exist on the page.");
		assertNotNull(GuiTestHelper.findButtonByText(page, "Cancel"),
				"Cancel button should exist on the page.");
	}

	@Test
	void testCancelWithBookTypeNavigatesToBookingInformationPage() throws Exception {
		PaymentPage.setTypeOfPayment("book");
		GuiTestHelper.findButtonByText(page, "Cancel").doClick();
		assertTrue(GuiTestHelper.isCardShowing(app, BookingInformationPage.class),
				"Cancel while in 'book' flow should navigate back to Booking Information page.");
	}

	@Test
	void testCancelWithExtendTypeNavigatesToExtendBookingPage() throws Exception {
		PaymentPage.setTypeOfPayment("extend");
		GuiTestHelper.findButtonByText(page, "Cancel").doClick();
		assertTrue(GuiTestHelper.isCardShowing(app, ExtendBookingPage.class),
				"Cancel while in 'extend' flow should navigate back to Extend Booking page.");
	}

	@Test
	void testCreditButtonNavigatesToPaymentPage() throws Exception {
		GuiTestHelper.findButtonByText(page, "Credit").doClick();
		assertTrue(GuiTestHelper.isCardShowing(app, PaymentPage.class),
				"Credit button should navigate to the Payment page.");
	}

	@Test
	void testDebitButtonNavigatesToPaymentPage() throws Exception {
		GuiTestHelper.findButtonByText(page, "Debit").doClick();
		assertTrue(GuiTestHelper.isCardShowing(app, PaymentPage.class),
				"Debit button should navigate to the Payment page.");
	}

	@Test
	void testBillingButtonNavigatesToPaymentPage() throws Exception {
		GuiTestHelper.findButtonByText(page, "Institutional Billing").doClick();
		assertTrue(GuiTestHelper.isCardShowing(app, PaymentPage.class),
				"Institutional Billing button should navigate to the Payment page.");
	}

	@Test
	void testCreditButtonSetsCreditCardPaymentInContext() throws Exception {
		GuiTestHelper.findButtonByText(page, "Credit").doClick();
		Context context = (Context) GuiTestHelper.getPrivateField(paymentPageHelper, "payment");
		assertTrue(context.getPayment() instanceof CreditCardPayment,
				"Clicking Credit should set a CreditCardPayment inside the payment Context.");
	}

	@Test
	void testDebitButtonSetsDebitCardPaymentInContext() throws Exception {
		GuiTestHelper.findButtonByText(page, "Debit").doClick();
		Context context = (Context) GuiTestHelper.getPrivateField(paymentPageHelper, "payment");
		assertTrue(context.getPayment() instanceof DebitCardPayment,
				"Clicking Debit should set a DebitCardPayment inside the payment Context.");
	}

	@Test
	void testBillingButtonSetsInstitutionsBillingInContext() throws Exception {
		GuiTestHelper.findButtonByText(page, "Institutional Billing").doClick();
		Context context = (Context) GuiTestHelper.getPrivateField(paymentPageHelper, "payment");
		assertTrue(context.getPayment() instanceof InstitutionsBilling,
				"Clicking Institutional Billing should set an InstitutionsBilling inside the payment Context.");
	}

	@Test
	void testCreditButtonSetsDepositToZeroForExtendFlow() throws Exception {
		GuiTestHelper.findButtonByText(page, "Credit").doClick();
		Context context = (Context) GuiTestHelper.getPrivateField(paymentPageHelper, "payment");
		// deposit is passed as -1 for extend → calculateDeposit() must return 0
		assertEquals(0.0, context.executeCalculateDeposit(), 0.001,
				"Credit deposit should be 0 for extend booking (deposit flag = -1).");
	}

	@Test
	void testDebitButtonSetsDepositToZeroForExtendFlow() throws Exception {
		GuiTestHelper.findButtonByText(page, "Debit").doClick();
		Context context = (Context) GuiTestHelper.getPrivateField(paymentPageHelper, "payment");
		assertEquals(0.0, context.executeCalculateDeposit(), 0.001,
				"Debit deposit should be 0 for extend booking (deposit flag = -1).");
	}

	@Test
	void testBillingButtonSetsDepositToZeroForExtendFlow() throws Exception {
		GuiTestHelper.findButtonByText(page, "Institutional Billing").doClick();
		Context context = (Context) GuiTestHelper.getPrivateField(paymentPageHelper, "payment");
		assertEquals(0.0, context.executeCalculateDeposit(), 0.001,
				"Billing deposit should be 0 for extend booking (deposit flag = -1).");
	}
}

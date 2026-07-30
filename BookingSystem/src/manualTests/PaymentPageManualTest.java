package manualTests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import javax.swing.JPanel;
import gui.*;
import payment.Context;
import payment.CreditCardPayment;
import payment.DebitCardPayment;
import payment.InstitutionsBilling;

class PaymentPageManualTest {

	private AppFrame app;
	private PaymentPage paymentPage;

	@BeforeEach
	void setUp() {
		app = AppFrame.getInstance();
		paymentPage = new PaymentPage(app);
		// Establish a known starting state for static fields
		PaymentPage.setTypeOfPayment("book");
		PaymentPage.paymentMethod(new CreditCardPayment(20, "9:00", "10:00", "", 0));
	}

	// ── tests ─────────────────────────────────────────────────────────────────

	@Test
	void testCheckoutAndCancelButtonsExist() {
		assertNotNull(GuiTestHelper.findButtonByText(paymentPage, "checkout"),
				"Checkout button should exist on the page.");
		assertNotNull(GuiTestHelper.findButtonByText(paymentPage, "cancel"),
				"Cancel button should exist on the page.");
	}

	@Test
	void testSetPaymentTypeToBook() {
		PaymentPage.setTypeOfPayment("book");
		assertEquals("book", PaymentPage.getPaymentType(),
				"getPaymentType() should return 'book' after setTypeOfPayment('book').");
	}

	@Test
	void testSetPaymentTypeToExtend() {
		PaymentPage.setTypeOfPayment("extend");
		assertEquals("extend", PaymentPage.getPaymentType(),
				"getPaymentType() should return 'extend' after setTypeOfPayment('extend').");
	}

	@Test
	void testSetPaymentTypeToEmptyString() {
		PaymentPage.setTypeOfPayment("");
		assertEquals("", PaymentPage.getPaymentType(),
				"getPaymentType() should return an empty string when set to empty string.");
	}

	@Test
	void testGetPanelReturnsNonNull() {
		assertNotNull(PaymentPage.getPanel(),
				"getPanel() should return a non-null JPanel.");
	}

	@Test
	void testGetPanelReturnsSameInstanceOnMultipleCalls() {
		JPanel first  = PaymentPage.getPanel();
		JPanel second = PaymentPage.getPanel();
		assertSame(first, second,
				"getPanel() should return the same static JPanel instance on every call.");
	}

	@Test
	void testGetPanelContainsCheckoutButton() {
		JPanel panel = PaymentPage.getPanel();
		assertNotNull(GuiTestHelper.findButtonByText(panel, "checkout"),
				"The center panel should contain the checkout button.");
	}

	@Test
	void testCancelButtonNavigatesToPaymentPlanPage() throws Exception {
		GuiTestHelper.findButtonByText(paymentPage, "cancel").doClick();
		assertTrue(GuiTestHelper.isCardShowing(app, PaymentPlanPage.class),
				"Cancel button should navigate back to the Payment Plan page.");
	}

	@Test
	void testPaymentMethodSetsCreditCardContextCorrectly() throws Exception {
		payment.Payment credit = new CreditCardPayment(20, "9:00", "10:00", "", 0);
		PaymentPage.paymentMethod(credit);
		Context context = (Context) GuiTestHelper.getPrivateField(paymentPage, "payment");
		assertNotNull(context, "paymentMethod() should set a non-null Context.");
		// CreditCardPayment: 1 hour at $20/hr + $1.50 fee = $21.50
		assertEquals(21.5, context.executeCalculateCost(), 0.001,
				"Context cost should match CreditCardPayment calculation for 1 hour at $20/hr.");
	}

	@Test
	void testPaymentMethodSetsDebitContextCorrectly() throws Exception {
		payment.Payment debit = new DebitCardPayment(20, "9:00", "10:00", "", 0);
		PaymentPage.paymentMethod(debit);
		Context context = (Context) GuiTestHelper.getPrivateField(paymentPage, "payment");
		// DebitCardPayment: 1 hour at $20/hr + $2.50 fee = $22.50
		assertEquals(22.5, context.executeCalculateCost(), 0.001,
				"Context cost should match DebitCardPayment calculation for 1 hour at $20/hr.");
	}

	@Test
	void testPaymentMethodCanBeOverriddenAfterInitialSet() throws Exception {
		PaymentPage.paymentMethod(new CreditCardPayment(20, "9:00", "10:00", "", 0)); // set first
		PaymentPage.paymentMethod(new InstitutionsBilling(20, "9:00", "10:00", "", 0)); // override
		Context context = (Context) GuiTestHelper.getPrivateField(paymentPage, "payment");
		// InstitutionsBilling: 1 hour at $20/hr + $3.50 fee = $23.50
		assertEquals(23.5, context.executeCalculateCost(), 0.001,
				"The payment method should be replaceable; last set method should be active.");
	}

	@Test
	void testCheckoutWithNoRoomSelectedShowsDialog() throws Exception {
		// RoomOptionsPage.getSelectedRoomID() returns null/empty when nothing is selected,
		// so checkout should immediately show a "No room selected" warning dialog
		GuiTestHelper.clickAndDismissDialog(GuiTestHelper.findButtonByText(paymentPage, "checkout"));
		assertFalse(GuiTestHelper.isCardShowing(app, UserOptionPage.class),
				"Checkout without a selected room should not complete the booking.");
	}
}

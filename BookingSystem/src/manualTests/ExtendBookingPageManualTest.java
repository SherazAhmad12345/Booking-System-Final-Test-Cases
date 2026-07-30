package manualTests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.awt.event.ComponentEvent;
import java.util.Calendar;
import java.util.Date;
import javax.swing.*;
import bookingManagment.Booking;
import bookingManagment.BookingManager;
import gui.*;
import userManagement.*;

class ExtendBookingPageManualTest {

	private AppFrame app;
	private ExtendBookingPage page;

	private static final String BK1 = "EXT-TEST-BK001";
	private static final String BK2 = "EXT-TEST-BK002";
	private static final int    USER_ID = 88881;

	@BeforeEach
	void setUp() {
		app = AppFrame.getInstance();
		// Cancel any leftover bookings from previous runs
		BookingManager.getInstance().cancelBooking(BK1);
		BookingManager.getInstance().cancelBooking(BK2);
		User testUser = UserFactory.createUser(
				"Student", "extendUser", "Pass123!", "extend@my.yorku.ca", USER_ID, "111111");
		app.setCurrentUser(testUser);
		page = new ExtendBookingPage(app);
		ExtendBookingPage.clearField();
	}

	@AfterEach
	void tearDown() {
		BookingManager.getInstance().cancelBooking(BK1);
		BookingManager.getInstance().cancelBooking(BK2);
		app.setCurrentUser(null);
	}

	private void simulateShown() {
		page.dispatchEvent(new ComponentEvent(page, ComponentEvent.COMPONENT_SHOWN));
	}

	// ── tests ─────────────────────────────────────────────────────────────────

	@Test
	void testConfirmAndBackButtonsExist() {
		assertNotNull(GuiTestHelper.findButtonByText(page, "confirm"),
				"Confirm button should exist on the page.");
		assertNotNull(GuiTestHelper.findButtonByText(page, "back"),
				"Back button should exist on the page.");
	}

	@Test
	void testEndTimeInputFieldIsEmptyByDefault() {
		assertEquals("", ExtendBookingPage.endTimeInputField(),
				"End time input should be empty when the page is first created.");
	}

	@Test
	void testClearFieldClearsEndTimeInput() throws Exception {
		JTextField endTimeField = (JTextField) GuiTestHelper.getPrivateField(page, "endTimeInputField");
		endTimeField.setText("15:00");
		ExtendBookingPage.clearField();
		assertEquals("", ExtendBookingPage.endTimeInputField(),
				"clearField() should empty the end time input field.");
	}

	@Test
	void testGetSelectedBookingReturnsNullWhenDropdownIsEmpty() {
		simulateShown(); // no bookings exist for this user
		assertNull(ExtendBookingPage.getSelectedBooking(),
				"getSelectedBooking() should return null when the dropdown has no items.");
	}

	@Test
	void testRefreshBookingsWithNoBookingsLeavesDropdownEmpty() throws Exception {
		simulateShown();
		JComboBox<?> dropdown = (JComboBox<?>) GuiTestHelper.getPrivateField(page, "bookingDropdown");
		assertEquals(0, dropdown.getItemCount(),
				"Dropdown should be empty when the current user has no bookings.");
	}

	@Test
	void testRefreshBookingsPopulatesDropdownWithUserBookings() throws Exception {
		BookingManager.getInstance().createBooking(
				String.valueOf(USER_ID), "CLH-205", BK1, new Date(), "09:00", "11:00", 0, 0, 20);
		simulateShown();
		JComboBox<?> dropdown = (JComboBox<?>) GuiTestHelper.getPrivateField(page, "bookingDropdown");
		assertEquals(1, dropdown.getItemCount(),
				"Dropdown should contain the user's booking after refresh.");
	}

	@Test
	void testRefreshBookingsOnlyShowsCurrentUsersBookings() throws Exception {
		// Booking for the test user
		BookingManager.getInstance().createBooking(
				String.valueOf(USER_ID), "CLH-205", BK1, new Date(), "09:00", "11:00", 0, 0, 20);
		// Booking for a different user
		BookingManager.getInstance().createBooking(
				"99999", "LAS-1001", BK2, new Date(), "09:00", "11:00", 0, 0, 20);
		simulateShown();
		JComboBox<?> dropdown = (JComboBox<?>) GuiTestHelper.getPrivateField(page, "bookingDropdown");
		assertEquals(1, dropdown.getItemCount(),
				"Dropdown should only contain bookings belonging to the current user.");
	}

	@Test
	void testGetSelectedBookingReturnsCorrectBookingAfterRefresh() {
		BookingManager.getInstance().createBooking(
				String.valueOf(USER_ID), "CLH-205", BK1, new Date(), "09:00", "11:00", 0, 0, 20);
		simulateShown();
		Booking selected = ExtendBookingPage.getSelectedBooking();
		assertNotNull(selected, "getSelectedBooking() should return a booking after refresh.");
		assertEquals(BK1, selected.getBookingID(),
				"The returned booking should match the one created for the current user.");
	}

	@Test
	void testBackButtonNavigatesToUserOptions() throws Exception {
		GuiTestHelper.findButtonByText(page, "back").doClick();
		assertTrue(GuiTestHelper.isCardShowing(app, UserOptionPage.class),
				"Back button should navigate to the User Options page.");
	}

	@Test
	void testBackButtonClearsEndTimeField() throws Exception {
		JTextField endTimeField = (JTextField) GuiTestHelper.getPrivateField(page, "endTimeInputField");
		endTimeField.setText("16:00");
		GuiTestHelper.findButtonByText(page, "back").doClick();
		assertEquals("", ExtendBookingPage.endTimeInputField(),
				"Back button should clear the end time input field.");
	}

	@Test
	void testConfirmWithNoBookingShowsDialog() throws Exception {
		app.showCard(AppFrame.CARD_EXTEND_BOOKING); // establish known card state
		simulateShown(); // dropdown remains empty
		GuiTestHelper.clickAndDismissDialog(GuiTestHelper.findButtonByText(page, "confirm"));
		assertFalse(GuiTestHelper.isCardShowing(app, PaymentPlanPage.class),
				"Confirm with no booking selected should not navigate to Payment Plan.");
	}

	@Test
	void testConfirmWithInvalidTimeShowsDialog() throws Exception {
		app.showCard(AppFrame.CARD_EXTEND_BOOKING); // establish known card state
		BookingManager.getInstance().createBooking(
				String.valueOf(USER_ID), "CLH-205", BK1, new Date(), "09:00", "11:00", 0, 0, 20);
		simulateShown();
		JTextField endTimeField = (JTextField) GuiTestHelper.getPrivateField(page, "endTimeInputField");
		endTimeField.setText("notATime");
		GuiTestHelper.clickAndDismissDialog(GuiTestHelper.findButtonByText(page, "confirm"));
		assertFalse(GuiTestHelper.isCardShowing(app, PaymentPlanPage.class),
				"An invalid end time should not navigate to Payment Plan.");
	}

	@Test
	void testConfirmWithExpiredBookingShowsDialog() throws Exception {
		app.showCard(AppFrame.CARD_EXTEND_BOOKING); // establish known card state
		BookingManager.getInstance().createBooking(
				String.valueOf(USER_ID), "CLH-205", BK1, new Date(), "09:00", "10:00", 0, 0, 20);

		// Move the booking's date to yesterday so it is already expired
		Booking booking = BookingManager.getInstance().getBooking(BK1);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		booking.setDate(cal.getTime());

		simulateShown();
		JTextField endTimeField = (JTextField) GuiTestHelper.getPrivateField(page, "endTimeInputField");
		endTimeField.setText("12:00");
		GuiTestHelper.clickAndDismissDialog(GuiTestHelper.findButtonByText(page, "confirm"));
		assertFalse(GuiTestHelper.isCardShowing(app, PaymentPlanPage.class),
				"Confirming an expired booking should not navigate to Payment Plan.");
	}
}

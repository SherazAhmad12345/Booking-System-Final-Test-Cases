package manualTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.event.ComponentEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bookingManagment.Booking;
import bookingManagment.BookingManager;
import gui.AppFrame;
import gui.ScanBadgePage;
import gui.UserOptionPage;
import roomManagement.Room;
import roomManagement.RoomManager;
import userManagement.User;
import userManagement.UserFactory;

public class ScanBadgePageManualTest {

	private static final String TEST_BOOKING_ID = "SCANTEST-BOOKING";

	private RoomManager roomManager = RoomManager.getRoomManagerInstance();
	private BookingManager bookingManager = BookingManager.getInstance();

	@Before
	public void resetRoomsBeforeEachTest() {
		roomManager.resetRooms();
	}

	@After
	public void cleanUpAfterEachTest() {
		bookingManager.cancelBooking(TEST_BOOKING_ID);
		roomManager.resetRooms();
	}

	@SuppressWarnings("unchecked")
	private JComboBox<String> getDropdown(ScanBadgePage page) throws Exception {
		return (JComboBox<String>) GuiTestHelper.getPrivateField(page, "roomDropdown");
	}

	private JLabel getResultLabel(ScanBadgePage page) throws Exception {
		return (JLabel) GuiTestHelper.getPrivateField(page, "resultLabel");
	}

	private void simulateShown(ScanBadgePage page) {
		page.dispatchEvent(new ComponentEvent(page, ComponentEvent.COMPONENT_SHOWN));
	}

	@Test
	public void testDropdownIsEmptyBeforePageIsShown() throws Exception {
		AppFrame app = AppFrame.getInstance();
		ScanBadgePage page = new ScanBadgePage(app);

		assertEquals(0, getDropdown(page).getItemCount());
	}

	@Test
	public void testDropdownPopulatesWithAllRoomsRegardlessOfStatusWhenShown() throws Exception {
		roomManager.disableRoom("LSB-137");

		AppFrame app = AppFrame.getInstance();
		ScanBadgePage page = new ScanBadgePage(app);
		simulateShown(page);

		assertEquals(5, getDropdown(page).getItemCount());
	}

	@Test
	public void testBackButtonNavigatesToUserOptions() throws Exception {
		AppFrame app = AppFrame.getInstance();
		ScanBadgePage page = new ScanBadgePage(app);

		JButton backButton = GuiTestHelper.findButtonByText(page, "Back");
		backButton.doClick();

		assertTrue(GuiTestHelper.isCardShowing(app, UserOptionPage.class));
	}

	@Test
	public void testScanWithNoRoomSelectedShowsNoSuchRoomMessage() throws Exception {
		AppFrame app = AppFrame.getInstance();
		ScanBadgePage page = new ScanBadgePage(app);

		JButton scanButton = GuiTestHelper.findButtonByText(page, "Scan Badge");
		scanButton.doClick();

		assertEquals("No such room.", getResultLabel(page).getText());
	}

	@Test
	public void testScanDeniedWhenNoActiveBookingExists() throws Exception {
		AppFrame app = AppFrame.getInstance();
		ScanBadgePage page = new ScanBadgePage(app);
		simulateShown(page);
		getDropdown(page).setSelectedItem("CLH-205");

		JButton scanButton = GuiTestHelper.findButtonByText(page, "Scan Badge");
		scanButton.doClick();

		assertEquals("Access Denied", getResultLabel(page).getText());
	}

	@Test
	public void testScanGrantsAccessAndChecksInWhenBookingIsCurrentlyActive() throws Exception {
		AppFrame app = AppFrame.getInstance();

		User testUser = UserFactory.createUser("Student", "scanBadgeTestUser", "Str0ng!Pw",
				"scanBadgeTestUser@my.yorku.ca", 909090, "999999999");
		app.setCurrentUser(testUser);

		String userID = String.valueOf(testUser.getId());
		String roomID = "CLH-205";

		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
		Date now = new Date();
		String startTime = timeFormat.format(new Date(now.getTime() - 60_000)); // 1 min ago
		String endTime = timeFormat.format(new Date(now.getTime() + 30 * 60_000)); // 30 min from now

		bookingManager.createBooking(userID, roomID, TEST_BOOKING_ID, now, startTime, endTime, 0, 0, 0);

		ScanBadgePage page = new ScanBadgePage(app);
		simulateShown(page);
		getDropdown(page).setSelectedItem(roomID);

		JButton scanButton = GuiTestHelper.findButtonByText(page, "Scan Badge");
		scanButton.doClick();

		assertEquals("Access Granted - Room now OCCUPIED", getResultLabel(page).getText());

		Booking booking = bookingManager.getBooking(TEST_BOOKING_ID);
		assertTrue(booking.isCheckedIn());

		Room room = roomManager.selectRoomID(roomID);
		assertTrue(room.isOccupied());
	}

	@Test
	public void testScanDeniedWhenBookingExistsButIsNotYetActive() throws Exception {
		AppFrame app = AppFrame.getInstance();

		User testUser = UserFactory.createUser("Student", "scanBadgeTestUser2", "Str0ng!Pw",
				"scanBadgeTestUser2@my.yorku.ca", 909091, "999999998");
		app.setCurrentUser(testUser);

		String userID = String.valueOf(testUser.getId());
		String roomID = "CLH-205";

		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
		Date now = new Date();
		// booking window is two hours from now -- not active yet
		String startTime = timeFormat.format(new Date(now.getTime() + 2 * 60 * 60_000));
		String endTime = timeFormat.format(new Date(now.getTime() + 3 * 60 * 60_000));

		bookingManager.createBooking(userID, roomID, TEST_BOOKING_ID, now, startTime, endTime, 0, 0, 0);

		ScanBadgePage page = new ScanBadgePage(app);
		simulateShown(page);
		getDropdown(page).setSelectedItem(roomID);

		JButton scanButton = GuiTestHelper.findButtonByText(page, "Scan Badge");
		scanButton.doClick();

		assertEquals("Access Denied", getResultLabel(page).getText());
		assertFalse(bookingManager.getBooking(TEST_BOOKING_ID).isCheckedIn());
	}
}
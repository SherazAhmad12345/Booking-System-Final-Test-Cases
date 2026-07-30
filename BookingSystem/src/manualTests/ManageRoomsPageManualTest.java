package manualTests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.awt.event.ComponentEvent;
import javax.swing.JComboBox;
import administratorManagement.Administrator;
import gui.*;
import roomManagement.Room;
import roomManagement.RoomManager;

class ManageRoomsPageManualTest {

	private AppFrame app;
	private ManageRoomsPage page;
	private RoomManager roomManager;

	@BeforeEach
	void setUp() {
		app = AppFrame.getInstance();
		// Reset rooms first so the new Administrator gets the fresh singleton
		RoomManager.getRoomManagerInstance().resetRooms();
		roomManager = RoomManager.getRoomManagerInstance();
		Administrator admin = new Administrator("manageAdmin", "Pass123!", "manage@yorku.ca", 1);
		app.setCurrentAdministrator(admin);
		page = new ManageRoomsPage(app);
	}

	@AfterEach
	void tearDown() {
		RoomManager.getRoomManagerInstance().resetRooms();
		app.setCurrentAdministrator(null);
	}

	private void simulateShown() {
		page.dispatchEvent(new ComponentEvent(page, ComponentEvent.COMPONENT_SHOWN));
	}

	// ── tests ─────────────────────────────────────────────────────────────────

	@Test
	void testAllManagementButtonsExist() {
		assertNotNull(GuiTestHelper.findButtonByText(page, "Enable Room"),
				"Enable Room button should exist.");
		assertNotNull(GuiTestHelper.findButtonByText(page, "Disable Room"),
				"Disable Room button should exist.");
		assertNotNull(GuiTestHelper.findButtonByText(page, "Close Room (Maintenance/Repair)"),
				"Close Room button should exist.");
		assertNotNull(GuiTestHelper.findButtonByText(page, "Finish Maintenance/Repair"),
				"Finish Maintenance/Repair button should exist.");
		assertNotNull(GuiTestHelper.findButtonByText(page, "cancel"),
				"Cancel button should exist.");
	}

	@Test
	void testDropdownIsEmptyBeforePageIsShown() throws Exception {
		@SuppressWarnings("unchecked")
		JComboBox<String> dropdown = (JComboBox<String>) GuiTestHelper.getPrivateField(page, "roomDropdown");
		assertEquals(0, dropdown.getItemCount(),
				"Dropdown should be empty before the page is shown.");
	}

	@Test
	void testDropdownPopulatesWithNonOccupiedRoomsWhenShown() throws Exception {
		simulateShown();
		@SuppressWarnings("unchecked")
		JComboBox<String> dropdown = (JComboBox<String>) GuiTestHelper.getPrivateField(page, "roomDropdown");
		assertEquals(5, dropdown.getItemCount(),
				"Dropdown should contain all 5 default rooms when none are occupied.");
	}

	@Test
	void testAllFiveDefaultRoomsAppearInDropdown() throws Exception {
		simulateShown();
		@SuppressWarnings("unchecked")
		JComboBox<String> dropdown = (JComboBox<String>) GuiTestHelper.getPrivateField(page, "roomDropdown");
		boolean foundCLH = false, foundLAS = false, foundVH = false, foundLSB = false, foundDB = false;
		for (int i = 0; i < dropdown.getItemCount(); i++) {
			String item = dropdown.getItemAt(i);
			if (item.startsWith("CLH-205"))  foundCLH = true;
			if (item.startsWith("LAS-1001")) foundLAS = true;
			if (item.startsWith("VH-1191"))  foundVH  = true;
			if (item.startsWith("LSB-137"))  foundLSB = true;
			if (item.startsWith("DB-1002"))  foundDB  = true;
		}
		assertTrue(foundCLH && foundLAS && foundVH && foundLSB && foundDB,
				"All 5 default rooms should appear in the dropdown.");
	}

	@Test
	void testOccupiedRoomsAreExcludedFromDropdown() throws Exception {
		Room clh = roomManager.selectRoomID("CLH-205");
		clh.setOccupied(true);
		simulateShown();
		@SuppressWarnings("unchecked")
		JComboBox<String> dropdown = (JComboBox<String>) GuiTestHelper.getPrivateField(page, "roomDropdown");
		assertEquals(4, dropdown.getItemCount(),
				"Occupied room should be excluded from the dropdown.");
		for (int i = 0; i < dropdown.getItemCount(); i++) {
			assertFalse(dropdown.getItemAt(i).startsWith("CLH-205"),
					"Occupied room CLH-205 should not appear in the dropdown.");
		}
	}

	@Test
	void testCancelButtonNavigatesToAdministratorOptions() throws Exception {
		GuiTestHelper.findButtonByText(page, "cancel").doClick();
		assertTrue(GuiTestHelper.isCardShowing(app, AdministratorOptionPage.class),
				"Cancel button should navigate to Administrator Options page.");
	}

	@Test
	void testEnableAlreadyEnabledRoomShowsFailureDialog() throws Exception {
		simulateShown(); // CLH-205 is ENABLED at index 0
		GuiTestHelper.clickAndDismissDialog(GuiTestHelper.findButtonByText(page, "Enable Room"));
		assertEquals("ENABLED", roomManager.selectRoomID("CLH-205").getStatus(),
				"Re-enabling an already ENABLED room should have no effect.");
	}

	@Test
	void testDisableRoomSuccessfullyChangesStateToDisabled() throws Exception {
		simulateShown(); // CLH-205 is ENABLED at index 0
		GuiTestHelper.clickAndDismissDialog(GuiTestHelper.findButtonByText(page, "Disable Room"));
		assertEquals("DISABLED", roomManager.selectRoomID("CLH-205").getStatus(),
				"Clicking Disable Room should transition the selected room to DISABLED.");
	}

	@Test
	void testCloseRoomSuccessfullyChangesStateToClosed() throws Exception {
		simulateShown(); // CLH-205 is ENABLED at index 0
		GuiTestHelper.clickAndDismissDialog(
				GuiTestHelper.findButtonByText(page, "Close Room (Maintenance/Repair)"));
		assertEquals("CLOSED", roomManager.selectRoomID("CLH-205").getStatus(),
				"Clicking Close Room should transition the selected room to CLOSED.");
	}

	@Test
	void testFinishMaintenanceOnClosedRoomChangesStateToEnabled() throws Exception {
		// Manually close CLH-205 first
		roomManager.closeRoom("CLH-205");
		simulateShown(); // CLH-205 shows as CLOSED at index 0
		GuiTestHelper.clickAndDismissDialog(
				GuiTestHelper.findButtonByText(page, "Finish Maintenance/Repair"));
		assertEquals("ENABLED", roomManager.selectRoomID("CLH-205").getStatus(),
				"Finishing maintenance on a CLOSED room should transition it back to ENABLED.");
	}

	@Test
	void testEnableDisabledRoomSuccessfully() throws Exception {
		// Manually disable CLH-205 first
		roomManager.disableRoom("CLH-205");
		simulateShown(); // CLH-205 shows as DISABLED at index 0
		GuiTestHelper.clickAndDismissDialog(GuiTestHelper.findButtonByText(page, "Enable Room"));
		assertEquals("ENABLED", roomManager.selectRoomID("CLH-205").getStatus(),
				"Clicking Enable Room on a DISABLED room should transition it to ENABLED.");
	}

	@Test
	void testFinishMaintenanceOnEnabledRoomShowsFailureDialog() throws Exception {
		simulateShown(); // CLH-205 is ENABLED at index 0
		GuiTestHelper.clickAndDismissDialog(
				GuiTestHelper.findButtonByText(page, "Finish Maintenance/Repair"));
		assertEquals("ENABLED", roomManager.selectRoomID("CLH-205").getStatus(),
				"Finishing maintenance on an ENABLED room should have no effect.");
	}
}

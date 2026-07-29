package manualTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.event.ComponentEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gui.AppFrame;
import gui.BookingInformationPage;
import gui.RoomOptionsPage;
import gui.UserOptionPage;
import roomManagement.RoomManager;

public class RoomOptionsPageManualTest {
	private RoomManager roomManager = RoomManager.getRoomManagerInstance();
	
	@Before
	public void resetRoomsBeforeEachTest() {
	roomManager.resetRooms();
	}
	
	@After
	public void resetRoomsAfterEachTest() {
		roomManager.resetRooms();	
	}
	
	@SuppressWarnings("unchecked")
	private JComboBox<String> getDropdown(RoomOptionsPage page) throws Exception {
		return (JComboBox<String>) GuiTestHelper.getPrivateField(page,  "roomDropdown");
	}
	
	private void simulateShown(RoomOptionsPage page) {
		page.dispatchEvent(new ComponentEvent(page, ComponentEvent.COMPONENT_SHOWN));
	}
	
	@Test
	public void testDropdownIsEmptyBeforePageIsShown() throws Exception {
		AppFrame app = AppFrame.getInstance();
		RoomOptionsPage page = new RoomOptionsPage(app);
		
		assertEquals(0, getDropdown(page).getItemCount());
	}
	
	@Test
	public void testDropdownPopulatesWithEnabledRoomsWhenShown() throws Exception {
		AppFrame app = AppFrame.getInstance();
		RoomOptionsPage page = new RoomOptionsPage(app);
		
		simulateShown(page);
		
		JComboBox<String> dropdown = getDropdown(page);
		assertEquals(5, dropdown.getItemCount());
		assertContainsItem(dropdown, "CLH-205");
		assertContainsItem(dropdown, "LAS-1001");
		assertContainsItem(dropdown, "VH-1191");
		assertContainsItem(dropdown, "LSB-137");
		assertContainsItem(dropdown, "DB-1002");
	}
	
	@Test
	public void testDropdownExcludesDisabledOrClosedRooms() throws Exception {
		roomManager.disableRoom("LSB-137");
		
		AppFrame app = AppFrame.getInstance();
		RoomOptionsPage page = new RoomOptionsPage(app);
		simulateShown(page);
		
		JComboBox<String> dropdown = getDropdown(page);
		assertEquals(4, dropdown.getItemCount());
		assertFalse(containsItem(dropdown, "LSB-137"));
		assertContainsItem(dropdown, "CLH-205");
	}
	
	@Test
	public void testConfirmButtonStoresSelectedRoomAndNavigatesToBookingInformation() throws Exception {
		AppFrame app = AppFrame.getInstance();
		RoomOptionsPage page = new RoomOptionsPage(app);
		simulateShown(page);
		getDropdown(page).setSelectedItem("CLH-205");
		
		JButton confirmButton = GuiTestHelper.findButtonByText(page, "confirm");
		confirmButton.doClick();
		
		assertEquals("CLH-205", RoomOptionsPage.getSelectedRoomID());
		assertTrue(GuiTestHelper.isCardShowing(app, BookingInformationPage.class));
	}
	
	@Test
	public void testCancelButtonNavigatesBackToUserOptions() throws Exception {
		AppFrame app = AppFrame.getInstance();
		RoomOptionsPage page = new RoomOptionsPage(app);
		simulateShown(page);
		
		JButton cancelButton = GuiTestHelper.findButtonByText(page, "cancel");
		cancelButton.doClick();		
	}
	
	private void assertContainsItem(JComboBox<String> dropdown, String item) {
		assertTrue("Expected dropdown to contain " + item, containsItem(dropdown, item));
	}
	
	private boolean containsItem(JComboBox<String> dropdown, String item) {
		for (int i = 0; i < dropdown.getItemCount(); i++) {
			if (item.equals(dropdown.getItemAt(i))) {
				return true;
			}
		}
		return false;
	}
}

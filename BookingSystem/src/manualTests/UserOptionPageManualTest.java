package manualTests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import java.awt.Container;
import java.awt.Component;

import javax.swing.JButton;

import org.junit.Test;

import gui.AppFrame;
import gui.CancelBookingPage;
import gui.ExtendBookingPage;
import gui.RoomOptionsPage;
import gui.ScanBadgePage;
import gui.UserOptionPage;
import gui.WelcomePage;

public class UserOptionPageManualTest {
	
	@Test
	public void testAllFiveButtonsExist() {
		AppFrame app = AppFrame.getInstance();
		UserOptionPage page = new UserOptionPage(app);
		
		assertNotNull(GuiTestHelper.findButtonByText(page, "Cancel Booking"));
		assertNotNull(GuiTestHelper.findButtonByText(page, "Extend Booking"));
		assertNotNull(GuiTestHelper.findButtonByText(page, "Book Room"));
		assertNotNull(GuiTestHelper.findButtonByText(page, "Scan Badge (Room Entry)"));
		assertNotNull(GuiTestHelper.findButtonByText(page, "Logout"));
	}
	
	@Test
	public void testExactlyFiveButtonsArePresent() {
		AppFrame app = AppFrame.getInstance();
		UserOptionPage page = new UserOptionPage(app);
		
		assertEquals(5, countButtons(page));
	}
	
	@Test
	public void testAllButtonsAreEnabledByDefault() {
		AppFrame app = AppFrame.getInstance();
		UserOptionPage page = new UserOptionPage(app);
		
		assertTrue(GuiTestHelper.findButtonByText(page, "Cancel Booking").isEnabled());
		assertTrue(GuiTestHelper.findButtonByText(page, "Extend Booking").isEnabled());
		assertTrue(GuiTestHelper.findButtonByText(page, "Book Room").isEnabled());
		assertTrue(GuiTestHelper.findButtonByText(page, "Scan Badge (Room Entry)").isEnabled());
		assertTrue(GuiTestHelper.findButtonByText(page, "Logout").isEnabled());
	}
	
	@Test
	public void testCancelBookingNagivatesToCancelBookingPage() throws Exception {
		AppFrame app = AppFrame.getInstance();
		UserOptionPage page = new UserOptionPage(app);
		
		JButton button = GuiTestHelper.findButtonByText(page, "Cancel Booking");
		button.doClick();
		
		assertTrue(GuiTestHelper.isCardShowing(app, CancelBookingPage.class));
	}
	
	@Test
	public void testExtendBookingButtonNagivatesToExtendBookingPage() throws Exception {
		AppFrame app = AppFrame.getInstance();
		UserOptionPage page = new UserOptionPage(app);
		
		JButton button = GuiTestHelper.findButtonByText(page, "Extend Booking");
		button.doClick();
		
		assertTrue(GuiTestHelper.isCardShowing(app, ExtendBookingPage.class));
	}
	
	@Test
	public void testBookRoomButtonNagivatesToRoomOptionsPage() throws Exception {
		AppFrame app = AppFrame.getInstance();
		UserOptionPage page = new UserOptionPage(app);
		
		JButton button = GuiTestHelper.findButtonByText(page, "Book Room");
		button.doClick();
		
		assertTrue(GuiTestHelper.isCardShowing(app, RoomOptionsPage.class));
	}
	
	@Test
	public void testScanBadgeButtonNagivatesToScanBadgePage() throws Exception {
		AppFrame app = AppFrame.getInstance();
		UserOptionPage page = new UserOptionPage(app);
		
		JButton button = GuiTestHelper.findButtonByText(page, "Scan Badge (Room Entry)");
		button.doClick();
		
		assertTrue(GuiTestHelper.isCardShowing(app, ScanBadgePage.class));
	}
	
	@Test
	public void testLogoutButtonNagivatesToWelcomePage() throws Exception {
		AppFrame app = AppFrame.getInstance();
		UserOptionPage page = new UserOptionPage(app);
		
		JButton button = GuiTestHelper.findButtonByText(page, "Logout");
		button.doClick();
		
		assertTrue(GuiTestHelper.isCardShowing(app, WelcomePage.class));
	}
	
	@Test
	public void testClickingBookRoomDoesNotLeaveLogoutCardShowing() throws Exception {
		AppFrame app = AppFrame.getInstance();
		UserOptionPage page = new UserOptionPage(app);
		
		GuiTestHelper.findButtonByText(page, "Book Room").doClick();
		
		assertFalse(GuiTestHelper.isCardShowing(app, WelcomePage.class));
	}
	
	@Test
	public void testMultipleInstancesEachNavigateCorrectlyOnTheirOwnClick() throws Exception {
		AppFrame app = AppFrame.getInstance();
		UserOptionPage page1 = new UserOptionPage(app);
		UserOptionPage page2 = new UserOptionPage(app);
		
		GuiTestHelper.findButtonByText(page1, "Logout").doClick();
		assertTrue(GuiTestHelper.isCardShowing(app, WelcomePage.class));
		
		GuiTestHelper.findButtonByText(page2, "Scan Badge (Room Entry)").doClick();
		assertTrue(GuiTestHelper.isCardShowing(app, ScanBadgePage.class));	
	}
	
	private int countButtons(Container container) {
		int count = 0;
		for (Component c : container.getComponents()) {
			if (c instanceof JButton) {
				count++;
			}
			if (c instanceof Container) {
				count += countButtons((Container) c);
			}
		}
		return count;
	}
}

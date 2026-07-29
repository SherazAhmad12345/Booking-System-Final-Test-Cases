package manualTests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

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
		
		JButton button = GuiTestHelper.findButtonByText(page, "Boom Booking");
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
}

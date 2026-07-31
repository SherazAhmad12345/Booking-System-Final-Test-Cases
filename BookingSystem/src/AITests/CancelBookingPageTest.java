package AITests;

import static org.junit.Assert.*;

import java.awt.GraphicsEnvironment;

import javax.swing.JComboBox;

import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

import bookingManagment.BookingManager;
import gui.AppFrame;
import gui.CancelBookingPage;
import userManagement.Student;

public class CancelBookingPageTest {
    @Before
    public void resetBookings() {
        AITestSupport.resetBookingManager();
    }

    @Test
    public void buildsCancellationControls() {
        CancelBookingPage page = new CancelBookingPage(null);
        assertNotNull(AITestSupport.findButton(page, "cancel booking"));
        assertNotNull(AITestSupport.findButton(page, "back"));
        assertNotNull(AITestSupport.findComboBox(page));
    }

    @Test
    public void refreshListsOnlyCurrentUsersBookings() {
        Assume.assumeFalse(GraphicsEnvironment.isHeadless());
        AppFrame app = AppFrame.getInstance();
        app.setCurrentUser(new Student("u", "p", "e", 7, "S"));
        BookingManager manager = BookingManager.getInstance();
        manager.createBooking("7", "R1", "B1", AITestSupport.date("2030-01-01 00:00"), "09:00", "10:00", 0, 0, 20);
        manager.createBooking("8", "R1", "B2", AITestSupport.date("2030-01-01 00:00"), "09:00", "10:00", 0, 0, 20);
        CancelBookingPage.refreshBookings(app);
        JComboBox<?> dropdown = AITestSupport.getField(CancelBookingPage.class, "bookingDropdown");
        assertEquals(1, dropdown.getItemCount());
    }
}

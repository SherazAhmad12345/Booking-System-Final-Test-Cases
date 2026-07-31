package AITests;

import static org.junit.Assert.*;

import java.awt.GraphicsEnvironment;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import org.junit.After;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

import bookingManagment.BookingManager;
import gui.AppFrame;
import gui.ExtendBookingPage;
import userManagement.Student;

public class ExtendBookingPageTest {
    @Before
    public void resetBookings() {
        AITestSupport.resetBookingManager();
    }

    @After
    public void clear() {
        ExtendBookingPage.clearField();
    }

    @Test
    public void validatesTimeShapeAndExposesInput() {
        ExtendBookingPage page = new ExtendBookingPage(null);
        assertTrue(AITestSupport.invoke(page, "isValidTime", new Class<?>[] { String.class }, "9:30"));
        assertTrue(AITestSupport.invoke(page, "isValidTime", new Class<?>[] { String.class }, "09:30"));
        assertFalse(AITestSupport.invoke(page, "isValidTime", new Class<?>[] { String.class }, "930"));
        assertFalse(AITestSupport.invoke(page, "isValidTime", new Class<?>[] { String.class }, "bad"));
        assertEquals(Integer.valueOf(570), AITestSupport.invoke(page, "trueTimeValue",
                new Class<?>[] { String.class }, "9:30"));
        JTextField field = AITestSupport.getField(ExtendBookingPage.class, "endTimeInputField");
        field.setText(" 12:00 ");
        assertEquals("12:00", ExtendBookingPage.endTimeInputField());
        ExtendBookingPage.clearField();
        assertEquals("", ExtendBookingPage.endTimeInputField());
    }

    @Test
    public void refreshListsCurrentUsersBookings() {
        Assume.assumeFalse(GraphicsEnvironment.isHeadless());
        AppFrame app = AppFrame.getInstance();
        app.setCurrentUser(new Student("u", "p", "e", 7, "S"));
        BookingManager.getInstance().createBooking("7", "R", "B", AITestSupport.date("2030-01-01 00:00"),
                "09:00", "10:00", 0, 0, 20);
        ExtendBookingPage.refreshBookings(app);
        JComboBox<?> dropdown = AITestSupport.getField(ExtendBookingPage.class, "bookingDropdown");
        assertEquals(1, dropdown.getItemCount());
        assertNotNull(ExtendBookingPage.getSelectedBooking());
    }
}

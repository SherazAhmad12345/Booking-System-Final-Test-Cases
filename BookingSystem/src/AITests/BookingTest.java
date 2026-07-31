package AITests;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import bookingManagment.Booking;

public class BookingTest {
    @Test
    public void storesBookingDetailsAndAllowsEndTimeAndDateUpdates() {
        Date day = AITestSupport.date("2030-06-10 00:00");
        Booking booking = new Booking("U1", "R1", "B1", day, "10:00", "12:00", 20.0, 41.5, 20.0);
        assertEquals("U1", booking.getUserID());
        assertEquals("R1", booking.getRoomID());
        assertEquals("B1", booking.getBookingID());
        assertEquals(day, booking.getDate());
        assertEquals("10:00", booking.getStartTime());
        assertEquals("12:00", booking.getEndTime());
        assertEquals(20.0, booking.getDepositPaid(), 0.001);
        assertEquals(20.0, booking.getHourlyRate(), 0.001);
        assertEquals(41.5, booking.getTotalCost(), 0.001);
        booking.setEndTime("13:00");
        assertEquals("13:00", booking.getEndTime());
        Date changed = AITestSupport.date("2031-01-01 00:00");
        booking.setDate(changed);
        assertEquals(changed, booking.getDate());
    }

    @Test
    public void evaluatesActiveStartedAndExpiredBoundaries() {
        Booking booking = new Booking("U1", "R1", "B1", AITestSupport.date("2030-06-10 00:00"),
                "10:00", "12:00", 0, 0, 20);
        assertFalse(booking.isActiveAt(AITestSupport.date("2030-06-10 09:59")));
        assertTrue(booking.isActiveAt(AITestSupport.date("2030-06-10 10:00")));
        assertTrue(booking.isActiveAt(AITestSupport.date("2030-06-10 12:00")));
        assertFalse(booking.isActiveAt(AITestSupport.date("2030-06-10 12:01")));
        assertFalse(booking.hasStarted(AITestSupport.date("2030-06-10 09:59")));
        assertTrue(booking.hasStarted(AITestSupport.date("2030-06-10 10:00")));
        assertFalse(booking.hasExpired(AITestSupport.date("2030-06-10 12:00")));
        assertTrue(booking.hasExpired(AITestSupport.date("2030-06-10 12:01")));
        assertEquals(AITestSupport.date("2030-06-10 11:30"),
                Booking.combineDateAndTime(booking.getDate(), "11:30"));
    }

    @Test
    public void tracksCheckInAndDepositForfeiture() {
        Booking booking = new Booking("U1", "R1", "B1", AITestSupport.date("2030-06-10 00:00"),
                "10:00", "12:00", 0, 0, 20);
        assertFalse(booking.isCheckedIn());
        assertFalse(booking.isDepositForfeited(AITestSupport.date("2030-06-10 10:30")));
        assertTrue(booking.isDepositForfeited(AITestSupport.date("2030-06-10 10:31")));
        booking.setCheckedIn(true);
        assertTrue(booking.isCheckedIn());
        assertFalse(booking.isDepositForfeited(AITestSupport.date("2030-06-10 15:00")));
        assertTrue(booking.toString().contains("[checked in]"));
    }
}

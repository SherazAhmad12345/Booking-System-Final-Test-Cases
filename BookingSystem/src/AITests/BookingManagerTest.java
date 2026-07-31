package AITests;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import bookingManagment.Booking;
import bookingManagment.BookingManager;

public class BookingManagerTest {
    private BookingManager manager;
    private Date day;

    @Before
    public void setUp() {
        AITestSupport.resetBookingManager();
        manager = BookingManager.getInstance();
        day = AITestSupport.date("2030-07-01 00:00");
    }

    @Test
    public void createsFindsListsExtendsAndCancelsBookings() {
        manager.createBooking("U1", "R1", "B1", day, "09:00", "10:00", 20, 20, 20);
        manager.createBooking("U1", "R2", "B2", day, "11:00", "12:00", 20, 40, 20);
        assertSame(manager, BookingManager.getInstance());
        assertEquals(2, manager.numOfBookings());
        assertEquals("B1", manager.getBooking("B1").getBookingID());
        assertEquals("B1", manager.findBooking("U1", "R1").getBookingID());
        assertNull(manager.findBooking("U2", "R1"));
        assertEquals(2, manager.getBookingsForUser("U1").size());
        assertTrue(manager.getBookingsForUser("missing").isEmpty());
        assertEquals(40, manager.getTotalCost("B2"), 0.001);
        manager.extendBooking("B1", "10:30");
        assertEquals("10:30", manager.getBooking("B1").getEndTime());
        manager.cancelBooking("B2");
        assertNull(manager.getBooking("B2"));
        assertEquals(1, manager.numOfBookings());
    }

    @Test
    public void detectsOverlappingExtensionsOnlyForSameRoom() {
        manager.createBooking("U1", "R1", "B1", day, "09:00", "10:00", 0, 0, 20);
        manager.createBooking("U2", "R1", "B2", day, "11:00", "12:00", 0, 0, 20);
        manager.createBooking("U3", "R2", "B3", day, "10:00", "13:00", 0, 0, 20);
        Booking first = manager.getBooking("B1");
        assertTrue(manager.isRoomAvailableForExtension(first, "11:00"));
        assertFalse(manager.isRoomAvailableForExtension(first, "11:01"));
    }
}

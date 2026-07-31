package AITests;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import bookingManagment.BookingManager;
import roomAccess.Scanner;
import roomManagement.Room;

public class ScannerTest {
    @Before
    public void setUp() {
        AITestSupport.resetBookingManager();
    }

    @Test
    public void grantsAccessOnlyForCurrentBookingAndEnabledRoom() {
        Date now = new Date();
        String day = new SimpleDateFormat("yyyy-MM-dd").format(now);
        Date bookingDate = AITestSupport.date(day + " 00:00");
        Date oneHourBefore = new Date(now.getTime() - 60L * 60L * 1000L);
        Date oneHourAfter = new Date(now.getTime() + 60L * 60L * 1000L);
        String start = new SimpleDateFormat("HH:mm").format(oneHourBefore);
        String end = new SimpleDateFormat("HH:mm").format(oneHourAfter);

        Room room = new Room("R1", 10, "Lab");
        BookingManager.getInstance().createBooking("U1", "R1", "B1", bookingDate, start, end, 0, 0, 20);
        Scanner scanner = new Scanner("S1", room);
        assertEquals("accessGranted", scanner.scanBadge("U1"));
        assertEquals("accessDenied", scanner.scanBadge("U2"));
        assertTrue(scanner.requestEntry("U1"));
        room.disableRoom();
        assertEquals("accessDenied", scanner.scanBadge("U1"));
        assertFalse(scanner.requestEntry("U1"));
    }
}

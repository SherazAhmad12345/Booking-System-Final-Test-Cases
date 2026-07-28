package manualTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import bookingManagment.BookingManager;
import roomManagement.RoomManager;
import roomStatus.ClosedState;
import roomStatus.DisabledState;
import roomStatus.EnabledState;
import roomAccess.Scanner;

public class ScannerManualTest {

	Scanner scanner;
	Scanner scanner1;
	static RoomManager rm;

	@Before
	public void setup() {
		rm = RoomManager.getRoomManagerInstance();
		rm.addRoom("DB", 2, "Data Lab");
		rm.addRoom("DB1", 2, "Data Lab1");
		scanner = new Scanner("scannerID", rm.selectRoomID("DB"));
		scanner1 = new Scanner("scannerID1", rm.selectRoomID("DB1"));
	}

	@AfterClass
	public static void resetRooms() {
		rm.resetRooms();
	}

	// Note, scanBadgeTest already tests verifyUserID() which is called by the
	// scanBadge() method.

	@Test
	public void scanBadgeTest() {
		ZonedDateTime now = ZonedDateTime.now();
		ZonedDateTime startOfDay = now.toLocalDate().atStartOfDay(now.getZone());
		ZonedDateTime endOfDay = startOfDay.plusDays(1).minusMinutes(1); // 23:59 today

		ZonedDateTime startTime1 = now.minusMinutes(1).isBefore(startOfDay) ? startOfDay : now.minusMinutes(1);
		ZonedDateTime endTime = now.plusMinutes(30).isAfter(endOfDay) ? endOfDay : now.plusMinutes(30);
		ZonedDateTime startTime2 = now.plusMinutes(20).isAfter(endOfDay) ? endOfDay : now.plusMinutes(20);

		String end = endTime.format(DateTimeFormatter.ofPattern("HH:mm"));
		String start1 = startTime1.format(DateTimeFormatter.ofPattern("HH:mm"));
		String start2 = startTime2.format(DateTimeFormatter.ofPattern("HH:mm"));

		Date today = new Date();
		BookingManager.getInstance().createBooking("UserID", "DB", "BookingID", today, start1,
				end, 0, 0, 0);
		BookingManager.getInstance().createBooking("UserID1", "DB1", "BookingID1", today, start2, end, 0, 0,
				0);
		assertEquals("scanBadge() returns false when expected true.", "accessGranted", scanner.scanBadge("UserID"));
		assertEquals("scanBadge() returns true when expected false.", "accessDenied", scanner1.scanBadge("UserID1"));
		assertEquals("scanBadge() returns true when expected false.", "accessDenied", scanner.scanBadge("UserID2"));
	}
	
	@Test
	public void requestEntryTest() {
		rm.selectRoomID("DB").setState(new ClosedState());
		assertFalse("Does not deny entry if room is closed.", scanner.requestEntry("UserID"));
		rm.selectRoomID("DB").setState(new DisabledState());
		assertFalse("Does not deny entry if room is disabled.", scanner.requestEntry("UserID"));
		rm.selectRoomID("DB").setState(new EnabledState());
		assertTrue("Does not allow entry if room is enabled.", scanner.requestEntry("UserID"));
	}
}

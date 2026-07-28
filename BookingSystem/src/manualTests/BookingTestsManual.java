package manualTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import bookingManagment.Booking;
import roomManagement.Room;
import roomManagement.RoomManager;

public class BookingTestsManual {

	Booking booking;
	Booking booking2;
	Booking booking3;
	Date date;
	String end1;
	String end2;
	String start1;
	String start2;
	String start3;

	@Before
	public void setUp() {
		ZonedDateTime anchor = ZonedDateTime.now().withHour(12).withMinute(0).withSecond(0).withNano(0);
		date = Date.from(anchor.toInstant());
		ZonedDateTime startTime1 = anchor.minusMinutes(10);
		ZonedDateTime startTime2 = anchor.minusMinutes(60);
		ZonedDateTime startTime3 = anchor.plusMinutes(20);
		ZonedDateTime endTime1 = anchor.plusMinutes(30);
		ZonedDateTime endTime2 = anchor.minusMinutes(10);
		end1 = endTime1.format(DateTimeFormatter.ofPattern("HH:mm"));
		end2 = endTime2.format(DateTimeFormatter.ofPattern("HH:mm"));
		start1 = startTime1.format(DateTimeFormatter.ofPattern("HH:mm"));
		start2 = startTime2.format(DateTimeFormatter.ofPattern("HH:mm"));
		start3 = startTime3.format(DateTimeFormatter.ofPattern("HH:mm"));
		booking = new Booking("userID", "roomID", "bookingID", date, start1, end1, 30, 30, 30);
		booking2 = new Booking("userID2", "roomID2", "bookingID2", date, start2, end2, 30, 30, 30);
		booking3 = new Booking("userID3", "roomID3", "bookingID3", date, start3, end1, 30, 30, 30);
	}
	
	@Test
	public void testGetters() {
		boolean isExpected = false;

		if (booking.getUserID() == "userID" && booking.getRoomID() == "roomID" && booking.getBookingID() == "bookingID"
				&& booking.getDate() == date && booking.getStartTime() == start1 && booking.getEndTime() == end1
				&& booking.getDepositPaid() == 30 && booking.getHourlyRate() == 30 && booking.getTotalCost() == 30) {
			isExpected = true;
		}

		assertTrue("Getters did not return expected values.", isExpected);
	}
	
	@Test
	public void testEndTime()
	{
		booking.setEndTime("14:30");
		assertEquals("End time was not updated after using the setter method.", booking.getEndTime(), "14:30");
	}

	@Test
	public void isActiveNow() {
		assertTrue("Returned false despite booking being currently active.", booking.isActiveAt(date));
		assertFalse("Returned true despite booking having ended.", booking2.isActiveAt(date));
		assertFalse("Returned true despite booking having not started.", booking3.isActiveAt(date));
	}

	@Test
	public void isDepositForfeitedTest() {
		assertTrue("Returned false despite session starting over 30 minutes ago.", booking2.isDepositForfeited(date));
		booking2.setCheckedIn(true);
		assertFalse("Returned true despite already being checked in.", booking2.isDepositForfeited(date));
	}

	@Test
	public void setCheckedInTest() {
		if (!booking.isCheckedIn()) {
			booking.setCheckedIn(true);
			assertTrue("checked in status did not change", booking.isCheckedIn());
		}

		else {
			fail("checked in status is not set to false by default");
		}
	}

	@Test
	public void hasStartedTest() {

		assertTrue("Returned false despite having already started.", booking.hasStarted(date));
		assertFalse("Returned true despite not starting yet.", booking3.hasStarted(date));

	}

	@Test
	public void hasEndedTest() {

		assertTrue("Returned false despite having already ended.", booking2.hasExpired(date));
		assertFalse("Returned true despite having not ended.", booking.hasExpired(date));
	}

	@Test
	public void combineDateAndTimeTest() {
		Date inputDate = new Date();

		Calendar cal = Calendar.getInstance();
		cal.setTime(inputDate);
		cal.set(Calendar.HOUR_OF_DAY, 14);
		cal.set(Calendar.MINUTE, 30);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		Date expectedDate = cal.getTime();
		Date actualDate = Booking.combineDateAndTime(inputDate, "14:30");
		assertEquals(expectedDate, actualDate);
	}

	@Test
	public void toStringTest() {
		String base1 = "roomID" + " on " + new SimpleDateFormat("MM/dd/yy").format(date) + " " + booking.getStartTime() + "-" + booking.getEndTime();
		String status1 = " [checked in]";
		String status2 = " [deposit lost]";
		assertEquals("Does not match expected output.", booking.toString(), base1);
		booking.setCheckedIn(true);
		assertEquals("Does not match expected output.", booking.toString(), base1 + status1);
		booking.setCheckedIn(false);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		Date yesterday = cal.getTime();
		booking2.setDate(yesterday);
		String base2 = "roomID2" + " on " + new SimpleDateFormat("MM/dd/yy").format(yesterday) + " " + booking2.getStartTime() + "-" + booking2.getEndTime();
		assertEquals("Does not match expected output.", booking2.toString(), base2 + status2);
	}
}

package manualTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import bookingManagment.Booking;
import roomManagement.Room;
import roomManagement.RoomManager;

public class BookingTestsManual {

	Booking booking;
	Date date;

	@Before
	public void setUp() {
		date = new Date();
		booking = new Booking("userID", "roomID", "bookingID", date, "3:30", "3:50", 30, 30, 30);
	}
	
	//TODO: Please refer to D3 Document to see what test cases need to be added, and fix the other TODO's below. 

	@Test
	public void testGetters() {
		boolean isExpected = false;

		if (booking.getUserID() == "userID" && booking.getRoomID() == "roomID" && booking.getBookingID() == "bookingID"
				&& booking.getDate() == date && booking.getStartTime() == "3:30" && booking.getEndTime() == "3:50"
				&& booking.getDepositPaid() == 30 && booking.getHourlyRate() == 30 && booking.getTotalCost() == 30) {
			isExpected = true;
		}

		assertTrue("Getters did not return expected values.", isExpected);
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
	public void combineDateAndTimeTest() 
	{
		//TODO: Implement
	}
	
	@Test 
	public void toStringTest()
	{
		String base = "roomID" + " on " + new SimpleDateFormat("MM/dd/yy").format(date) + " " + "3: 30" + "-" + "3: 50";
		String status1 = " [checked in]";
		String status2 = " [deposit lost]";
		
	    booking.setDate(new Date()); //TODO: Adjust Appropriately.	
		assertEquals("Does not match expected output", booking.toString(), base);
		booking.setCheckedIn(true);	
		assertEquals("Does not match expected output", booking.toString(), base + status1);
		booking.setCheckedIn(false);
		booking.setDate(new Date()); //TODO: Adjust Appropriately.	
		assertEquals("Does not match expected output", booking.toString(), base + status2);
	}
}

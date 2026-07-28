package manualTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import bookingManagment.Booking;
import bookingManagment.BookingManager;
import userManagement.UserFactory;

public class BookingManagertManualTest {
	// TODO: Please refer to D3 Document to see what test cases need to be added
	BookingManager bm = BookingManager.getInstance();

	@Before
	public void setup() {
		bm.cancelBooking("bookingID1");
		bm.cancelBooking("bookingID2");
		bm.cancelBooking("bookingID3");
		bm.createBooking("userID1", "roomID1", "bookingID1", new Date(), "13:30", "14:40", 0, 0, 0);
		bm.createBooking("userID1", "roomID2", "bookingID2", new Date(), "13:30", "14:40", 0, 0, 0);
		bm.createBooking("userID2", "roomID1", "bookingID3", new Date(), "15:30", "17:30", 0, 0, 0);
	}

	@Test
	public void testGetters() {
		Booking booking = bm.getBooking("bookingID1");
		assertEquals(booking.getBookingID(), "bookingID1");
		assertEquals(booking.getUserID(), "userID1");
		assertEquals(booking.getRoomID(), "roomID1");
	}

	@Test
	public void findBookingTest() {
		Booking booking = bm.getBooking("bookingID1");
		assertEquals("Did not return expected booking", booking, bm.findBooking("userID1", "roomID1"));
		assertNull("Did not return null.", bm.findBooking("userID2", "roomID2"));
	}

	@Test
	public void getBookingsForUserTest() {
		List<Booking> bookings = new ArrayList<Booking>();
		bookings.add(bm.getBooking("bookingID1"));
		bookings.add(bm.getBooking("bookingID2"));
		assertEquals("Did not return the expected bookings.", bm.getBookingsForUser("userID1"), bookings);
		assertNotEquals("Expected false but returned true.", bm.getBookingsForUser("userID2"), bookings);
	}

	@Test
	public void cancelBookingTest() {
		Booking booking = bm.getBooking("bookingID3");
		assertNotNull("booking was null depsite being created.", booking);
		bm.cancelBooking("bookingID3");
		booking = bm.getBooking("bookingID3");
		assertNull("Book was returned despite being cancelled.", booking);

	}

	@Test
	public void extendBookingTest() {
		bm.extendBooking("bookingID1", "14:50");
		assertEquals("Time was not changed as expected", bm.getBooking("bookingID1").getEndTime(), "14:50");
	}

	@Test
	public void numOfBookingsTest() {
		assertEquals("Number of bookings was not the same as expected.", 3, bm.numOfBookings());
	}

	@Test
	public void getTotalCostTest() {
		assertEquals("total cost was not as expected.", bm.getTotalCost("bookingID1"), 0, 0.01);
	}

	@Test
	public void createBookingTest() {
		assertNotNull(bm.getBooking("bookingID1"));
		assertNotNull(bm.getBooking("bookingID2"));
		assertNotNull(bm.getBooking("bookingID3"));
	}

	@Test
	public void isRoomAvailableForExtensionTest() {
		assertTrue("Booking extension failed despite being available.",
				bm.isRoomAvailableForExtension(bm.getBooking("bookingID1"), "15:00"));
		assertFalse("Booking extension succeeded despite being unavailable.",
				bm.isRoomAvailableForExtension(bm.getBooking("bookingID1"), "16:30"));
	}
}
package bookingManagment;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public final class BookingManager {
	 
	private HashMap<String, Booking> bookings = new HashMap<String, Booking>();
    private static BookingManager bookingManager = new BookingManager();
    private static int numOfBookings = 0;

    private BookingManager() {
    }

    public static BookingManager getInstance()
    {
    	return bookingManager;
    }
    
	public Booking getBooking(String bookingID)
	{
		return bookings.get(bookingID);
	}

	public Booking findBooking(String userID, String roomID)
	{
		for (Booking booking : bookings.values())
		{
			if (booking.getUserID().equals(userID) && booking.getRoomID().equals(roomID))
			{
				return booking;
			}
		}
		return null;
	}

	public List<Booking> getBookingsForUser(String userID)
	{
		List<Booking> result = new ArrayList<Booking>();
		for (Booking booking : bookings.values())
		{
			if (booking.getUserID().equals(userID))
			{
				result.add(booking);
			}
		}
		return result;
	}
	
	public void cancelBooking(String bookingID)
	{
		bookings.remove(bookingID);
	}
	
	public void extendBooking(String bookingID, String endTime)
	{
		bookings.get(bookingID).setEndTime(endTime);
	}

	//checks no other booking on the same room overlaps with the new extended time
	public boolean isRoomAvailableForExtension(Booking booking, String newEndTime)
	{
		Date newStart = Booking.combineDateAndTime(booking.getDate(), booking.getStartTime());
		Date newEnd = Booking.combineDateAndTime(booking.getDate(), newEndTime);

		for (Booking other : bookings.values())
		{
			if (other == booking || !other.getRoomID().equals(booking.getRoomID()))
			{
				continue;
			}

			Date otherStart = Booking.combineDateAndTime(other.getDate(), other.getStartTime());
			Date otherEnd = Booking.combineDateAndTime(other.getDate(), other.getEndTime());

			if (newStart.before(otherEnd) && otherStart.before(newEnd))
			{
				return false;
			}
		}
		return true;
	}
	
	public void createBooking(String userID, String roomID, String bookingID, Date date, String startTime, String endTime, double depositPaid, double totalCost, double hourlyRate)
	{
		bookings.put(bookingID, new Booking(userID, roomID, bookingID, date, startTime, endTime, depositPaid, totalCost, hourlyRate));
	    numOfBookings++;
	}
	
	public int numOfBookings()
	{
		return numOfBookings;
	}
	
	public double getTotalCost(String bookingID)
	{
	   return bookings.get(bookingID).getTotalCost();
	}	
}

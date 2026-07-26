package roomAccess;

import java.util.Date;

import bookingManagment.Booking;
import bookingManagment.BookingManager;
import roomManagement.Room;

public class Scanner implements RoomAccess{
    private String scannerID;
    private Room realRoom;

    public Scanner(String scannerID, Room realRoom) {
        this.scannerID = scannerID;
        this.realRoom = realRoom;
    }

    public String scanBadge(String userID) {
        return verifyUserID(userID, realRoom.getRoomID()) ? "accessGranted" : "accessDenied";
    }

    //Note: This uses real time to determine if user is eligible to occupy room, so for testing, you must make sure that you book the room at the appropriate date and time to gain access to it quickly.
    private boolean verifyUserID(String userID, String roomID) {
        Booking booking = BookingManager.getInstance().findBooking(userID, roomID);
        if (booking == null || !booking.isActiveAt(new Date())) {
            return false;
        }

        return requestEntry(userID);
    }

    @Override
    public boolean requestEntry(String userID) {
        return realRoom.requestEntry(userID); 
    }
}

package roomManagement;

import roomAccess.RoomAccess;
import roomStatus.*;

public class Room implements RoomAccess{
	private final String roomID;
	private final int capacity;
	private final String location;
	private String userID;
	private boolean occupied;

	//Also keeps track of it's state
	private RoomState roomState;

	public Room(String roomID, int capacity, String location)
	{
		//At the start no user is assigned to a room
		this.userID = null;
		this.occupied = false;

		this.roomID = roomID;
		this.capacity = capacity;
		this.location = location;
		this.roomState = new EnabledState(); //Newly created room is Enabled by default
	}
	
	
	public void setState(RoomState roomState)
	{
		this.roomState = roomState;
	}
	
	public void setUser(String userID)
	{
		this.userID = userID;
	}
	
	//No other setters because Room is already created initially
	
	public String getStatus()
	{
		//returns "CLOSED", "DISABLED", "ENABLED"
		return this.roomState.getStatus();
	}

	
	public String getRoomID()
	{
		return this.roomID;
	}

	
	public String getUserId()
	{
		return this.userID;
	}

	public boolean isOccupied()
	{
		return this.occupied;
	}

	public void setOccupied(boolean occupied)
	{
		this.occupied = occupied;
	}

	
	public int getRoomCapacity()
	{
		return this.capacity;
	}

	public String getRoomLocation()
	{
		return this.location;
	}
	
	public boolean closeRoom()
	{
		return roomState.closeRoom(this);
	}
	
	public boolean disableRoom()
	{
		return roomState.disableRoom(this);
	}
	
	public boolean enableRoom()
	{
		return roomState.enableRoom(this);
	}
	
	public boolean maintenanceAndRepairsFinished()
	{
		return roomState.maintenanceAndRepairsFinished(this);
	}

	@Override
	public boolean requestEntry(String userID) {

		return !"CLOSED".equals(getStatus()) && !"DISABLED".equals(getStatus());
	}
	
}

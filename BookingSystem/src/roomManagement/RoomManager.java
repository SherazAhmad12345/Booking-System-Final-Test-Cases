package roomManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import roomMonitoring.RoomObserver;
import roomMonitoring.Sensor;

public class RoomManager implements RoomObserver {
	private static RoomManager instance;

	private List<Room> rooms = new ArrayList<Room>();
	private Map<String, Sensor> sensorsByRoomID = new HashMap<String, Sensor>();

	private RoomManager() {
		//5 rooms are initially available for conference reservations
		addRoom("CLH-205", 25, "Curtis Lecture Hall 205");
		addRoom("LAS-1001", 10, "Lassonde 1001");
		addRoom("VH-1191", 15, "Vari Hall 1191");
		addRoom("LSB-137", 30, "Life Sciences Building 137");
		addRoom("DB-1002", 55, "Victor Philip Dahdaleh Building 1002");
	}

	//Singleton pattern -- Lazy Initialization:
	public static RoomManager getRoomManagerInstance()
	{
		if (instance == null) {
			instance = new RoomManager();
		}
		return instance;
	}

	//See the room the user is assigned to
	public String getAssignedRoomID(String userID)
	{
		for(int i = 0; i < rooms.size(); i++)
		{
			//Incase the userID is null
			if(Objects.equals(rooms.get(i).getUserId(), userID))
			{
				return rooms.get(i).getRoomID();
			}
		}
		
		//If no id exists then notify the user
		return "";
	}
	
	//Gui should ask to type the room id
	public Room selectRoomID(String roomID)
	{
		for(int i = 0; i < rooms.size(); i++)
		{
			if(rooms.get(i).getRoomID().equals(roomID))
			{
				return rooms.get(i);
			}
		}
		
		return null; //Notify that no such room exits
	}
	
	public boolean maintenanceAndRepairsFinished(String roomID)
	{
		Room room = selectRoomID(roomID);
		
		if(room == null)
		{
			//the selectRoomID() method would probably already return
			return false; 
		}
		
		return room.maintenanceAndRepairsFinished();
	}
	
	public boolean addRoom(String roomID, int capacity, String location)
	{
		/** Check if the new room details are valid*/
		if(selectRoomID(roomID) != null || capacity <= 0)
		{
			//Notify to re-enter a valid roomID/capacity/location
			return false;
		}
		
		for(int i = 0; i < rooms.size(); i++)
		{
			if(rooms.get(i).getRoomLocation().equals(location))
			{
				//Notify to re-enter a valid roomID/capacity/location
				return false;
			}
		}
		/** Check if the new room details are valid -- end*/

		Room room = new Room(roomID, capacity, location);
		rooms.add(room);

		//sensor tells RoomManager when the room gets occupied/vacant
		Sensor sensor = new Sensor(roomID + "-SENSOR", room);
		sensor.addObserver(this);
		sensorsByRoomID.put(roomID, sensor);

		return true;
	}

	public Sensor getSensorForRoom(String roomID)
	{
		return sensorsByRoomID.get(roomID);
	}

	@Override
	public void updateOccupancy(Room room, boolean occupied)
	{
		room.setOccupied(occupied);
	}
	
	public boolean closeRoom(String roomID)
	{
		Room room = selectRoomID(roomID);
		
		if(room == null)
		{
			return false; //Gui would already have notified
		}
		
		return room.closeRoom();
	}
	
	
	public boolean disableRoom(String roomID)
	{
		Room room = selectRoomID(roomID);
		
		if(room == null)
		{
			return false; //Gui would already have notified
		}
		
		return room.disableRoom();
	}
	
	public boolean enableRoom(String roomID)
	{
		Room room = selectRoomID(roomID);
		
		if(room == null)
		{
			return false; //Gui would already have notified
		}
		
		return room.enableRoom();
	}


	public boolean roomLocationAlreadyExists(String location)
	{
		for(Room room : rooms)
		{
			if(room.getRoomLocation().equals(location))
			{
				return true;
			}
		}

		return false;
	}

	public List<Room> getAllRooms() {
		return new ArrayList<Room>(this.rooms);
	}


}

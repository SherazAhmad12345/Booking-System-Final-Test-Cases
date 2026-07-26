package roomStatus;

import roomManagement.Room;

//The State interface 
public interface RoomState {
	
	String getStatus();
	
	boolean closeRoom(Room room);
	
	boolean disableRoom(Room room);
	
	boolean enableRoom(Room room);
	
	boolean maintenanceAndRepairsFinished(Room room);
}

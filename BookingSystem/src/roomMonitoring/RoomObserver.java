package roomMonitoring;

import roomManagement.Room;

// observer interface.
// Any class that wants to be notified when room occupancy changes

public interface RoomObserver {
	void updateOccupancy(Room room, boolean occupied);
}
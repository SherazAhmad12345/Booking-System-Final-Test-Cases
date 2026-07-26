package roomStatus;

import roomManagement.Room;

// Concrete State Closed
public class ClosedState implements RoomState{

	@Override
	public String getStatus() {
		return "CLOSED";
	}

	@Override
	public boolean closeRoom(Room room) {
		//Show on the gui that it is already CLOSED
		//Ask to re-enter another room id		
		return false;
	}

	@Override
	public boolean disableRoom(Room room) {
		//Show on the gui that it is already CLOSED so can't disable it
		//Ask to re-enter another room id
		return false;
	}

	@Override
	public boolean enableRoom(Room room) {
		//Show on the gui that it is already CLOSED so can't enable it
		//Ask to re-enter another room id
		return false;
	}

	@Override
	public boolean maintenanceAndRepairsFinished(Room room) {
		//Room can finish maintenance when it was CLOSED, and be ENABLED again
		room.setState(new EnabledState());
		return true;
	}

}

package roomStatus;

import roomManagement.Room;

// Concrete State Enabled
public class EnabledState implements RoomState{

	@Override
	public String getStatus() {
		return "ENABLED";
	}

	@Override
	public boolean closeRoom(Room room) {
		//Room can be CLOSED if room was initially ENABLED
		room.setState(new ClosedState());
		return true;
	}

	@Override
	public boolean disableRoom(Room room) {
		//Room can be DISABLED when it was ENABLED
		room.setState(new DisabledState());
		return true;
	}

	@Override
	public boolean enableRoom(Room room) {
		//Show on the gui that it is already ENABLED
		//Ask to re-enter another room id
		return false;
	}

	@Override
	public boolean maintenanceAndRepairsFinished(Room room) {
		//Show on the gui that an ENABLED room was never under maintenance/repairs
		//Ask to re-enter another room id
		return false;
	}

}

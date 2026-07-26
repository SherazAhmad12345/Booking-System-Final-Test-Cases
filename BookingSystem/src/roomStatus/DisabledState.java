package roomStatus;

import roomManagement.Room;

// Concrete State Disabled
public class DisabledState implements RoomState{


	@Override
	public String getStatus() {
		return "DISABLED";
	}

	@Override
	public boolean closeRoom(Room room) {
		//Room can be CLOSED if it was DISABLED before
		room.setState(new ClosedState());
		return true;
	}

	@Override
	public boolean disableRoom(Room room) {
		//Show on the gui that it is already disabled
		//Ask to re-enter another room id
		return false;
	}

	@Override
	public boolean enableRoom(Room room) {
		//Room can be ENABLED if it was DISABLED before
		room.setState(new EnabledState());
		return true;
	}

	@Override
	public boolean maintenanceAndRepairsFinished(Room room) {
		//Show on the gui that a DISABLED room was never under maintenance/repairs
		//Ask to re-enter another room id
		return false;
	}

}

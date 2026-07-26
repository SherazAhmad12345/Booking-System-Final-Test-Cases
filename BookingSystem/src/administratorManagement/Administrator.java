package administratorManagement;

import java.util.List;

import roomManagement.Room;
import roomManagement.RoomManager;

public class Administrator {

	private RoomManager roomManager;
	private String username;
	private String password;
	private String email;
	private int adminID;
	private boolean chiefEventCoordinator;

	public Administrator(String username, String password, String email, int adminID) {
		this(username, password, email, adminID, false);
	}

	// only one Administrator should ever be flagged as the chief event coordinator
	public Administrator(String username, String password, String email, int adminID, boolean chiefEventCoordinator) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.adminID = adminID;
		this.chiefEventCoordinator = chiefEventCoordinator;

		// Room manager calls the method name that returns the room manager
		roomManager = RoomManager.getRoomManagerInstance();
	}

	public String getUsername() {
		return this.username;
	}

	public String getPassword() {
		return this.password;
	}

	public String getEmail() {
		return this.email;
	}

	public int getAdminID() {
		return this.adminID;
	}

	public boolean isChiefEventCoordinator() {
		return this.chiefEventCoordinator;
	}

	public boolean checkPassword(String attempt) {
		return this.password != null && this.password.equals(attempt);
	}

	public String getAdminType() {
		return "Administrator";
	}

	public String getAssignedRoomID(String userID) {
		return roomManager.getAssignedRoomID(userID);
	}

	public Room selectRoomID(String roomID) {
		return roomManager.selectRoomID(roomID);
	}

	public boolean roomLocationAlreadyExists(String location) {
		return roomManager.roomLocationAlreadyExists(location);
	}

	public List<Room> getAllRooms() {
		return roomManager.getAllRooms();
	}

	public boolean addRoom(String roomID, int capacity, String location) {
		return roomManager.addRoom(roomID, capacity, location);
	}

	public boolean closeRoom(String roomID) {
		return roomManager.closeRoom(roomID);
	}

	public boolean disableRoom(String roomID) {
		return roomManager.disableRoom(roomID);
	}

	public boolean enableRoom(String roomID) {
		return roomManager.enableRoom(roomID);
	}

	public boolean maintenanceAndRepairsFinished(String roomID) {
		return roomManager.maintenanceAndRepairsFinished(roomID);
	}

	@Override
	public String toString() {
		return "Administrator + [username=" + username + ", email=" + email + ", id=" + this.adminID + "]";
	}

}

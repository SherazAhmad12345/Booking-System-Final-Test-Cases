package manualTests;

import org.junit.*;

import administratorManagement.Administrator;
import roomManagement.Room;
import roomManagement.RoomManager;

import static org.junit.Assert.*;

public class AdministratorTestsManual {

	Administrator admin1;
	Administrator admin2;
	static RoomManager rm = RoomManager.getRoomManagerInstance();

	@Before
	public void setUp() {
		admin1 = new Administrator("admin1", "password", "email@yorku.ca", 0, false);
		admin2 = new Administrator("admin2", "password", "email@yorku.ca", 0, false);
	  
	}
	
	@AfterClass
	public static void resetRoomManager()
	{
		rm.resetRooms();
	}

	@Test
	public void gettersTest() {
		boolean isExpected = false;

		if (admin1.getUsername() == "admin1" && admin1.getPassword() == "password"
				&& admin1.getEmail() == "email@yorku.ca" && admin1.getAdminID() == 0
				&& admin1.isChiefEventCoordinator() == false) {
			isExpected = true;
		}

		assertTrue("Getters do not return the expected result", isExpected);
	}

	@Test
	public void sharedRoomManagerInstanceTest() {

		if (admin1.roomLocationAlreadyExists("DB") == false && admin2.roomLocationAlreadyExists("DB") == false) {
			rm.addRoom("DB", 1, "Building");
			assertTrue("Room Manager instance is not shared between Administrator instances.",
					admin1.roomLocationAlreadyExists("Building") && admin2.roomLocationAlreadyExists("Building"));
		}

		else {
			fail("Room Manager instance is not shared between Administrator instances.");
		}
	}

	@Test
	public void passwordAttemptTest() {
		String attempt1 = "wrongpassword";
		String attempt2 = null;
		String attempt3 = "password";

		assertFalse("Password verification incorrect.", admin1.checkPassword(attempt1));
		assertFalse("Password verification incorrect, does not consider null string value.",
				admin1.checkPassword(attempt2));
		assertTrue("Password verifcation inccorect.", admin1.checkPassword(attempt3));
	}

	@Test
	public void addRoomAndSelectRoomIDTest() {

		rm.addRoom("DB2", 2, "Building2");
		Room room = admin1.selectRoomID("DB2");

		assertEquals("room ID of the selected room does not match the expected room ID.", room.getRoomID(), "DB2");
		assertEquals("room capacity of the selected room does not match the expected capacity.", room.getRoomCapacity(),
				2);
		assertEquals("room location of the selected room does not match the expected location.", room.getRoomLocation(),
				"Building2");
	}

	@Test
	public void roomLocationAlreadyExistsTest() {
		rm.addRoom("DB3", 3, "Building3");
		assertTrue("Fails to register that room already exists", admin1.roomLocationAlreadyExists("Building3"));
		assertFalse("Room does not exist yet returned true", admin1.roomLocationAlreadyExists("Building4"));
	}
	
	@Test 
	public void closeRoomTest()
	{
		admin1.closeRoom("DB3");
		Room room = admin1.selectRoomID("DB3");
		assertEquals("Incorrect status.", room.getStatus(), "CLOSED");
		
	}
	
	@Test 
	public void maintenanceAndRepairsFinishedTest()
	{
		admin1.maintenanceAndRepairsFinished("DB3");
		Room room = admin1.selectRoomID("DB3");
		assertEquals("Incorrect status.", room.getStatus(), "ENABLED");
	}
	
	@Test 
	public void disableRoomTest()
	{
		 admin1.disableRoom("DB2");
		 Room room = admin1.selectRoomID("DB2");
		 assertEquals("Incorrect status.", room.getStatus(), "DISABLED");
	}
	
	//TODO: strange issue with this one, not passing test case. 
	@Test 
	public void enableRoomTest()
	{
		admin1.enableRoom("DB2");
		Room room = admin1.selectRoomID("DB2");
		assertEquals("Incorrect status.", room.getStatus(), "ENABLED");
	}
	
	@Test 
	public void toStringTest()
	{
		assertEquals(admin1.toString(),"Administrator + [username=" + "admin1" + ", email=" + "email@yorku.ca" + ", id=" + "0" + "]");
	}
}

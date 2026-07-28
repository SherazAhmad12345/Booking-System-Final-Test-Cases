package manualTests;

import org.junit.*;

import administratorManagement.Administrator;
import roomManagement.Room;
import roomManagement.RoomManager;

import static org.junit.Assert.*;

public class AdministratorManualTest {
	
	@After
	public void cleanUp()
	{
		//Remove rooms that were added in testcases
		RoomManager.getRoomManagerInstance().resetRooms();
	}

	@Test
	public void testAdministratorBigConstructorAndGetters()
	{
		Administrator admin = new Administrator("Sam", "Abc123$#", "sam@yorku.ca", 1, false);
		assertNotNull(admin);
		assertFalse(admin.isChiefEventCoordinator());
		assertEquals("Sam", admin.getUsername());
		assertEquals("Abc123$#", admin.getPassword());
		assertEquals("sam@yorku.ca", admin.getEmail());
		assertEquals("Administrator", admin.getAdminType());
		assertEquals(1, admin.getAdminID());
	}
	
	@Test
	public void testAdministratorSmallConstructorAndGetters()
	{
		Administrator admin = new Administrator("Sam", "Abc123$#", "sam@yorku.ca", 1);
		assertNotNull(admin);
		assertFalse(admin.isChiefEventCoordinator());
		assertEquals("Sam", admin.getUsername());
		assertEquals("Abc123$#", admin.getPassword());
		assertEquals("sam@yorku.ca", admin.getEmail());
		assertEquals("Administrator", admin.getAdminType());
		assertEquals(1, admin.getAdminID());
	}
	
	@Test
	public void testAdministratorHasAllRooms()
	{
		Administrator admin = new Administrator("Sam", "Abc123$#", "sam@yorku.ca", 1);
		assertNotNull(admin);
		
		assertEquals(5, admin.getAllRooms().size());
	}
	
	
	@Test
	public void testPasswordCheck()
	{
		Administrator admin = new Administrator("Sam", "Abc123$#", "sam@yorku.ca", 1);
		
		assertFalse(admin.checkPassword(null));
		assertFalse(admin.checkPassword("Wrong Password"));
		
		assertTrue(admin.checkPassword("Abc123$#"));
	}
	
	@Test
	public void testAdministratorAddRoomWithValidParameters()
	{
		Administrator admin = new Administrator("Sam", "Abc123$#", "sam@yorku.ca", 1);
		assertTrue(admin.addRoom("RR-102", 55, "Random Room 102"));
	}
	
	@Test
	public void testAdministratorAddRoomWithInvalidParameters()
	{
		Administrator admin = new Administrator("Sam", "Abc123$#", "sam@yorku.ca", 1);
		
		//capacity <= 0
		assertFalse(admin.addRoom("RR-102", -1, "Random Room 102"));
		assertFalse(admin.addRoom("RR-102", 0, "Random Room 102"));
		
		//room id already exists; one of the default rooms already has ID LSB-137
		assertFalse(admin.addRoom("LSB-137", 30, "Life Sciences Building 137A"));
		
		//room location already exists; one of the default rooms already has location Life Sciences Building 137
		assertTrue(admin.roomLocationAlreadyExists("Life Sciences Building 137"));
		assertFalse(admin.addRoom("LSB-137A", 30, "Life Sciences Building 137"));
	}
	
	@Test
	public void testSelectIDAfterAddRoom()
	{
		Administrator admin = new Administrator("Sam", "Abc123$#", "sam@yorku.ca", 1);
		assertTrue(admin.addRoom("RR-102", 55, "Random Room 102"));
		
		assertNotNull(admin.selectRoomID("RR-102"));
	}
	
	@Test
	public void testIfAdministratorsHoldSameRoomManagerInstance(){
		Administrator admin = new Administrator("Sam", "Abc123$#", "sam@yorku.ca", 1);
		Administrator admin2 = new Administrator("Bob", "Aaa123$#", "bob@yorku.ca", 2);
		
		assertTrue(admin.addRoom("RR-105", 55, "Random Room 105"));
		
		assertNotNull(admin2.selectRoomID("RR-105"));
	}
	
	@Test 
	public void testGetAssignedRoomID()
	{
		Administrator admin = new Administrator("Sam", "Abc123$#", "sam@yorku.ca", 1);
		
		//If user isn't assigned a room return nothing
		assertEquals("", admin.getAssignedRoomID("Non-existing User"));
		
		//Return roomID based on user
		assertTrue(admin.addRoom("RR-107", 55, "Random Room 107"));
		
		Room room = admin.selectRoomID("RR-107");
		assertNotNull(room);
		
		room.setUser("John");
		
		assertEquals("RR-107", admin.getAssignedRoomID("John"));
	}

	@Test 
	public void toStringTest()
	{
		Administrator admin = new Administrator("Sam", "Abc123$#", "sam@yorku.ca", 1);
		assertEquals(admin.toString(),"Administrator + [username=" + "Sam" + ", email=" + "sam@yorku.ca" + ", id=" + "1" + "]");
	}
	
	@Test
	public void testChangingStateIfRoomDoesntExist()
	{
		Administrator admin = new Administrator("Sam", "Abc123$#", "sam@yorku.ca", 1);
		assertFalse(admin.closeRoom("ID doesn't exist"));
		assertFalse(admin.disableRoom("ID doesn't exist"));
		assertFalse(admin.enableRoom("ID doesn't exist"));
		assertFalse(admin.maintenanceAndRepairsFinished("ID doesn't exist"));
	}
	
	@Test
	public void testChangingStateOfRooms()
	{
		Administrator admin = new Administrator("Sam", "Abc123$#", "sam@yorku.ca", 1);
		
		//Room is enabled at the start so it can't be re-enabled
		assertFalse(admin.enableRoom("LSB-137"));
		
		//Disable an enabled room check and try disabling again
		assertTrue(admin.disableRoom("LSB-137"));
		assertFalse(admin.disableRoom("LSB-137"));
		
		//Same but for closing a disabled room
		assertTrue(admin.closeRoom("LSB-137"));
		assertFalse(admin.closeRoom("LSB-137"));
		
		//Same but for finishing maintenance/repairs
		assertTrue(admin.maintenanceAndRepairsFinished("LSB-137"));
		assertFalse(admin.maintenanceAndRepairsFinished("LSB-137"));
		assertFalse(admin.enableRoom("LSB-137")); //can't enable an enabled room
		
	}
	
}

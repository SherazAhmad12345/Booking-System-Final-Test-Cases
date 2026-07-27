package manualTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import roomManagement.Room;
import roomManagement.RoomManager;

public class RoomManagerManualTest {
	private RoomManager roomManager = RoomManager.getRoomManagerInstance();
	
	@Test
	public void testRoomManagerSingletonPatternInstance()
	{
		//Should be the same RoomManager instance
		RoomManager roomManager2 = RoomManager.getRoomManagerInstance();
		
		assertSame(roomManager, roomManager2);
	}
	
	@Test
	public void testDifferentRoomsList()
	{
		//Method returns a new ArrayList so the list should not be the same.
		List<Room> listOfRooms = roomManager.getAllRooms();
		List<Room> listOfRooms2 = roomManager.getAllRooms();
		assertEquals(5, listOfRooms.size());
		assertEquals(5, listOfRooms2.size());
		assertNotSame(listOfRooms, listOfRooms2);
	}
	
	@Test
	public void testDefaultRoomsByID()
	{
		assertNotNull(roomManager.selectRoomID("CLH-205"));
		assertNotNull(roomManager.selectRoomID("LAS-1001"));
		assertNotNull(roomManager.selectRoomID("VH-1191"));
		assertNotNull(roomManager.selectRoomID("LSB-137"));
		assertNotNull(roomManager.selectRoomID("DB-1002"));
		
		assertNull(roomManager.selectRoomID("Non-existing ID"));
	}
	
	@Test
	public void testDefaultRoomsByLocation()
	{
		assertTrue(roomManager.roomLocationAlreadyExists("Curtis Lecture Hall 205"));
		assertTrue(roomManager.roomLocationAlreadyExists("Lassonde 1001"));
		assertTrue(roomManager.roomLocationAlreadyExists("Vari Hall 1191"));
		assertTrue(roomManager.roomLocationAlreadyExists("Life Sciences Building 137"));
		assertTrue(roomManager.roomLocationAlreadyExists("Victor Philip Dahdaleh Building 1002"));
		
		assertFalse(roomManager.roomLocationAlreadyExists("Non-existing Location"));
	}
	
	
	@Test
	public void testAddingValidRoom()
	{
		assertTrue(roomManager.addRoom("RR-206", 55, "Random Room 206"));
		
		Room randomRoom = roomManager.selectRoomID("RR-206");
		
		assertNotNull(randomRoom);
		assertEquals("RR-206", randomRoom.getRoomID());
		assertEquals(55, randomRoom.getRoomCapacity());
		assertEquals("Random Room 206", randomRoom.getRoomLocation());
		assertEquals("ENABLED", randomRoom.getStatus());
		
		roomManager.resetRooms();
	}
	
	@Test
	public void testAddingInvalidRoomCapacity()
	{
		assertFalse(roomManager.addRoom("RR-206", -5, "Random Room 206"));
		assertFalse(roomManager.addRoom("RR-207", 0, "Random Room 207"));
	}
	
	@Test
	public void testAddingInvalidRoomIDThatAlreadyExists()
	{
		assertFalse(roomManager.addRoom("LSB-137", 30, "Life Sciences Building 137A"));
	}
	
	@Test
	public void testAddingInvalidRoomLocation()
	{
		//Room already exists in that location
		assertFalse(roomManager.addRoom("DB-1002B", 55, "Victor Philip Dahdaleh Building 1002"));
	}
	
	@Test
	public void testChangingStateOfNonExistingRoom()
	{
		assertFalse(roomManager.closeRoom("ID doesn't exist"));
		assertFalse(roomManager.disableRoom("ID doesn't exist"));
		assertFalse(roomManager.enableRoom("ID doesn't exist"));
		assertFalse(roomManager.maintenanceAndRepairsFinished("ID doesn't exist"));
	}
	
	@Test
	public void testChangingStateOfRooms()
	{
	
		//Room is enabled at the start so it can't be re-enabled
		assertFalse(roomManager.enableRoom("LSB-137"));
		
		//Disable an enabled room check and try disabling again
		assertTrue(roomManager.disableRoom("LSB-137"));
		assertFalse(roomManager.disableRoom("LSB-137"));
		
		//Same but for closing a disabled room
		assertTrue(roomManager.closeRoom("LSB-137"));
		assertFalse(roomManager.closeRoom("LSB-137"));
		
		//Same but for finishing maintenance/repairs
		assertTrue(roomManager.maintenanceAndRepairsFinished("LSB-137"));
		assertFalse(roomManager.maintenanceAndRepairsFinished("LSB-137"));
		assertFalse(roomManager.enableRoom("LSB-137")); //can't enable an enabled room
		
	}
	
	@Test 
	public void testGetAssignedRoomId()
	{
		//User isn't assigned to any room yet
		assertEquals("", roomManager.getAssignedRoomID("User doesn't exist"));
		
		//Setting a user to room with ID LSB-137
		Room room = roomManager.selectRoomID("LSB-137");
		room.setUser("Bob");
		roomManager.updateOccupancy(room, true);
		
		assertEquals("LSB-137", roomManager.getAssignedRoomID("Bob"));
		
		roomManager.resetRooms();
	}
}

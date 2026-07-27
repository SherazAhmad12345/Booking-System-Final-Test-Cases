package manualTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import roomManagement.Room;
import roomStatus.*;

public class RoomManualTest {
	
	private Room room;
	
	@Before
	public void setUp() {
		room = new Room("DB-1011", 105, "Victor Philip Dahdaleh Building 1011");
	}
	
	@Test
	public void testGettersWhenRoomCreated()
	{
		assertEquals("DB-1011", room.getRoomID());
		assertEquals(105, room.getRoomCapacity());
		assertEquals("Victor Philip Dahdaleh Building 1011", room.getRoomLocation());
	}
	
	@Test
	public void testDefaultRoomStatus()
	{
		//Newly created rooms should have their state as EnabledState
		assertEquals("ENABLED", room.getStatus());
	}
	
	@Test
	public void testDefaultValueCheck()
	{
		//Newly created room should not be occupied nor have a userID assigned
		assertFalse(room.isOccupied());
		assertNull(room.getUserId());
	}
	
	@Test
	public void testSetUser()
	{
		room.setUser("Bob");
		assertNotNull(room.getUserId());
		assertEquals("Bob", room.getUserId());
	}
	
	@Test
	public void testSetOccupied()
	{
		room.setOccupied(true);
		assertTrue(room.isOccupied());
		
		room.setOccupied(false);
		assertFalse(room.isOccupied());
	}
	
	@Test
	public void testClosedRoomChangingStates()
	{
		//Room is enabled by default 
		assertTrue(room.closeRoom());
		assertEquals("CLOSED", room.getStatus());
		
		//Closed room should not be able to re-close/disable/enable
		assertFalse(room.closeRoom());
		assertEquals("CLOSED", room.getStatus());
		assertFalse(room.disableRoom());
		assertEquals("CLOSED", room.getStatus());
		assertFalse(room.enableRoom());
		assertEquals("CLOSED", room.getStatus());
		
		//Closed room can finish repairs/maintenance and be enabled
		assertTrue(room.maintenanceAndRepairsFinished());
		assertEquals("ENABLED", room.getStatus());
	}
	
	@Test
	public void testDisabledRoomChangingStates()
	{
		//Room is enabled by default 
		assertTrue(room.disableRoom());
		assertEquals("DISABLED", room.getStatus());
		
		//Disabled room should not be able to re-disable or finish maintenance/repairs
		assertFalse(room.disableRoom());
		assertEquals("DISABLED", room.getStatus());
		assertFalse(room.maintenanceAndRepairsFinished());
		assertEquals("DISABLED", room.getStatus());
		
		//Disabled rooms can close
		assertTrue(room.closeRoom());
		assertEquals("CLOSED", room.getStatus());
		
		//Disabled rooms can be enabled
		room.setState(new DisabledState());
		assertTrue(room.enableRoom());
		assertEquals("ENABLED", room.getStatus());
	}
	
	@Test
	public void testEnabledRoomChangingStates()
	{
		//Room is enabled by default and can't re-enable
		//An enabled room can't be re-enabled
		assertFalse(room.enableRoom());
		assertEquals("ENABLED", room.getStatus());
		
		//An enabled room shouldn't finish maintenance/repairs
		assertFalse(room.maintenanceAndRepairsFinished());
		assertEquals("ENABLED", room.getStatus());
		
		//Enabled rooms can disable
		assertTrue(room.disableRoom());
		assertEquals("DISABLED", room.getStatus());
		
		//Enabled rooms can close
		room.setState(new EnabledState());
		assertTrue(room.closeRoom());
		assertEquals("CLOSED", room.getStatus());
	}

	
	@Test 
	public void testRequestEntryWhenRoomNotEnabled()
	{
		//Room is in EnabledState by default
		
		room.setState(new DisabledState());
		assertFalse(room.requestEntry("Bob"));

		room.setState(new ClosedState());
		assertFalse(room.requestEntry("Bob"));
	}
	
	@Test 
	public void testRequestEntryWhenRoomEnabled()
	{
		//Room is in EnabledState by default
		assertTrue(room.requestEntry("Bob"));
	}
	

	
	

}

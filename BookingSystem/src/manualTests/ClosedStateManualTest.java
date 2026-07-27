package manualTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import roomManagement.Room;
import roomStatus.ClosedState;

public class ClosedStateManualTest {
	private Room room; 
	private ClosedState closedState;
	
	@Before
	public void setUp()
	{
		room = new Room("LSB-138", 35, "Life Sciences Building 138"); //Room is always enabled by default
		closedState = new ClosedState();
		room.setState(closedState); //Room is in closed state for this test
		
	}
	

	
	@Test
	public void testStatusIsClosed()
	{
		assertEquals("CLOSED", closedState.getStatus());
		assertEquals("CLOSED", room.getStatus());
	}
	
	@Test
	public void testIfCanRecloseRoom()
	{
		assertFalse(closedState.closeRoom(room));
		assertEquals("CLOSED", room.getStatus());
	}
	
	@Test
	public void testIfCanDisableRoom()
	{
		//Closed room can't be disabled
		assertFalse(closedState.disableRoom(room));
		assertEquals("CLOSED", room.getStatus());
	}
	
	@Test
	public void testIfCanEnableRoom()
	{
		//Closed room can't be enabled
		assertFalse(closedState.enableRoom(room));
		assertEquals("CLOSED", room.getStatus());
	}
	
	@Test
	public void testIfCanFinishMaintenanceAndRepairs()
	{
		//Closed room can be enabled when maintenance or repairs finished
		assertTrue(closedState.maintenanceAndRepairsFinished(room));
		assertEquals("ENABLED", room.getStatus());
	}
	
	
	
	@Test
	public void testRepairThenRecloseRoom()
	{
		//Closed room finishing repairs/maintenance are re-enabled
		assertTrue(closedState.maintenanceAndRepairsFinished(room));
		assertEquals("ENABLED", room.getStatus());
		
		assertTrue(room.closeRoom());
		assertEquals("CLOSED", room.getStatus());
	}
	
	
	@Test
	public void testStatusAfterRepairAndEnable()
	{
		//Closed room finishing repairs/maintenance are re-enabled
		assertTrue(closedState.maintenanceAndRepairsFinished(room));
		assertEquals("ENABLED", room.getStatus());
		
		//Can't re-enable
		assertFalse(room.enableRoom());
		assertEquals("ENABLED", room.getStatus());
	}
	
	
	@Test
	public void testStatusAfterRepairAndDisable()
	{
		//Closed room finishing repairs/maintenance are re-enabled
		assertTrue(closedState.maintenanceAndRepairsFinished(room));
		assertEquals("ENABLED", room.getStatus());
		
		
		assertTrue(room.disableRoom());
		assertEquals("DISABLED", room.getStatus());
	}
	
	@Test
	public void testStatusAfterRepairAndTryToRepairAgain()
	{
		//Closed room finishing repairs/maintenance are re-enabled
		assertTrue(closedState.maintenanceAndRepairsFinished(room));
		assertEquals("ENABLED", room.getStatus());
		
		
		assertFalse(room.maintenanceAndRepairsFinished());
		assertEquals("ENABLED", room.getStatus());
	}
	
	@Test
	public void testingAllTransitionsInClosedState()
	{
		assertFalse(closedState.closeRoom(room));
		assertEquals("CLOSED", room.getStatus());
		assertFalse(closedState.disableRoom(room));
		assertEquals("CLOSED", room.getStatus());
		assertFalse(closedState.enableRoom(room));
		assertEquals("CLOSED", room.getStatus());
		assertTrue(closedState.maintenanceAndRepairsFinished(room));
		assertEquals("ENABLED", room.getStatus());
	}
}

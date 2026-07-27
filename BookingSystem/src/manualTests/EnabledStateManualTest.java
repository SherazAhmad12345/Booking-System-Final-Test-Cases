package manualTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import roomManagement.Room;
import roomStatus.EnabledState;

public class EnabledStateManualTest {
	private Room room; 
	private EnabledState enabledState;
	
	@Before
	public void setUp()
	{
		room = new Room("LSB-138", 35, "Life Sciences Building 138"); //Room is always enabled by default
		enabledState = new EnabledState();
		room.setState(enabledState); //Room is in enabled state for this test
		
	}

	
	@Test
	public void testStatusIsEnabled()
	{
		assertEquals("ENABLED", enabledState.getStatus());
		assertEquals("ENABLED", room.getStatus());
	}
	
	@Test
	public void testIfCanCloseRoom()
	{
		//Enabled rooms can be closed
		assertTrue(enabledState.closeRoom(room));
		assertEquals("CLOSED", room.getStatus());
	}
	
	@Test
	public void testIfDisableRoom()
	{
		//Enabled rooms can be disabled
		assertTrue(enabledState.disableRoom(room));
		assertEquals("DISABLED", room.getStatus());
	}
	
	@Test
	public void testIfCanReEnableRoom()
	{
		//Enabled rooms can't be re-enabled
		assertFalse(enabledState.enableRoom(room));
		assertEquals("ENABLED", room.getStatus());
	}
	
	@Test
	public void testIfCanFinishMaintenanceAndRepairs()
	{
		//Enabled room isn't under maintenance or repairs
		assertFalse(enabledState.maintenanceAndRepairsFinished(room));
		assertEquals("ENABLED", room.getStatus());
	}
	
	
	
	@Test
	public void testStatusAfterDisabledThenRedisable()
	{
		//Disable room
		assertTrue(enabledState.disableRoom(room));
		assertEquals("DISABLED", room.getStatus());
		
		//Try to re-disable
		assertFalse(room.disableRoom());
		assertEquals("DISABLED", room.getStatus());
	}
	
	
	@Test
	public void testStatusAfterDisableThenReEnable()
	{
		assertTrue(enabledState.disableRoom(room));
		assertEquals("DISABLED", room.getStatus());
		
		assertTrue(room.enableRoom());
		assertEquals("ENABLED", room.getStatus());
	}
	
	
	@Test
	public void testStatusAfterCloseThenFinishRepairs()
	{
		//Close an Enabled room
		assertTrue(enabledState.closeRoom(room));
		assertEquals("CLOSED", room.getStatus());
		
		//Finish repairs/maintenance on that room
		assertTrue(room.maintenanceAndRepairsFinished());
		assertEquals("ENABLED", room.getStatus());
	}
	
	@Test
	public void testStatusByEnablingVsDisableThenEnable()
	{
		//Can't enable an already enabled room
		assertFalse(enabledState.enableRoom(room));
		assertEquals("ENABLED", room.getStatus());
		
		//Disable the room
		assertTrue(enabledState.disableRoom(room));
		assertEquals("DISABLED", room.getStatus());
		//A disabled room can be re-enabled
		assertTrue(room.enableRoom());
		assertEquals("ENABLED", room.getStatus());
	}
	
	@Test
	public void testingAllTransitionsInEnabledState()
	{
		assertFalse(enabledState.enableRoom(room));
		assertEquals("ENABLED", room.getStatus());
		
		assertFalse(enabledState.maintenanceAndRepairsFinished(room));
		assertEquals("ENABLED", room.getStatus());
		
		assertTrue(enabledState.disableRoom(room));
		assertEquals("DISABLED", room.getStatus());

		room.setState(enabledState); //Reset to enabledState for testing
		assertEquals("ENABLED", room.getStatus());
		assertTrue(enabledState.closeRoom(room));
		assertEquals("CLOSED", room.getStatus());
		

	}
}

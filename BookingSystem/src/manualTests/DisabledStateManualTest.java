package manualTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import roomManagement.Room;
import roomStatus.DisabledState;

public class DisabledStateManualTest {
	private Room room; 
	private DisabledState disabledState;
	
	@Before
	public void setUp()
	{
		room = new Room("LSB-138", 35, "Life Sciences Building 138"); //Room is always enabled by default
		disabledState = new DisabledState();
		room.setState(disabledState); //Room is in disabled state for this test
		
	}

	
	@Test
	public void testStatusIsDisabled()
	{
		assertEquals("DISABLED", disabledState.getStatus());
		assertEquals("DISABLED", room.getStatus());
	}
	
	@Test
	public void testIfCanCloseRoom()
	{
		//Disabled rooms can be closed
		assertTrue(disabledState.closeRoom(room));
		assertEquals("CLOSED", room.getStatus());
	}
	
	@Test
	public void testIfCanRedisableRoom()
	{
		//Disabled room can't be disabled
		assertFalse(disabledState.disableRoom(room));
		assertEquals("DISABLED", room.getStatus());
	}
	
	@Test
	public void testIfCanEnableRoom()
	{
		//Disabled rooms can be enabled
		assertTrue(disabledState.enableRoom(room));
		assertEquals("ENABLED", room.getStatus());
	}
	
	@Test
	public void testIfCanFinishMaintenanceAndRepairs()
	{
		//Disabled room isn't under maintenance or repairs
		assertFalse(disabledState.maintenanceAndRepairsFinished(room));
		assertEquals("DISABLED", room.getStatus());
	}
	
	
	
	@Test
	public void testStatusAfterEnableThenReEnable()
	{
		//Enable room
		assertTrue(disabledState.enableRoom(room));
		assertEquals("ENABLED", room.getStatus());
		
		//Try to re-enable
		assertFalse(room.enableRoom());
		assertEquals("ENABLED", room.getStatus());
	}
	
	
	@Test
	public void testStatusAfterEnableThenDisable()
	{
		assertTrue(disabledState.enableRoom(room));
		assertEquals("ENABLED", room.getStatus());
		
		assertTrue(room.disableRoom());
		assertEquals("DISABLED", room.getStatus());
	}
	
	
	@Test
	public void testStatusAfterCloseThenFinishRepairs()
	{
		//Close a disabled room
		assertTrue(disabledState.closeRoom(room));
		assertEquals("CLOSED", room.getStatus());
		
		//Finish repairs/maintenance on that room
		assertTrue(room.maintenanceAndRepairsFinished());
		assertEquals("ENABLED", room.getStatus());
	}
	
	@Test
	public void testStatusByRepairVersusEnabling()
	{
		//A Disabled room can't be enabled via repairs/maintenance
		assertFalse(disabledState.maintenanceAndRepairsFinished(room));
		assertEquals("DISABLED", room.getStatus());
		
		//However a disabled room can re-enable directly
		assertTrue(disabledState.enableRoom(room));
		assertEquals("ENABLED", room.getStatus());
	}
	
	@Test
	public void testingAllTransitionsInDisabledState()
	{

		assertFalse(disabledState.disableRoom(room));
		assertEquals("DISABLED", room.getStatus());

		assertFalse(disabledState.maintenanceAndRepairsFinished(room));
		assertEquals("DISABLED", room.getStatus());
		
		assertTrue(disabledState.closeRoom(room));
		assertEquals("CLOSED", room.getStatus());
		
		room.setState(disabledState); //Reset back to DisabledState for testing
		assertEquals("DISABLED", room.getStatus());
		assertTrue(disabledState.enableRoom(room));
		assertEquals("ENABLED", room.getStatus());
	}
}

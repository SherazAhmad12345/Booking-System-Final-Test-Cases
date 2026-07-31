package AITests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import roomManagement.Room;
import roomManagement.RoomManager;
import roomMonitoring.Sensor;

public class RoomManagerTest {
    private RoomManager manager;

    @Before
    public void setUp() {
        manager = AITestSupport.resetRoomManager();
    }

    @Test
    public void singletonStartsWithFiveRoomsAndReturnsDefensiveList() {
        assertSame(manager, RoomManager.getRoomManagerInstance());
        assertEquals(5, manager.getAllRooms().size());
        manager.getAllRooms().clear();
        assertEquals(5, manager.getAllRooms().size());
    }

    @Test
    public void validatesRoomCreationAndLookup() {
        assertTrue(manager.addRoom("AI-200", 12, "AI Wing"));
        assertFalse(manager.addRoom("AI-200", 12, "Other"));
        assertFalse(manager.addRoom("AI-201", 0, "Other"));
        assertFalse(manager.addRoom("AI-201", 12, "AI Wing"));
        Room room = manager.selectRoomID("AI-200");
        assertNotNull(room);
        assertNull(manager.selectRoomID("missing"));
        assertTrue(manager.roomLocationAlreadyExists("AI Wing"));
        assertFalse(manager.roomLocationAlreadyExists("No Place"));
        Sensor sensor = manager.getSensorForRoom("AI-200");
        assertNotNull(sensor);
        assertSame(room, sensor.getRoom());
    }

    @Test
    public void findsAssignmentsChangesStateAndReceivesSensorUpdates() {
        Room room = manager.selectRoomID("CLH-205");
        room.setUser("U9");
        assertEquals("CLH-205", manager.getAssignedRoomID("U9"));
        assertEquals("", manager.getAssignedRoomID("missing"));
        assertFalse(manager.closeRoom("missing"));
        assertFalse(manager.disableRoom("missing"));
        assertFalse(manager.enableRoom("missing"));
        assertFalse(manager.maintenanceAndRepairsFinished("missing"));
        assertTrue(manager.disableRoom("CLH-205"));
        assertTrue(manager.enableRoom("CLH-205"));
        assertTrue(manager.closeRoom("CLH-205"));
        assertTrue(manager.maintenanceAndRepairsFinished("CLH-205"));
        manager.getSensorForRoom("CLH-205").detectMovement();
        assertTrue(room.isOccupied());
        manager.getSensorForRoom("CLH-205").detectVacancy();
        assertFalse(room.isOccupied());
    }
}

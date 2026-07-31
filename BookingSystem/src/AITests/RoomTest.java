package AITests;

import static org.junit.Assert.*;

import org.junit.Test;

import roomManagement.Room;
import roomStatus.DisabledState;

public class RoomTest {
    @Test
    public void exposesImmutableDetailsAndTracksUserAndOccupancy() {
        Room room = new Room("R1", 25, "First Floor");
        assertEquals("R1", room.getRoomID());
        assertEquals(25, room.getRoomCapacity());
        assertEquals("First Floor", room.getRoomLocation());
        assertNull(room.getUserId());
        assertFalse(room.isOccupied());
        room.setUser("U1");
        room.setOccupied(true);
        assertEquals("U1", room.getUserId());
        assertTrue(room.isOccupied());
    }

    @Test
    public void appliesStateTransitionsAndEntryPolicy() {
        Room room = new Room("R1", 25, "First Floor");
        assertEquals("ENABLED", room.getStatus());
        assertTrue(room.requestEntry("any"));
        assertTrue(room.disableRoom());
        assertEquals("DISABLED", room.getStatus());
        assertFalse(room.requestEntry("any"));
        assertTrue(room.enableRoom());
        assertTrue(room.closeRoom());
        assertEquals("CLOSED", room.getStatus());
        assertFalse(room.requestEntry("any"));
        assertTrue(room.maintenanceAndRepairsFinished());
        assertEquals("ENABLED", room.getStatus());
        room.setState(new DisabledState());
        assertEquals("DISABLED", room.getStatus());
    }
}

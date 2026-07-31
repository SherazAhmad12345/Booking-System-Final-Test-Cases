package AITests;

import static org.junit.Assert.*;

import org.junit.Test;

import roomManagement.Room;
import roomStatus.ClosedState;

public class ClosedStateTest {
    @Test
    public void onlyMaintenanceCompletionLeavesClosedState() {
        ClosedState state = new ClosedState();
        Room room = new Room("R", 1, "L");
        room.setState(state);
        assertEquals("CLOSED", state.getStatus());
        assertFalse(state.closeRoom(room));
        assertFalse(state.disableRoom(room));
        assertFalse(state.enableRoom(room));
        assertTrue(state.maintenanceAndRepairsFinished(room));
        assertEquals("ENABLED", room.getStatus());
    }
}

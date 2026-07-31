package AITests;

import static org.junit.Assert.*;

import org.junit.Test;

import roomManagement.Room;
import roomStatus.DisabledState;

public class DisabledStateTest {
    @Test
    public void supportsEnableAndCloseTransitions() {
        DisabledState state = new DisabledState();
        Room room = new Room("R", 1, "L");
        room.setState(state);
        assertEquals("DISABLED", state.getStatus());
        assertFalse(state.disableRoom(room));
        assertFalse(state.maintenanceAndRepairsFinished(room));
        assertTrue(state.enableRoom(room));
        assertEquals("ENABLED", room.getStatus());
        room.setState(state);
        assertTrue(state.closeRoom(room));
        assertEquals("CLOSED", room.getStatus());
    }
}

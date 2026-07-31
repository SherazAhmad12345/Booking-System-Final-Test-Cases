package AITests;

import static org.junit.Assert.*;

import org.junit.Test;

import roomManagement.Room;
import roomStatus.EnabledState;

public class EnabledStateTest {
    @Test
    public void supportsOnlyCloseAndDisableTransitions() {
        EnabledState state = new EnabledState();
        Room room = new Room("R", 1, "L");
        assertEquals("ENABLED", state.getStatus());
        assertFalse(state.enableRoom(room));
        assertFalse(state.maintenanceAndRepairsFinished(room));
        assertTrue(state.disableRoom(room));
        assertEquals("DISABLED", room.getStatus());
        room.setState(state);
        assertTrue(state.closeRoom(room));
        assertEquals("CLOSED", room.getStatus());
    }
}

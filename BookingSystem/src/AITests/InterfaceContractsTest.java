package AITests;

import static org.junit.Assert.*;

import java.util.concurrent.atomic.AtomicBoolean;

import org.junit.Test;

import roomAccess.RoomAccess;
import roomManagement.Room;
import roomMonitoring.RoomObserver;
import roomMonitoring.RoomSubject;
import roomMonitoring.Sensor;
import roomStatus.EnabledState;
import roomStatus.RoomState;

public class InterfaceContractsTest {
    @Test
    public void roomAccessContractCanBeImplemented() {
        RoomAccess access = userID -> "allowed".equals(userID);
        assertTrue(access.requestEntry("allowed"));
        assertFalse(access.requestEntry("denied"));
    }

    @Test
    public void observerAndSubjectContractsWorkThroughSensor() {
        Room room = new Room("R", 1, "L");
        RoomSubject subject = new Sensor("S", room);
        AtomicBoolean notified = new AtomicBoolean();
        RoomObserver observer = (r, occupied) -> notified.set(r == room && occupied);
        subject.addObserver(observer);
        ((Sensor) subject).detectMovement();
        assertTrue(notified.get());
        subject.removeObserver(observer);
    }

    @Test
    public void roomStateContractWorksThroughConcreteState() {
        RoomState state = new EnabledState();
        Room room = new Room("R", 1, "L");
        assertEquals("ENABLED", state.getStatus());
        assertTrue(state.disableRoom(room));
        assertEquals("DISABLED", room.getStatus());
    }
}

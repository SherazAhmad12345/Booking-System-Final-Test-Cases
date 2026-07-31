package AITests;

import static org.junit.Assert.*;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;

import roomManagement.Room;
import roomMonitoring.RoomObserver;
import roomMonitoring.Sensor;

public class SensorTest {
    @Test
    public void tracksOccupancyAndNotifiesObservers() {
        Room room = new Room("R1", 10, "Lab");
        Sensor sensor = new Sensor("S1", room);
        AtomicInteger calls = new AtomicInteger();
        AtomicBoolean last = new AtomicBoolean();
        RoomObserver observer = (updatedRoom, occupied) -> {
            assertSame(room, updatedRoom);
            calls.incrementAndGet();
            last.set(occupied);
        };
        sensor.addObserver(observer);
        assertFalse(sensor.detectOccupancy());
        sensor.detectMovement();
        assertTrue(sensor.detectOccupancy());
        assertTrue(last.get());
        sensor.detectVacancy();
        assertFalse(sensor.detectOccupancy());
        assertFalse(last.get());
        sensor.sendData(true);
        assertEquals(3, calls.get());
        sensor.removeObserver(observer);
        sensor.sendData(false);
        assertEquals(3, calls.get());
        assertEquals("S1", sensor.getSensorID());
        assertSame(room, sensor.getRoom());
    }
}

package roomMonitoring;

import java.util.ArrayList;
import java.util.List;

import roomManagement.Room;

// the sensor is the subject in the observer pattern.
// it detects occupancy changes and notifies observers like RoomManager.
public class Sensor implements RoomSubject {

	private String sensorID;
	private Room room;
	private boolean occupied;

	//list of observers that want updates from this sensor.
	private List<RoomObserver> observers;

	public Sensor(String sensorID, Room room) {
		this.sensorID = sensorID;
		this.room = room;
		this.occupied = false;
		this.observers = new ArrayList<RoomObserver>();
	}

	//returns current occupancy value detected by the sensor.
	public boolean detectOccupancy() {
		return occupied;
	}

	//simulates movement detected in the room. After changing occupancy, it notifies all observers.
	public void detectMovement() {
		this.occupied = true;
		notifyObservers();
	}

	//no movement, indicates room becoming vacant.
	public void detectVacancy() {
		this.occupied = false;
		notifyObservers();
	}

	//used by GUI or test code to send sensor data manually.
	public void sendData(boolean occupied) {
		this.occupied = occupied;
		notifyObservers();
	}

	@Override
	public void addObserver(RoomObserver observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(RoomObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (RoomObserver observer : observers) {
			observer.updateOccupancy(room, occupied);
		}
	}

	public String getSensorID() {
		return sensorID;
	}

	public Room getRoom() {
		return room;
	}
}
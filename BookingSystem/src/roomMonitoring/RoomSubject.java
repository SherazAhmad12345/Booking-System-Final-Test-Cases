package roomMonitoring;

// Subject interface.
// sensor will implement this because it is the object being observed.
public interface RoomSubject {
	void addObserver(RoomObserver observer);
	void removeObserver(RoomObserver observer);
	void notifyObservers();
}
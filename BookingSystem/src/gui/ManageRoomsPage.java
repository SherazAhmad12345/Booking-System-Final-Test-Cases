package gui;

import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import roomManagement.Room;
import roomManagement.RoomManager;

public class ManageRoomsPage extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel manageRoomsPanel = new JPanel();
	private JLabel inputLabel = new JLabel("Select a Room to Manage:", JLabel.CENTER);
	private JButton enableRoom = new JButton("Enable Room");
	private JButton disableRoom = new JButton("Disable Room");
	private JButton closeRoom = new JButton("Close Room (Maintenance/Repair)");
	private JButton finishMaintenance = new JButton("Finish Maintenance/Repair");
	private JButton cancel = new JButton("cancel");
	private JComboBox<String> roomDropdown = new JComboBox<>();
	private List<Room> rooms = new ArrayList<>();
	private JPanel centerComponentPanel = new JPanel(new GridLayout(0, 1, 5, 5));
	private JPanel layoutKeeper = new JPanel(new GridBagLayout());

	public ManageRoomsPage(AppFrame app) {
		setLayout(new GridBagLayout());

		roomDropdown.setFont(new Font("Arial", Font.PLAIN, 18));
		roomDropdown.setMaximumRowCount(5);

		// Add to center panel
		centerComponentPanel.add(inputLabel);
		centerComponentPanel.add(roomDropdown);
		centerComponentPanel.add(enableRoom);
		centerComponentPanel.add(disableRoom);
		centerComponentPanel.add(closeRoom);
		centerComponentPanel.add(finishMaintenance);
		centerComponentPanel.add(cancel);

		// Adds borders
		centerComponentPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		layoutKeeper.add(centerComponentPanel); // GridBagLayout defaults to centering things at their natural size
		manageRoomsPanel.add(layoutKeeper);
		add(manageRoomsPanel);

		// Refresh the room list every time this card is shown
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				refreshRooms();
			}
		});

		cancel.addActionListener(e -> app.showCard(AppFrame.CARD_ADMINISTRATOR_OPTIONS));
		enableRoom.addActionListener(e -> handleRoomEnabling(app));
		disableRoom.addActionListener(e -> handleRoomDisabling(app));
		closeRoom.addActionListener(e -> handleRoomClosing(app));
		finishMaintenance.addActionListener(e -> handleMaintenanceFinished(app));
	}

	private void refreshRooms() {
		roomDropdown.removeAllItems();
		List<Room> everyRoom = RoomManager.getRoomManagerInstance().getAllRooms();
		
		rooms = new ArrayList<>();
		
		
		for (Room room : everyRoom) {
			if(room.isOccupied()) {
				continue; //Skip occupied rooms
			}
			
			rooms.add(room); //Add rooms that aren't occupied
			
			roomDropdown.addItem(room.getRoomID() + " (" + room.getStatus() + ")");
		}
	}

	private Room getSelectedRoom() {
		int index = roomDropdown.getSelectedIndex();
		if (index < 0 || index >= rooms.size()) {
			return null;
		}
		return rooms.get(index);
	}

	private void handleRoomEnabling(AppFrame app) {
		Room room = getSelectedRoom();
		if (room == null) {
			return;
		}
		boolean success = app.getCurrentAdministrator().enableRoom(room.getRoomID());
		notifyResult(success, "Room enabled.", "Room could not be enabled from its current status (if room is already enabled or closed for maintenance/repair)");
	}
	

	private void handleRoomDisabling(AppFrame app) {
		Room room = getSelectedRoom();
		if (room == null) {
			return;
		}
	
		boolean success = app.getCurrentAdministrator().disableRoom(room.getRoomID());
		notifyResult(success, "Room disabled.", "Room could not be disabled from its current status (if room is already disabled or closed for maintenance/repair).");
	}

	private void handleRoomClosing(AppFrame app) {
		Room room = getSelectedRoom();
		if (room == null) {
			return;
		}
		boolean success = app.getCurrentAdministrator().closeRoom(room.getRoomID());
		notifyResult(success, "Room closed for maintenance/repair.", "Room could not be closed from its current status (if room is already closed for maintenance/repair)");
	}

	private void handleMaintenanceFinished(AppFrame app) {
		Room room = getSelectedRoom();
		if (room == null) {
			return;
		}
		boolean success = app.getCurrentAdministrator().maintenanceAndRepairsFinished(room.getRoomID());
		notifyResult(success, "Maintenance/repair finished, room is now enabled.",
				"Room is not currently closed for maintenance/repair.");
	}

	private void notifyResult(boolean success, String successMessage, String failureMessage) {
		JOptionPane.showMessageDialog(this, success ? successMessage : failureMessage);
		refreshRooms();
	}
}

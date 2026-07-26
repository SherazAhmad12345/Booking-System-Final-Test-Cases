package gui;

import java.awt.BorderLayout;

import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import bookingManagment.Booking;
import bookingManagment.BookingManager;
import roomManagement.Room;
import roomManagement.RoomManager;
import roomAccess.Scanner;

public class ScanBadgePage extends JPanel {

	private static final long serialVersionUID = 1L;

	private JPanel scanBadgePanel = new JPanel(new BorderLayout());
	private JLabel instructionLabel = new JLabel("Select the room's door scanner:", JLabel.CENTER);
	private JLabel resultLabel = new JLabel(" ", JLabel.CENTER);
	private JComboBox<String> roomDropdown = new JComboBox<>();
	private JButton scan = new JButton("Scan Badge");
	private JButton back = new JButton("Back");
	private JPanel centerPanel = new JPanel(new GridLayout(0, 1, 5, 5));
	private JPanel layoutKeeper = new JPanel(new GridBagLayout());

	public ScanBadgePage(AppFrame app) {
		setLayout(new GridBagLayout());

		roomDropdown.setFont(new Font("Arial", Font.PLAIN, 18));
		roomDropdown.setMaximumRowCount(5);

		centerPanel.add(instructionLabel);
		centerPanel.add(roomDropdown);
		centerPanel.add(scan);
		centerPanel.add(resultLabel);
		centerPanel.add(back);

		centerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		layoutKeeper.add(centerPanel);
		scanBadgePanel.add(layoutKeeper);
		add(scanBadgePanel);

		// Refresh the room list and clear the last result every time this card is shown.
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				resultLabel.setText(" ");
				refreshRooms();
			}
		});

		back.addActionListener(e -> app.showCard(AppFrame.CARD_USER_OPTIONS));
		scan.addActionListener(e -> handleScan(app));
	}

	private void refreshRooms() {
		roomDropdown.removeAllItems();
		List<Room> rooms = RoomManager.getRoomManagerInstance().getAllRooms();
		for (Room room : rooms) {
			roomDropdown.addItem(room.getRoomID());
		}
	}

	private void handleScan(AppFrame app) {
		String roomID = (String) roomDropdown.getSelectedItem();
		Room room = roomID == null ? null : RoomManager.getRoomManagerInstance().selectRoomID(roomID);
		if (room == null) {
			resultLabel.setText("No such room.");
			return;
		}

		String userID = String.valueOf(app.getCurrentUser().getId());
		Scanner scanner = new Scanner("SCANNER-" + roomID, room);
		String result = scanner.scanBadge(userID);

		if ("accessGranted".equals(result)) {
			// let the room's sensor know someone walked in
			RoomManager.getRoomManagerInstance().getSensorForRoom(roomID).detectMovement();

			// mark the booking as checked in so the deposit isn't lost
			Booking booking = BookingManager.getInstance().findBooking(userID, roomID);
			if (booking != null) {
				booking.setCheckedIn(true);
			}

			resultLabel.setText("Access Granted - Room now OCCUPIED");
		} else {
			resultLabel.setText("Access Denied");
		}
	}
}

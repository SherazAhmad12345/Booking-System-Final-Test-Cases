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

import roomManagement.Room;
import roomManagement.RoomManager;

public class RoomOptionsPage extends JPanel {

	private static final long serialVersionUID = 1L;
	private static String selectedRoomID;

	private static JPanel selectRoomPanel = new JPanel(new BorderLayout());
	private JLabel instructionLabel = new JLabel("Select a Room:", JLabel.CENTER);
	private JButton confirm = new JButton("confirm");
	private JButton cancel = new JButton("cancel");
	private JComboBox<String> roomDropdown = new JComboBox<>();
	private JPanel centerPanel = new JPanel(new GridLayout(4, 1, 0, 10));
	private JPanel layoutKeeper = new JPanel(new GridBagLayout());

	public RoomOptionsPage(AppFrame app) {
		setLayout(new GridBagLayout());

		// Creates drown down menu from room choices
		roomDropdown.setFont(new Font("Arial", Font.PLAIN, 18));
		roomDropdown.setMaximumRowCount(5);

		// Add to center panel
		centerPanel.add(instructionLabel);
		centerPanel.add(roomDropdown);
		centerPanel.add(confirm);
		centerPanel.add(cancel);

		// Adds borders
		centerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		// Place the panel right in the center of the page
		layoutKeeper.add(centerPanel); // GridBagLayout defaults to centering things at their natural size
		selectRoomPanel.add(layoutKeeper);
		add(selectRoomPanel);

		// refresh room list each time this page is shown
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				refreshRooms();
			}
		});

		// button action listeners
		cancel.addActionListener(e -> handleCancelButton(app));
		confirm.addActionListener(e -> {
			selectedRoomID = (String) roomDropdown.getSelectedItem();
			app.showCard(AppFrame.CARD_BOOKING_INFORMATION);
		});
	}
	
	private void handleCancelButton(AppFrame app) {
		app.clearAllFields(BookingInformationPage.getPanel());
		app.clearAllFields(PaymentPage.getPanel());
		app.showCard(AppFrame.CARD_USER_OPTIONS);
	}

	private void refreshRooms() {
		roomDropdown.removeAllItems();
		List<Room> rooms = RoomManager.getRoomManagerInstance().getAllRooms();
		for (Room room : rooms) {
			if ("ENABLED".equals(room.getStatus())) {
				roomDropdown.addItem(room.getRoomID());
			}
		}
	}

	public static String getSelectedRoomID() {
		return selectedRoomID;
	}
}

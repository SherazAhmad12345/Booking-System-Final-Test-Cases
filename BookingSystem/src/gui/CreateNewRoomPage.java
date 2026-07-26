package gui;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateNewRoomPage extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel createNewRoomPanel = new JPanel();
	private JButton createRoom = new JButton("Create Room");
	private JButton cancel = new JButton("cancel");
	private JPanel centerComponentPanel = new JPanel(new GridLayout(0, 1, 5, 5));
	private JPanel layoutKeeper = new JPanel(new GridBagLayout());
	private JTextField createRoomIDInputField = new JTextField(15);
	private JTextField roomLocationInputField = new JTextField(15);
	private JTextField roomCapacityInputField = new JTextField(15);
	private JLabel inputLabel1 = new JLabel("Create Room ID:", JLabel.CENTER);
	private JLabel inputLabel2 = new JLabel("Room Location:", JLabel.CENTER);
	private JLabel inputLabel3 = new JLabel("Room Capacity:", JLabel.CENTER);

	public CreateNewRoomPage(AppFrame app) {
		setLayout(new GridBagLayout());

		// Add to center panel
		centerComponentPanel.add(inputLabel1);
		centerComponentPanel.add(createRoomIDInputField);
		centerComponentPanel.add(inputLabel2);
		centerComponentPanel.add(roomLocationInputField);
		centerComponentPanel.add(inputLabel3);
		centerComponentPanel.add(roomCapacityInputField);
		centerComponentPanel.add(createRoom);
		centerComponentPanel.add(cancel);

		// Adds borders
		centerComponentPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		layoutKeeper.add(centerComponentPanel); // GridBagLayout defaults to centering things at their natural size
		createNewRoomPanel.add(layoutKeeper);
		add(createNewRoomPanel);

		// button action listeners
		cancel.addActionListener(e -> app.showCard(AppFrame.CARD_ADMINISTRATOR_OPTIONS));
		createRoom.addActionListener(e -> handleRoomCreation(app));
	}

	private void handleRoomCreation(AppFrame app) {
		String roomID = createRoomIDInputField.getText().trim();
		String location = roomLocationInputField.getText().trim();

		if (roomID.isEmpty() || location.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Missing info",
					JOptionPane.WARNING_MESSAGE);
			return;
		}

		int capacity;
		try {
			capacity = Integer.parseInt(roomCapacityInputField.getText().trim());
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this, "Enter a valid whole number for capacity.", "Invalid capacity",
					JOptionPane.WARNING_MESSAGE);
			return;
		}

		boolean created = app.getCurrentAdministrator().addRoom(roomID, capacity, location);
		if (!created) {
			JOptionPane.showMessageDialog(this,
					"Could not create room. The room ID/location may already be in use, or capacity must be positive.",
					"Room creation failed", JOptionPane.WARNING_MESSAGE);
			return;
		}

		JOptionPane.showMessageDialog(this, "Room created!");
		clearFields();
		app.showCard(AppFrame.CARD_ADMINISTRATOR_OPTIONS);
	}

	private void clearFields() {
		createRoomIDInputField.setText("");
		roomLocationInputField.setText("");
		roomCapacityInputField.setText("");
	}
}

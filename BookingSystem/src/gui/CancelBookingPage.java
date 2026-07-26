package gui;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import bookingManagment.Booking;
import bookingManagment.BookingManager;
import roomManagement.RoomManager;

import java.util.Date;

public class CancelBookingPage extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel cancelBookingPanel = new JPanel(new BorderLayout());
	private JLabel inputLabel = new JLabel("Select a booking to cancel:", JLabel.CENTER);
	private static JComboBox<Booking> bookingDropdown = new JComboBox<>();
	private JButton enter = new JButton("cancel booking");
	private JButton cancel = new JButton("back");
	private JPanel centerComponentPanel = new JPanel(new GridLayout(0, 1, 5, 5));
	private JPanel layoutKeeper = new JPanel(new GridBagLayout());

	public CancelBookingPage(AppFrame app) {
		setLayout(new GridBagLayout());

		// Add to center panel
		centerComponentPanel.add(inputLabel);
		centerComponentPanel.add(bookingDropdown);
		centerComponentPanel.add(enter);
		centerComponentPanel.add(cancel);

		// Adds borders
		centerComponentPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		layoutKeeper.add(centerComponentPanel); // GridBagLayout defaults to centering things at their natural size
		cancelBookingPanel.add(layoutKeeper);
		add(cancelBookingPanel);

		// Refresh the booking list every time this card is shown
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				refreshBookings(app);
			}
		});

		// button action listeners
		cancel.addActionListener(e -> handleCancelButton(app));
		enter.addActionListener(e -> handleCancellation(app));
	}

	public static void refreshBookings(AppFrame app) {
		bookingDropdown.removeAllItems();
		String userID = String.valueOf(app.getCurrentUser().getId());
		for (Booking booking : BookingManager.getInstance().getBookingsForUser(userID)) {
			bookingDropdown.addItem(booking);
		}
	}
	
	private void handleCancelButton(AppFrame app) {
		app.clearAllFields(centerComponentPanel);
		app.showCard(AppFrame.CARD_USER_OPTIONS);
	}

	private void handleCancellation(AppFrame app) {
		Booking selected = (Booking) bookingDropdown.getSelectedItem();
		if (selected == null) {
			JOptionPane.showMessageDialog(this, "You have no bookings to cancel.", "No booking selected",
					JOptionPane.WARNING_MESSAGE);
			return;
		}

		BookingManager.getInstance().cancelBooking(selected.getBookingID());
		JOptionPane.showMessageDialog(this, "Booking cancelled.");
		RoomManager.getRoomManagerInstance().updateOccupancy(RoomManager.getRoomManagerInstance().selectRoomID(selected.getRoomID()), false);
		app.showCard(AppFrame.CARD_USER_OPTIONS);
		refreshBookings(app);
	}
}

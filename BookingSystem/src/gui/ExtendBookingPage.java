package gui;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Date;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import bookingManagment.Booking;
import bookingManagment.BookingManager;

public class ExtendBookingPage extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel extendBookingPanel = new JPanel();
	private JLabel inputLabel1 = new JLabel("Select a booking to extend:", JLabel.CENTER);
	private JLabel inputLabel2 = new JLabel("Enter new end time (e.g. 15:40):", JLabel.CENTER);
	private JButton confirm = new JButton("confirm");
	private JButton cancel = new JButton("back");
	private static JComboBox<Booking> bookingDropdown = new JComboBox<>();
	private static JTextField endTimeInputField = new JTextField(15);
	private JPanel centerComponentPanel = new JPanel(new GridLayout(0, 1, 5, 5));
	private JPanel layoutKeeper = new JPanel(new GridBagLayout());

	public ExtendBookingPage(AppFrame app) {
		setLayout(new GridBagLayout());

		// Adds to center panel
		centerComponentPanel.add(inputLabel1);
		centerComponentPanel.add(bookingDropdown);
		centerComponentPanel.add(inputLabel2);
		centerComponentPanel.add(endTimeInputField);
		centerComponentPanel.add(confirm);
		centerComponentPanel.add(cancel);

		// Adds borders
		centerComponentPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		layoutKeeper.add(centerComponentPanel); // GridBagLayout defaults to centering things at their natural size
		extendBookingPanel.add(layoutKeeper);
		add(extendBookingPanel);

		// Refresh the booking list every time this card is shown
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				refreshBookings(app);
			}
		});

		// Action Button Listeners
		cancel.addActionListener(e -> handleCancellation(app));
		confirm.addActionListener(e -> handleRoomExtension(app));
	}
	
	private void handleCancellation(AppFrame app)
	{
		endTimeInputField.setText("");
		app.showCard(AppFrame.CARD_USER_OPTIONS);
	}

	public static void refreshBookings(AppFrame app) {
		bookingDropdown.removeAllItems();
		String userID = String.valueOf(app.getCurrentUser().getId());
		for (Booking booking : BookingManager.getInstance().getBookingsForUser(userID)) {
			bookingDropdown.addItem(booking);
		}
	}

	private void handleRoomExtension(AppFrame app) {
		Booking selected = (Booking) bookingDropdown.getSelectedItem();
		String newEndTime = endTimeInputField.getText().trim();

		if (selected == null) {
			JOptionPane.showMessageDialog(this, "You have no bookings to extend.", "No booking selected",
					JOptionPane.WARNING_MESSAGE);
		}

		else if (!isValidTime(endTimeInputField.getText())
				|| trueTimeValue(selected.getEndTime()) > trueTimeValue(endTimeInputField.getText()) || trueTimeValue(endTimeInputField.getText()) < 60 + trueTimeValue(selected.getStartTime())) {
			JOptionPane.showMessageDialog(this, "invalid time input, please try again.", "Invalid Input",
					JOptionPane.WARNING_MESSAGE);	 
		}

		else if (selected.hasExpired(new Date())) {
			JOptionPane.showMessageDialog(this, "This booking has already expired and can no longer be extended.",
					"Booking expired", JOptionPane.WARNING_MESSAGE);
		}

		else if (!isValidTime(newEndTime)) {
			JOptionPane.showMessageDialog(this, "Enter the new end time as HH:MM.", "Invalid time",
					JOptionPane.WARNING_MESSAGE);
		}

		else if (!BookingManager.getInstance().isRoomAvailableForExtension(selected, newEndTime)) {
			JOptionPane.showMessageDialog(this, "The room is already booked by someone else during the extended time.",
					"Room unavailable", JOptionPane.WARNING_MESSAGE);
		}

		else {			
			PaymentPage.setTypeOfPayment("extend");
			app.showCard(AppFrame.CARD_PAYMENT_PLAN);	
			return;
		}
		
		endTimeInputField.setText("");
	}
	
	public static Booking getSelectedBooking()
	{
		return (Booking) bookingDropdown.getSelectedItem(); 
	}
	
	public static String endTimeInputField()
	{
		return endTimeInputField.getText().trim();
	}

	private boolean isValidTime(String timeEnd) {
		try {
			if ((timeEnd.length() == 4 || timeEnd.length() == 5)) {
				int end = trueTimeValue(timeEnd);
			} else {
				return false;
			}

			if (timeEnd.indexOf(":") == -1) {
				return false;
			}

		} catch (Exception e) {
			return false;
		}
		return true;
	}

	private int trueTimeValue(String time) {
		int hours = Integer.parseInt(time.substring(0, time.indexOf(":"))) * 60;
		int minutes = Integer.parseInt(time.substring(time.indexOf(":") + 1, time.length()));

		return hours + minutes;

	}
	
	public static void clearField()
	{
		endTimeInputField.setText("");
	}
}

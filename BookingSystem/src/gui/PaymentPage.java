package gui;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import bookingManagment.Booking;
import bookingManagment.BookingManager;
import payment.Context;
import payment.Payment;
import roomManagement.Room;
import roomManagement.RoomManager;

public class PaymentPage extends JPanel {

	private static final long serialVersionUID = 1L;
	private static Context payment;
	private JPanel paymentPanel = new JPanel();
	private JTextField cardInputField = new JTextField(15);
	private JLabel totalCostLabel = new JLabel();
	private JLabel depositLabel = new JLabel();
	private JLabel textLabel2 = new JLabel("Input Card/Billing Info (e.g. 16 digit number)", JLabel.CENTER);
	private JButton cancel = new JButton("cancel");
	private JButton checkout = new JButton("checkout");
	private static JPanel centerComponentPanel = new JPanel(new GridLayout(0, 1, 5, 5));
	private JPanel layoutKeeper = new JPanel(new GridBagLayout());
	private static String paymentType = "";

	public PaymentPage(AppFrame app) {
		setLayout(new GridBagLayout());

		// Add to center panel
		centerComponentPanel.add(totalCostLabel);
		centerComponentPanel.add(depositLabel);
		centerComponentPanel.add(textLabel2);
		centerComponentPanel.add(cardInputField);
		centerComponentPanel.add(checkout);
		centerComponentPanel.add(cancel);

		// Adds borders
		centerComponentPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		layoutKeeper.add(centerComponentPanel); // GridBagLayout defaults to centering things at their natural size
		paymentPanel.add(layoutKeeper);
		add(paymentPanel);

		// Show the calculated cost and required deposit every time this card is shown
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				refreshCostLabel();
			}
		});

		// button action listeners
		cancel.addActionListener(e -> app.showCard(AppFrame.CARD_PAYMENT_PLAN));
		checkout.addActionListener(e -> handlePayment(app));
	}

	private void refreshCostLabel() {
		totalCostLabel.setText("Total Cost: $" + payment.executeCalculateCost());
		depositLabel.setText("Deposit Due Now (1-hour fee): $" + payment.executeCalculateDeposit());
	}

	private void handlePayment(AppFrame app) {
		String roomID = RoomOptionsPage.getSelectedRoomID();
		Room room = roomID == null ? null : RoomManager.getRoomManagerInstance().selectRoomID(roomID);
		if (room == null) {
			JOptionPane.showMessageDialog(this, "No room selected for this booking.", "Missing room",
					JOptionPane.WARNING_MESSAGE);
			return;
		}

		if (!isCard(cardInputField.getText())) {
			JOptionPane.showMessageDialog(this, "Inccorect card information, please try again.", "Missing room",
					JOptionPane.WARNING_MESSAGE);
			cardInputField.setText("");
			return;
		}
		if (paymentType == "book") {
			List<JTextField> info = BookingInformationPage.getInfo();
			Date date;
			try {
				date = new SimpleDateFormat("MM/dd/yy").parse(info.get(0).getText());
			} catch (ParseException ex) {
				JOptionPane.showMessageDialog(this, "Enter the date as MM/DD/YY.", "Invalid date",
						JOptionPane.WARNING_MESSAGE);
				return;
			}

			String startTime = info.get(1).getText();
			String endTime = info.get(2).getText();

			double deposit = payment.executeCalculateDeposit();
			payment.setCardInformation(cardInputField.getText());
			payment.setDeposit(deposit);

			String userID = String.valueOf(app.getCurrentUser().getId());
			String bookingID = "BK" + System.currentTimeMillis();
			BookingManager.getInstance().createBooking(userID, roomID, bookingID, date, startTime, endTime, deposit,
					payment.executeCalculateCost(), app.getCurrentUser().getHourlyRate());

			// mark this room as assigned to the user so the scanner can check them in later
			room.setUser(userID);

			JOptionPane.showMessageDialog(this, "Booking confirmed! Deposit charged : $" + deposit);
			cardInputField.setText("");
			ExtendBookingPage.refreshBookings(app);
			CancelBookingPage.refreshBookings(app);
			app.clearAllFields(BookingInformationPage.getPanel());
			app.showCard(AppFrame.CARD_USER_OPTIONS);
		}

		if (paymentType == "extend") {
			payment.setCardInformation(cardInputField.getText());
			payment.setDeposit(0);
			JOptionPane.showMessageDialog(this,
					"Extended Booking! Amount Charged : $" + payment.executeCalculateCost());
			String newEndTime = ExtendBookingPage.endTimeInputField();
			Booking selectedBooking = ExtendBookingPage.getSelectedBooking();
			BookingManager.getInstance().extendBooking(selectedBooking.getBookingID(), newEndTime);
			cardInputField.setText("");
			ExtendBookingPage.refreshBookings(app);
			CancelBookingPage.refreshBookings(app);
			ExtendBookingPage.clearField();
			app.showCard(AppFrame.CARD_USER_OPTIONS);
		}

	}

	private boolean isCard(String str) {
		try {
			Long.parseLong(str);
			if (str.length() == 16) {
				return true;
			}
			return false;
		} catch (Exception e) {
			return false;
		}
	}

	public static void paymentMethod(Payment paymentMethod) {
		payment = new Context(paymentMethod);
	}

	public static JPanel getPanel() {
		return centerComponentPanel;
	}

	public static void setTypeOfPayment(String paymentTypeString) {
		paymentType = paymentTypeString;
	}

	public static String getPaymentType() {
		return paymentType;
	}
}

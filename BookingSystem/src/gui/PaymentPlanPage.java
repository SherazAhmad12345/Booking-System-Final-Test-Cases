package gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import bookingManagment.Booking;
import payment.CreditCardPayment;
import payment.DebitCardPayment;
import payment.InstitutionsBilling;

public class PaymentPlanPage extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JPanel paymentBookingPanel = new JPanel();
	private JButton cancel = new JButton("Cancel");
	private JButton credit = new JButton("Credit");
	private JButton debit = new JButton("Debit");
	private JButton institutionalBilling = new JButton("Institutional Billing");
	private JPanel centerComponentPanel = new JPanel(new GridLayout(0, 1, 5, 5));
	private JPanel layoutKeeper = new JPanel(new GridBagLayout());
	private List<JTextField> bookingInfo;
	private Booking extendBookingInfo;
	private String extendBookingNewEndTime;

	public PaymentPlanPage(AppFrame app) {
		setLayout(new GridBagLayout());
		// Add to center panel
		centerComponentPanel.add(credit);
		centerComponentPanel.add(debit);
		centerComponentPanel.add(institutionalBilling);
		centerComponentPanel.add(cancel);

		// Adds borders
		centerComponentPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		layoutKeeper.add(centerComponentPanel); // GridBagLayout defaults to centering things at their natural size
		paymentBookingPanel.add(layoutKeeper);
		add(paymentBookingPanel);

		// button action listeners
		cancel.addActionListener(e -> handleCancelButton(app));
		credit.addActionListener(e -> handleCreditPayment(app));
		debit.addActionListener(e -> handleDebitPayment(app));
		institutionalBilling.addActionListener(e -> handleBillingPayment(app));
	}

	private void handleCancelButton(AppFrame app) {
		if (PaymentPage.getPaymentType() == "book") {
			app.showCard(AppFrame.CARD_BOOKING_INFORMATION);
		}

		if (PaymentPage.getPaymentType() == "extend") {
			app.showCard(AppFrame.CARD_EXTEND_BOOKING);
		}
	}

	private void handleCreditPayment(AppFrame app) {
		if (PaymentPage.getPaymentType() == "book") {
			bookingInfo = BookingInformationPage.getInfo();
			PaymentPage.paymentMethod(new CreditCardPayment(app.getCurrentUser().getHourlyRate(),
					bookingInfo.get(1).getText(), bookingInfo.get(2).getText(), "", 0));
		}
		if (PaymentPage.getPaymentType() == "extend") {
			extendBookingInfo = ExtendBookingPage.getSelectedBooking();
			extendBookingNewEndTime = ExtendBookingPage.endTimeInputField();
			PaymentPage.paymentMethod(new CreditCardPayment(app.getCurrentUser().getHourlyRate(),
					extendBookingInfo.getEndTime(), extendBookingNewEndTime, "", -1));
		}
		app.showCard(AppFrame.CARD_PAYMENT);
	}

	private void handleDebitPayment(AppFrame app) {
		if (PaymentPage.getPaymentType() == "book") {
			bookingInfo = BookingInformationPage.getInfo();
			PaymentPage.paymentMethod(new DebitCardPayment(app.getCurrentUser().getHourlyRate(),
					bookingInfo.get(1).getText(), bookingInfo.get(2).getText(), "", 0));
		}
		if (PaymentPage.getPaymentType() == "extend") {
			extendBookingInfo = ExtendBookingPage.getSelectedBooking();
			extendBookingNewEndTime = ExtendBookingPage.endTimeInputField();
			PaymentPage.paymentMethod(new DebitCardPayment(app.getCurrentUser().getHourlyRate(),
					extendBookingInfo.getEndTime(), extendBookingNewEndTime, "", -1));
		}
		app.showCard(AppFrame.CARD_PAYMENT);
	}

	private void handleBillingPayment(AppFrame app) {
		if (PaymentPage.getPaymentType() == "book") {
			bookingInfo = BookingInformationPage.getInfo();
			PaymentPage.paymentMethod(new InstitutionsBilling(app.getCurrentUser().getHourlyRate(),
					bookingInfo.get(1).getText(), bookingInfo.get(2).getText(), "", 0));
		}
		if (PaymentPage.getPaymentType() == "extend") {
			extendBookingInfo = ExtendBookingPage.getSelectedBooking();
			extendBookingNewEndTime = ExtendBookingPage.endTimeInputField();
			PaymentPage.paymentMethod(new InstitutionsBilling(app.getCurrentUser().getHourlyRate(),
					extendBookingInfo.getEndTime(), extendBookingNewEndTime, "", -1));
		}
		app.showCard(AppFrame.CARD_PAYMENT);
	}
}

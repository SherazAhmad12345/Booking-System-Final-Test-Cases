package gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import bookingManagment.Booking;

public final class BookingInformationPage extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JPanel bookingInformationPanel = new JPanel();
	private JLabel inputLabel1 = new JLabel("Date: (e.g. MM/DD/YY) ", JLabel.CENTER);
	private JLabel inputLabel2 = new JLabel("Start Time: (e.g. 15:40)", JLabel.CENTER);
	private JLabel inputLabel3 = new JLabel("End Time: (e.g. 15:40)", JLabel.CENTER);
	private JButton confirm = new JButton("confirm");
	private JButton cancel = new JButton("cancel");
	private static JTextField dateInputField = new JTextField(15);
	private static JTextField startTimeInputField = new JTextField(15);
	private static JTextField endTimeInputField = new JTextField(15);
	private static JPanel centerComponentPanel = new JPanel(new GridLayout(0, 1, 5, 5));
	private JPanel layoutKeeper = new JPanel(new GridBagLayout());

	public BookingInformationPage(AppFrame app) {
		setLayout(new GridBagLayout());

		// Add to center pane
		centerComponentPanel.add(inputLabel1);
		centerComponentPanel.add(dateInputField);
		centerComponentPanel.add(inputLabel2);;
		centerComponentPanel.add(startTimeInputField);
		centerComponentPanel.add(inputLabel3);
		centerComponentPanel.add(endTimeInputField);
		centerComponentPanel.add(confirm);
		centerComponentPanel.add(cancel);
		
		// Adds borders
	    centerComponentPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		layoutKeeper.add(centerComponentPanel); // GridBagLayout defaults to centering things at their natural size
		bookingInformationPanel.add(layoutKeeper);
		add(bookingInformationPanel);
		
		// button action listeners
		cancel.addActionListener(e -> app.showCard(AppFrame.CARD_ROOM_OPTIONS));
        confirm.addActionListener(e -> handleConfirmationButton(app));       
	}
	
	public static List<JTextField> getInfo()
	{
		return List.of(dateInputField, startTimeInputField, endTimeInputField);
	}
	
	private void handleConfirmationButton(AppFrame app) {
		if (isValidDate(dateInputField.getText()) 
				&& isValidTime(startTimeInputField.getText(), endTimeInputField.getText()) && !hasPassed(new Date()) && trueTimeValue(startTimeInputField.getText()) + 60 <= trueTimeValue(endTimeInputField.getText())) {
			PaymentPage.setTypeOfPayment("book");
			app.showCard(AppFrame.CARD_PAYMENT_PLAN);
		}

		else {
			JOptionPane.showMessageDialog(this,
					"booking information did not meet the requested format or time period has already passed, please try again.",
					"Booking Cancellation Failed", JOptionPane.WARNING_MESSAGE);
			AppFrame.getInstance().clearAllFields(centerComponentPanel);
		}
	}
	
	 public boolean hasPassed(Date now)
	 {	 
		    Date date;
		    
			try {
				date = new SimpleDateFormat("MM/dd/yy").parse(dateInputField.getText());
			} catch (ParseException ex) {
				return true;
		    }
			
		  return now.after(Booking.combineDateAndTime(date, endTimeInputField.getText())) || now.after(Booking.combineDateAndTime(date, startTimeInputField.getText()));
	 }
	
	
	public static boolean isValidDate(String dateStr) {
		if (dateStr == null || dateStr.trim().isEmpty()) {
			return false;
		}

		// 1. Enforce strict MM/DD/YY parsing rules
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/uu").withResolverStyle(ResolverStyle.STRICT);

		try {
			// 2. Parse the string into a real date object
			LocalDate date = LocalDate.parse(dateStr, formatter);

			// 3. Extract the 2-digit year to verify your range requirement (26 to 99)
			int twoDigitYear = date.getYear() % 100;

			return twoDigitYear >= 26 && twoDigitYear <= 99;

		} catch (DateTimeParseException e) {
			// Returns false if format is wrong, or if numbers form an impossible date
			// (e.g., 02/30/26)
			return false;
		}
	}

	private boolean isValidTime(String timeStart, String timeEnd) {

		try {
			// Time can be written as 7:30 for 07:30 
			if(!(timeStart.length() == 4 || timeStart.length() == 5))
			{
				return false;
			}
			
			if(!(timeEnd.length() == 4 || timeEnd.length() == 5))
			{
				return false;
			}
			
			//Time must include ':'
			if(!timeStart.contains(":") || !timeEnd.contains(":"))
			{
				return false;
			}
			
			int startMinute = Integer.parseInt(timeStart.substring(timeStart.indexOf(":") + 1));
			int startHour = Integer.parseInt(timeStart.substring(0, timeStart.indexOf(":")));
			int endMinute = Integer.parseInt(timeEnd.substring(timeEnd.indexOf(":") + 1));
			int endHour = Integer.parseInt(timeEnd.substring(0, timeEnd.indexOf(":")));
				
			//Minutes should be from 0 to 59
			if(startMinute < 0 || startMinute > 59)
			{
				return false;
			}
			
			if(endMinute < 0 || endMinute > 59)
			{
				return false;
			}
					
			//Hours should be from 0 to 23
			if(startHour < 0 || startHour > 23)
			{
				return false;
			}
			
			if(endHour < 0 || endHour > 23)
			{
				return false;
			}
			
			//Start time should be before the end time
			if(trueTimeValue(timeEnd) <= trueTimeValue(timeStart))
			{
				return false;
			}

			
			return true; 
			
		} catch (Exception e) {
			return false;
		}

	}

	private int trueTimeValue(String time) {
		int hours = Integer.parseInt(time.substring(0, time.indexOf(":"))) * 60;
		int minutes = Integer.parseInt(time.substring(time.indexOf(":") + 1, time.length()));

		return hours + minutes;

	}
	
	public static JPanel getPanel() {
		return centerComponentPanel;
	}
}

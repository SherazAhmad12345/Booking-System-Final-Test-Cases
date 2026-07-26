package gui;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public final class UserOptionPage extends JPanel{
	private static final long serialVersionUID = 1L;

	private static JPanel userOptionPanel = new JPanel(new BorderLayout());
	private JButton cancelBooking = new JButton("Cancel Booking");
	private JButton extendBooking = new JButton("Extend Booking");
	private JButton bookRoom = new JButton("Book Room");
	private JButton scanBadge = new JButton("Scan Badge (Room Entry)");
	private JButton logout = new JButton("Logout");
	private JPanel centerButtonPanel = new JPanel(new GridLayout(0, 1, 5, 5));
	private JPanel layoutKeeper = new JPanel(new GridBagLayout());

	public UserOptionPage(AppFrame app) {
		setLayout(new GridBagLayout());
		
		// Add to center panel
		centerButtonPanel.add(bookRoom);
		centerButtonPanel.add(extendBooking);
		centerButtonPanel.add(cancelBooking);
		centerButtonPanel.add(scanBadge);
		centerButtonPanel.add(logout);

		// Adds borders
		centerButtonPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		
		// Add the sub-panel to the CENTER of the main BorderLayout panel
		layoutKeeper.add(centerButtonPanel); // GridBagLayout defaults to centering things at their natural size
		userOptionPanel.add(layoutKeeper);
		add(userOptionPanel);
		
		// button action listeners
		cancelBooking.addActionListener(e -> app.showCard(AppFrame.CARD_CANCEL_BOOKING));
        extendBooking.addActionListener(e -> app.showCard(AppFrame.CARD_EXTEND_BOOKING));
        bookRoom.addActionListener(e -> app.showCard(AppFrame.CARD_ROOM_OPTIONS));
        scanBadge.addActionListener(e -> app.showCard(AppFrame.CARD_SCAN_BADGE));
        logout.addActionListener(e -> app.showCard(AppFrame.CARD_WELCOME));
	}
}

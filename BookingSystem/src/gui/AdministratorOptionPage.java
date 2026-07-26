package gui;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AdministratorOptionPage extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JPanel administratorOptionPanel = new JPanel();
	private JButton addRooms = new JButton("Add Rooms");
	private JButton manageRooms = new JButton("Manage Rooms");
	private JButton logout = new JButton("logout");
	private JPanel centerComponentPanel = new JPanel(new GridLayout(0, 1, 5, 5));
	private JPanel layoutKeeper = new JPanel(new GridBagLayout());

	public AdministratorOptionPage(AppFrame app) {
		setLayout(new GridBagLayout());

		// Add to center panel
		centerComponentPanel.add(addRooms);
		centerComponentPanel.add(manageRooms);
		centerComponentPanel.add(logout);
		
		// Adds borders
	    centerComponentPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		layoutKeeper.add(centerComponentPanel); // GridBagLayout defaults to centering things at their natural size
		administratorOptionPanel.add(layoutKeeper);
		add(administratorOptionPanel);
		
		// Button action listeners
        manageRooms.addActionListener(e -> app.showCard(AppFrame.CARD_MANAGE_ROOMS));
        addRooms.addActionListener(e -> app.showCard(AppFrame.CARD_CREATE_NEW_ROOM));
        logout.addActionListener(e -> app.showCard(AppFrame.CARD_WELCOME));
	}
}

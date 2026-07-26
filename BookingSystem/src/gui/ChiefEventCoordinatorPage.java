package gui;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import administratorManagement.Administrator;
import administratorManagement.ChiefEventCoordinator;
import dataManagement.MaintainUser;

public class ChiefEventCoordinatorPage extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel chiefEventCoordinatorPanel = new JPanel();
	private JLabel inputLabel1 = new JLabel("Enter Administrator Username:", JLabel.CENTER);
	private JLabel inputLabel2 = new JLabel("Enter Administrator Email:", JLabel.CENTER);
	private JLabel inputLabel3 = new JLabel("Enter Administrator Password:", JLabel.CENTER);
	private JButton createAccount = new JButton("Create Account");
	private JButton back = new JButton("logout");
	private JTextField administratorUsernameInputField = new JTextField(15);
	private JTextField administratorEmailInputField = new JTextField(15);
	private JPasswordField administratorPasswordInputField = new JPasswordField(15);
	private JPanel centerComponentPanel = new JPanel(new GridLayout(0, 1, 5, 5));
	private JPanel layoutKeeper = new JPanel(new GridBagLayout());

	public ChiefEventCoordinatorPage(AppFrame app) {
		setLayout(new GridBagLayout());

		// Add to center panel
		centerComponentPanel.add(inputLabel1);
		centerComponentPanel.add(administratorUsernameInputField);
		centerComponentPanel.add(inputLabel2);
		centerComponentPanel.add(administratorEmailInputField);
		centerComponentPanel.add(inputLabel3);
		centerComponentPanel.add(administratorPasswordInputField);
		centerComponentPanel.add(createAccount);
		centerComponentPanel.add(back);

		// Adds borders
		centerComponentPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		layoutKeeper.add(centerComponentPanel); // GridBagLayout defaults to centering things at their natural size
		chiefEventCoordinatorPanel.add(layoutKeeper);
		add(chiefEventCoordinatorPanel);

		// button action listeners
		back.addActionListener(e -> app.showCard(AppFrame.CARD_WELCOME));
		createAccount.addActionListener(e -> handleAdminCreation(app));
	}

	private void handleAdminCreation(AppFrame app) {
		String username = administratorUsernameInputField.getText().trim();
		String email = administratorEmailInputField.getText().trim();
		String password = new String(administratorPasswordInputField.getPassword());
		
		ChiefEventCoordinator chiefEventCoordinator = ChiefEventCoordinator.getInstance();

		if (username.isEmpty() || email.isEmpty() || password.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Missing info",
					JOptionPane.WARNING_MESSAGE);
			return;
		}

		if (app.getMaintainAdministrator().usernameExists(username)) {
			JOptionPane.showMessageDialog(this, "That username is already taken.", "Username taken",
					JOptionPane.WARNING_MESSAGE);
			return;
		}

		if (!chiefEventCoordinator.isValidEmail(email)) {
			JOptionPane.showMessageDialog(this, "Enter a valid email address. (Accounts require a @yorku.ca email address)", "Invalid email",
					JOptionPane.WARNING_MESSAGE);
			return;
		}

		if (!chiefEventCoordinator.isStrongPassword(password)) {
			JOptionPane.showMessageDialog(this,
					"Password must have (min 8 chars, and atleast one of each: upper/lower/number/symbol characters)",
					"Weak password", JOptionPane.WARNING_MESSAGE);
			return;
		}

		int newAdminID = app.getMaintainAdministrator().nextId();
		Administrator admin = chiefEventCoordinator.generateAdminAccount(username, password, email,
				newAdminID);
		app.getMaintainAdministrator().addAdmin(admin);

		try {
			app.getMaintainAdministrator().save(AppFrame.ADMINISTRATORS_CSV_PATH);
		} catch (Exception ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(this, "Could not save administrator: " + ex.getMessage(), "Error",
					JOptionPane.ERROR_MESSAGE);
			return;
		}

		JOptionPane.showMessageDialog(this, "Administrator account created!");
		clearFields();
	}


	private void clearFields() {
		administratorUsernameInputField.setText("");
		administratorEmailInputField.setText("");
		administratorPasswordInputField.setText("");
	}
}

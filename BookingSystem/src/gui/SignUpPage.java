package gui;

import java.awt.GridBagConstraints;

import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import dataManagement.MaintainUser;
import userManagement.User;
import userManagement.UserFactory;

public class SignUpPage extends JPanel{
	private static final long serialVersionUID = 1L;

	private JTextField usernameField;
	private JPasswordField passwordField;
	private JTextField emailField;
	private JComboBox<String> userTypeBox;
	private JTextField orgIdOrStudentNumberField;

	public SignUpPage(AppFrame app) {
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(6, 6, 6, 6);
		gbc.fill = GridBagConstraints.HORIZONTAL;

		int row = 0;
		gbc.gridx = 0; gbc.gridy = row; gbc.gridwidth = 2;
		add(new JLabel("Sign Up Page"), gbc);
		row++;

		usernameField = new JTextField(18);
		addField(gbc, row++, "Username:", usernameField);

		passwordField = new JPasswordField(18);
		addField(gbc, row++, "Password: (min 8 chars & upper, lower, number & symbol characters)", passwordField);

		emailField = new JTextField(18);
		addField(gbc, row++, "Email: (Students use @my.yorku.ca & Staff/Faculty use @yorku.ca)", emailField);

		userTypeBox = new JComboBox<>(new String[] {"Student", "Faculty", "Staff", "Partner", "Other"});
		addField(gbc, row++, "User Type:", userTypeBox);

		orgIdOrStudentNumberField = new JTextField(18);
		addField(gbc, row++, "Organization ID / Student Number:", orgIdOrStudentNumberField);

		JButton submitButton = new JButton("Create Account");
		JButton backButton = new JButton("Back");

		gbc.gridx = 0; gbc.gridy = row; gbc.gridwidth = 1;
		add(submitButton, gbc);
		gbc.gridx = 1;
		add(backButton, gbc);

        backButton.addActionListener(e -> app.showCard(AppFrame.CARD_WELCOME));
        submitButton.addActionListener(e -> handleSignUp(app));
    }

    private void addField(GridBagConstraints gbc, int row, String labelText, java.awt.Component field) {
        gbc.gridx = 0; gbc.gridy = row; gbc.gridwidth = 1;
        add(new JLabel(labelText), gbc);
        gbc.gridx = 1;
        add(field, gbc);
    }

    private void handleSignUp(AppFrame app) {
        String username = usernameField.getText().trim();
        String password = new String(passwordField.getPassword());
        String email = emailField.getText().trim();
        String userType = (String) userTypeBox.getSelectedItem();
        String orgIdOrStudentNumber = orgIdOrStudentNumberField.getText().trim();

        if (username.isEmpty() || password.isEmpty() || email.isEmpty() || orgIdOrStudentNumber.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Missing info",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!UserFactory.isValidEmail(email, userType)) {
            JOptionPane.showMessageDialog(this, "Enter a valid email address, Faculty and Staff members need a @yorku.ca email address and Students need a @my.yorku.ca email address. For non-university member emails, the last '.' should be after '@' and not the last character.", "Invalid email",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!UserFactory.isStrongPassword(password)) {
            JOptionPane.showMessageDialog(this,
                    "Password must be at least 8 characters and include an uppercase letter, a lowercase letter, a number, and a symbol.",
                    "Weak password", JOptionPane.WARNING_MESSAGE);
            return;
        }

        MaintainUser maintainUser = app.getMaintainUser();

        if (maintainUser.usernameExists(username)) {
            JOptionPane.showMessageDialog(this, "That username is already taken.", "Username taken",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (maintainUser.emailExists(email)) {
            JOptionPane.showMessageDialog(this, "That email is already registered.", "Email taken",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        int newId = maintainUser.nextId();
        User newUser = UserFactory.createUser(userType, username, password, email, newId, orgIdOrStudentNumber);
        maintainUser.addUser(newUser);

        try {
            maintainUser.save(AppFrame.USERS_CSV_PATH);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Could not save user: " + ex.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Account created! Please log in.");
        clearFields();
        app.showCard(AppFrame.CARD_LOGIN);
    }

    private void clearFields() {
        usernameField.setText("");
        passwordField.setText("");
        emailField.setText("");
        userTypeBox.setSelectedIndex(0);
        orgIdOrStudentNumberField.setText("");

	}
}

package gui;

import java.awt.GridBagConstraints;

import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import administratorManagement.Administrator;
import userManagement.User;

public class LoginPage extends JPanel {

    private static final long serialVersionUID = 1L;

    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginPage(AppFrame app) {
    	setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6, 6, 6, 6);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        int row = 0;

        gbc.gridx = 0; gbc.gridy = row; gbc.gridwidth = 2;
        add(new JLabel("Login Page"), gbc);
        row++;

        usernameField = new JTextField(18);
        gbc.gridx = 0; gbc.gridy = row; gbc.gridwidth = 1;
        add(new JLabel("Username:"), gbc);
        gbc.gridx = 1;
        add(usernameField, gbc);
        row++;

        passwordField = new JPasswordField(18);
        gbc.gridx = 0; gbc.gridy = row; gbc.gridwidth = 1;
        add(new JLabel("Password:"), gbc);
        gbc.gridx = 1;
        add(passwordField, gbc);
        row++;

        JButton loginButton = new JButton("Login");
        gbc.gridx = 0; gbc.gridy = row; gbc.gridwidth = 2;
        add(loginButton, gbc);
        row++;

        JButton backButton = new JButton("Back");
        gbc.gridx = 0; gbc.gridy = row; gbc.gridwidth = 2;
        add(backButton, gbc);

        backButton.addActionListener(e -> handleBackButton(app));
        loginButton.addActionListener(e -> handleLogin(app));
    }
    
    private void handleBackButton(AppFrame app)
    {
    	clearFields();
    	app.showCard(AppFrame.CARD_WELCOME); 	
    }

    private void handleLogin(AppFrame app) {
        String username = usernameField.getText().trim();
        String password = new String(passwordField.getPassword());

        /**Check if client is a User*/
        User user = app.getMaintainUser().authenticate(username, password);

        if (user != null) {
        	app.setCurrentAdministrator(null); //Incase previous account was an Administrator
        	app.setCurrentUser(user);
            clearFields();
            app.showCard(AppFrame.CARD_USER_OPTIONS);
            return;
        }

        
        /**If not a User, check if client is an Administrator*/
        Administrator admin = app.getMaintainAdministrator().authenticate(username, password);
        
        if (admin != null) {
        	app.setCurrentAdministrator(admin);
        	app.setCurrentUser(null); //Incase previous account was an User
            clearFields();
            if (admin.isChiefEventCoordinator()) {
            	app.showCard(AppFrame.CARD_CHIEF_EVENT_COORDINATOR);
            } else {
            	app.showCard(AppFrame.CARD_ADMINISTRATOR_OPTIONS);
            }
            return;
        }
        
        /**Display error if no account types were matched*/
        JOptionPane.showMessageDialog(this, "Incorrect username or password.", "Login failed",
        		JOptionPane.ERROR_MESSAGE); 
        clearFields();
        
        //app.showCard(AppFrame.CARD_CHIEF_EVENT_COORDINATOR);
    }

    private void clearFields() {
        usernameField.setText("");
        passwordField.setText("");
    }
}
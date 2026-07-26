package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class WelcomePage extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private AppFrame app;
	
	public WelcomePage(AppFrame app) {
		setLayout(new BorderLayout());
		JLabel title = new JLabel("<html><center>Welcome to<br>York's Booking<br>Manager!</center></html>",
				SwingConstants.CENTER);
		title.setFont(new Font("SansSerif", Font.BOLD, 22));
		add(title, BorderLayout.CENTER);
	
		JPanel buttonRow = new JPanel(new FlowLayout());
		JButton signUpButton = new JButton("Sign Up");
		JButton loginButton = new JButton("Login");
	
		signUpButton.addActionListener(e -> app.showCard(AppFrame.CARD_SIGNUP));
		loginButton.addActionListener(e -> app.showCard(AppFrame.CARD_LOGIN));
	
		buttonRow.add(signUpButton);
		buttonRow.add(loginButton);
		add(buttonRow, BorderLayout.SOUTH);
}
}

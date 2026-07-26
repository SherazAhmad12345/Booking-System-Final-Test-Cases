package gui;

import java.awt.CardLayout;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import administratorManagement.Administrator;
import dataManagement.MaintainAdministrator;
import dataManagement.MaintainUser;
import userManagement.User;

public class AppFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	private static AppFrame instance;
	
	public static final String CARD_WELCOME = "WELCOME";
	public static final String CARD_SIGNUP = "SIGNUP";
	public static final String CARD_LOGIN = "LOGIN";
	public static final String CARD_DASHBOARD = "DASHBOARD";
	public static final String CARD_USER_OPTIONS = "USER OPTIONS";
	public static final String CARD_BOOKING_INFORMATION = "BOOKING";
	public static final String CARD_CANCEL_BOOKING = "CANCEL BOOKING";
	public static final String CARD_CHIEF_EVENT_COORDINATOR = "MANAGE ADMINISTRATORS";
	public static final String CARD_CREATE_NEW_ROOM = "CREATE ROOM";
	public static final String CARD_EXTEND_BOOKING = "EXTEND BOOKING";
	public static final String CARD_MANAGE_ROOMS = "MANAGE ROOMS";
	public static final String CARD_PAYMENT_PLAN = "PAYMENT PLAN";
	public static final String CARD_ROOM_OPTIONS = "ROOM OPTIONS";
	public static final String CARD_ADMINISTRATOR_OPTIONS = "ADMINISTRATOR OPTIONS";
	public static final String CARD_PAYMENT = "PAYMENT";
	public static final String CARD_SCAN_BADGE = "SCAN BADGE";
	
	//For csv of users
	public static final String USERS_CSV_PATH = "data/users.csv";
	
	//For csv of Admins
	public static final String ADMINISTRATORS_CSV_PATH = "data/administrators.csv";

	private CardLayout cardLayout;
	private JPanel cardContainer;
	
	private MaintainUser maintainUser;
	private MaintainAdministrator maintainAdministrator;
	
	private User currentUser;
	private Administrator currentAdministrator;
	
	private AppFrame() {
		super("York's Booking Manager");
		maintainUser = new MaintainUser();
		maintainAdministrator = new MaintainAdministrator();
		
		
		try {
			maintainUser.load(USERS_CSV_PATH);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			maintainAdministrator.load(ADMINISTRATORS_CSV_PATH);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		cardLayout = new CardLayout();
		cardContainer = new JPanel(cardLayout);
		
		cardContainer.add(new SignUpPage(this), CARD_SIGNUP);
		cardContainer.add(new LoginPage(this), CARD_LOGIN);
		cardContainer.add(new WelcomePage(this), CARD_WELCOME);
        cardContainer.add(new UserOptionPage(this), CARD_USER_OPTIONS);
        cardContainer.add(new AdministratorOptionPage(this), CARD_ADMINISTRATOR_OPTIONS);
        cardContainer.add(new BookingInformationPage(this), CARD_BOOKING_INFORMATION);
        cardContainer.add(new CancelBookingPage(this), CARD_CANCEL_BOOKING);
        cardContainer.add(new ChiefEventCoordinatorPage(this), CARD_CHIEF_EVENT_COORDINATOR);
        cardContainer.add(new ExtendBookingPage(this), CARD_EXTEND_BOOKING);
        cardContainer.add(new ManageRoomsPage(this), CARD_MANAGE_ROOMS);
        cardContainer.add(new PaymentPlanPage(this), CARD_PAYMENT_PLAN);
        cardContainer.add(new RoomOptionsPage(this), CARD_ROOM_OPTIONS);
        cardContainer.add(new CreateNewRoomPage(this), CARD_CREATE_NEW_ROOM);
        cardContainer.add(new PaymentPage(this), CARD_PAYMENT);
        cardContainer.add(new ScanBadgePage(this), CARD_SCAN_BADGE);
  
		getContentPane().add(cardContainer);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 450);
		setLocationRelativeTo(null);
	}
	
	public static AppFrame getInstance() {
		if (instance == null) {
			instance = new AppFrame();
		}
		return instance;
	}
	
	public void showCard(String cardName) {
		cardLayout.show(cardContainer, cardName);
	}
	
	public MaintainUser getMaintainUser() {
		return maintainUser;
	}
	
	public MaintainAdministrator getMaintainAdministrator()
	{
		return maintainAdministrator;
	}
	
	public void setCurrentUser(User user) {
		this.currentUser = user;
	}
	
	public void setCurrentAdministrator(Administrator administrator)
	{
		this.currentAdministrator = administrator;
	}
	
	public User getCurrentUser() {
		return currentUser;
	}
	
	public Administrator getCurrentAdministrator()
	{
		return currentAdministrator;
	}
	
	public void clearAllFields(JPanel panel)
	{
		for(Component c: panel.getComponents())
		{
			if(c instanceof JTextField)
			{
				((JTextField) c).setText(""); 
			}
		}
	}
	
	public static void main(String[] args) {
		AppFrame frame = AppFrame.getInstance();
		frame.showCard(CARD_WELCOME);
		frame.setVisible(true);
	}
}

package AITests;

import static org.junit.Assert.*;

import java.awt.GraphicsEnvironment;
import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.junit.After;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

import administratorManagement.Administrator;
import bookingManagment.Booking;
import bookingManagment.BookingManager;
import dataManagement.MaintainAdministrator;
import dataManagement.MaintainUser;
import gui.AppFrame;
import gui.BookingInformationPage;
import gui.CancelBookingPage;
import gui.ChiefEventCoordinatorPage;
import gui.CreateNewRoomPage;
import gui.ExtendBookingPage;
import gui.LoginPage;
import gui.ManageRoomsPage;
import gui.PaymentPage;
import gui.PaymentPlanPage;
import gui.RoomOptionsPage;
import gui.ScanBadgePage;
import gui.SignUpPage;
import payment.Context;
import payment.CreditCardPayment;
import payment.DebitCardPayment;
import payment.InstitutionsBilling;
import roomManagement.Room;
import roomManagement.RoomManager;
import userManagement.Partner;
import userManagement.Student;

public class GuiWorkflowCoverageTest {
    private AppFrame app;
    private AITestSupport.CardRecorder cards;

    @Before
    public void setUp() {
        Assume.assumeFalse(GraphicsEnvironment.isHeadless());
        AITestSupport.resetBookingManager();
        AITestSupport.resetRoomManager();
        app = AITestSupport.freshApp();
        cards = AITestSupport.installCardRecorder(app);
        AITestSupport.setField(RoomOptionsPage.class, "selectedRoomID", null);
        for (JTextField field : BookingInformationPage.getInfo()) {
            field.setText("");
        }
        ExtendBookingPage.clearField();
    }

    @After
    public void cleanUp() {
        AITestSupport.closeDialogs();
        AITestSupport.resetBookingManager();
        AITestSupport.resetRoomManager();
    }

    @Test
    public void bookingInformationCoversValidationAndBothConfirmationOutcomes() {
        BookingInformationPage page = new BookingInformationPage(app);

        assertFalse((Boolean) AITestSupport.invoke(page, "isValidTime",
                new Class<?>[] { String.class, String.class }, "09:00", "1"));
        assertFalse((Boolean) AITestSupport.invoke(page, "isValidTime",
                new Class<?>[] { String.class, String.class }, "0900", "10:00"));
        assertFalse((Boolean) AITestSupport.invoke(page, "isValidTime",
                new Class<?>[] { String.class, String.class }, "09:60", "10:00"));
        assertFalse((Boolean) AITestSupport.invoke(page, "isValidTime",
                new Class<?>[] { String.class, String.class }, "09:00", "10:60"));
        assertFalse((Boolean) AITestSupport.invoke(page, "isValidTime",
                new Class<?>[] { String.class, String.class }, "24:00", "25:00"));
        assertFalse((Boolean) AITestSupport.invoke(page, "isValidTime",
                new Class<?>[] { String.class, String.class }, "09:00", "24:00"));
        assertFalse((Boolean) AITestSupport.invoke(page, "isValidTime",
                new Class<?>[] { String.class, String.class }, null, "10:00"));

        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handleConfirmationButton",
                new Class<?>[] { AppFrame.class }, app));
        assertEquals("", BookingInformationPage.getInfo().get(0).getText());

        BookingInformationPage.getInfo().get(0).setText("01/01/40");
        BookingInformationPage.getInfo().get(1).setText("09:00");
        BookingInformationPage.getInfo().get(2).setText("10:00");
        AITestSupport.invoke(page, "handleConfirmationButton", new Class<?>[] { AppFrame.class }, app);
        assertEquals("book", PaymentPage.getPaymentType());
        assertEquals(AppFrame.CARD_PAYMENT_PLAN, cards.getLastCard());
    }

    @Test
    public void cancellationPageCoversBackEmptyAndSuccessfulCancellation() {
        app.setCurrentUser(new Student("cancel-user", "Secret1!", "cancel@my.yorku.ca", 7, "S7"));
        CancelBookingPage page = new CancelBookingPage(app);

        AITestSupport.invoke(page, "handleCancelButton", new Class<?>[] { AppFrame.class }, app);
        assertEquals(AppFrame.CARD_USER_OPTIONS, cards.getLastCard());

        CancelBookingPage.refreshBookings(app);
        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handleCancellation",
                new Class<?>[] { AppFrame.class }, app));

        Room room = RoomManager.getRoomManagerInstance().selectRoomID("CLH-205");
        room.setOccupied(true);
        BookingManager.getInstance().createBooking("7", "CLH-205", "CANCEL-1",
                AITestSupport.date("2040-01-01 00:00"), "09:00", "10:00", 20, 20, 20);
        CancelBookingPage.refreshBookings(app);
        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handleCancellation",
                new Class<?>[] { AppFrame.class }, app));

        assertNull(BookingManager.getInstance().getBooking("CANCEL-1"));
        assertFalse(room.isOccupied());
        assertEquals(AppFrame.CARD_USER_OPTIONS, cards.getLastCard());
    }

    @Test
    public void chiefCoordinatorFormCoversEveryValidationAndPersistencePath() {
        ChiefEventCoordinatorPage page = new ChiefEventCoordinatorPage(app);
        JTextField username = AITestSupport.getField(page, "administratorUsernameInputField");
        JTextField email = AITestSupport.getField(page, "administratorEmailInputField");
        JPasswordField password = AITestSupport.getField(page, "administratorPasswordInputField");
        MaintainAdministrator admins = app.getMaintainAdministrator();

        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handleAdminCreation",
                new Class<?>[] { AppFrame.class }, app));

        admins.addAdmin(new Administrator("taken", "Secret1!", "taken@yorku.ca", 1));
        setAdminFields(username, email, password, "taken", "new@yorku.ca", "Secret1!");
        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handleAdminCreation",
                new Class<?>[] { AppFrame.class }, app));

        setAdminFields(username, email, password, "new-admin", "bad@example.com", "Secret1!");
        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handleAdminCreation",
                new Class<?>[] { AppFrame.class }, app));

        setAdminFields(username, email, password, "new-admin", "new@yorku.ca", "weak");
        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handleAdminCreation",
                new Class<?>[] { AppFrame.class }, app));

        AITestSupport.preserveFile(AppFrame.ADMINISTRATORS_CSV_PATH, () -> {
            setAdminFields(username, email, password, "created-admin", "created@yorku.ca", "Secret1!");
            AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handleAdminCreation",
                    new Class<?>[] { AppFrame.class }, app));
        });
        assertTrue(admins.usernameExists("created-admin"));
        assertEquals("", username.getText());

        AITestSupport.preserveFile(AppFrame.ADMINISTRATORS_CSV_PATH, () -> {
            AITestSupport.makeDirectoryAtFilePath(AppFrame.ADMINISTRATORS_CSV_PATH);
            setAdminFields(username, email, password, "save-fails", "save-fails@yorku.ca", "Secret1!");
            AITestSupport.runSilencingError(() -> AITestSupport.runClosingDialogs(() ->
                    AITestSupport.invoke(page, "handleAdminCreation", new Class<?>[] { AppFrame.class }, app)));
        });
    }

    @Test
    public void roomCreationCoversInvalidDuplicateAndSuccessfulRequests() {
        app.setCurrentAdministrator(new Administrator("room-admin", "Secret1!", "admin@yorku.ca", 9));
        CreateNewRoomPage page = new CreateNewRoomPage(app);
        JTextField id = AITestSupport.getField(page, "createRoomIDInputField");
        JTextField location = AITestSupport.getField(page, "roomLocationInputField");
        JTextField capacity = AITestSupport.getField(page, "roomCapacityInputField");

        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handleRoomCreation",
                new Class<?>[] { AppFrame.class }, app));

        id.setText("NEW-1");
        location.setText("New room");
        capacity.setText("not-a-number");
        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handleRoomCreation",
                new Class<?>[] { AppFrame.class }, app));

        id.setText("CLH-205");
        location.setText("Duplicate ID location");
        capacity.setText("10");
        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handleRoomCreation",
                new Class<?>[] { AppFrame.class }, app));

        id.setText("AI-500");
        location.setText("AI coverage room");
        capacity.setText("45");
        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handleRoomCreation",
                new Class<?>[] { AppFrame.class }, app));
        assertNotNull(RoomManager.getRoomManagerInstance().selectRoomID("AI-500"));
        assertEquals("", id.getText());
        assertEquals(AppFrame.CARD_ADMINISTRATOR_OPTIONS, cards.getLastCard());
    }

    @Test
    public void extensionPageCoversBackAndAllReachableDecisionBranches() {
        app.setCurrentUser(new Student("extend-user", "Secret1!", "extend@my.yorku.ca", 7, "S7"));
        ExtendBookingPage page = new ExtendBookingPage(app);
        JComboBox<?> dropdown = AITestSupport.getField(ExtendBookingPage.class, "bookingDropdown");
        JTextField end = AITestSupport.getField(ExtendBookingPage.class, "endTimeInputField");

        AITestSupport.invoke(page, "handleCancellation", new Class<?>[] { AppFrame.class }, app);
        assertEquals(AppFrame.CARD_USER_OPTIONS, cards.getLastCard());

        ExtendBookingPage.refreshBookings(app);
        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handleRoomExtension",
                new Class<?>[] { AppFrame.class }, app));

        BookingManager.getInstance().createBooking("7", "CLH-205", "EXT-INVALID",
                AITestSupport.date("2040-01-01 00:00"), "09:00", "10:00", 0, 20, 20);
        ExtendBookingPage.refreshBookings(app);
        end.setText("bad");
        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handleRoomExtension",
                new Class<?>[] { AppFrame.class }, app));
        assertEquals("", end.getText());

        AITestSupport.resetBookingManager();
        BookingManager.getInstance().createBooking("7", "CLH-205", "EXT-OLD",
                AITestSupport.date("2020-01-01 00:00"), "09:00", "10:00", 0, 20, 20);
        ExtendBookingPage.refreshBookings(app);
        end.setText("11:00");
        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handleRoomExtension",
                new Class<?>[] { AppFrame.class }, app));

        AITestSupport.resetBookingManager();
        BookingManager manager = BookingManager.getInstance();
        manager.createBooking("7", "CLH-205", "EXT-BASE", AITestSupport.date("2040-01-01 00:00"),
                "09:00", "10:00", 0, 20, 20);
        manager.createBooking("8", "CLH-205", "EXT-CONFLICT", AITestSupport.date("2040-01-01 00:00"),
                "10:30", "12:00", 0, 20, 20);
        ExtendBookingPage.refreshBookings(app);
        dropdown.setSelectedItem(manager.getBooking("EXT-BASE"));
        end.setText("11:00");
        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handleRoomExtension",
                new Class<?>[] { AppFrame.class }, app));

        AITestSupport.resetBookingManager();
        manager.createBooking("7", "CLH-205", "EXT-OK", AITestSupport.date("2040-01-01 00:00"),
                "09:00", "10:00", 0, 20, 20);
        ExtendBookingPage.refreshBookings(app);
        dropdown.setSelectedItem(manager.getBooking("EXT-OK"));
        end.setText("11:00");
        AITestSupport.invoke(page, "handleRoomExtension", new Class<?>[] { AppFrame.class }, app);
        assertEquals("extend", PaymentPage.getPaymentType());
        assertEquals(AppFrame.CARD_PAYMENT_PLAN, cards.getLastCard());

        assertFalse((Boolean) AITestSupport.invoke(page, "isValidTime", new Class<?>[] { String.class },
                new Object[] { null }));
    }

    @Test
    public void loginCoversBackUserAdministratorChiefAndFailure() {
        LoginPage page = new LoginPage(app);
        JTextField username = AITestSupport.getField(page, "usernameField");
        JPasswordField password = AITestSupport.getField(page, "passwordField");
        MaintainUser users = app.getMaintainUser();
        MaintainAdministrator admins = app.getMaintainAdministrator();

        username.setText("back");
        password.setText("back");
        AITestSupport.invoke(page, "handleBackButton", new Class<?>[] { AppFrame.class }, app);
        assertEquals(AppFrame.CARD_WELCOME, cards.getLastCard());

        Student user = new Student("student-login", "Secret1!", "student@my.yorku.ca", 1, "S1");
        users.addUser(user);
        setLoginFields(username, password, "student-login", "Secret1!");
        AITestSupport.invoke(page, "handleLogin", new Class<?>[] { AppFrame.class }, app);
        assertSame(user, app.getCurrentUser());
        assertNull(app.getCurrentAdministrator());
        assertEquals(AppFrame.CARD_USER_OPTIONS, cards.getLastCard());

        Administrator normal = new Administrator("normal-admin", "Secret1!", "normal@yorku.ca", 2, false);
        admins.addAdmin(normal);
        setLoginFields(username, password, "normal-admin", "Secret1!");
        AITestSupport.invoke(page, "handleLogin", new Class<?>[] { AppFrame.class }, app);
        assertSame(normal, app.getCurrentAdministrator());
        assertNull(app.getCurrentUser());
        assertEquals(AppFrame.CARD_ADMINISTRATOR_OPTIONS, cards.getLastCard());

        Administrator chief = new Administrator("chief-admin", "Secret1!", "chief@yorku.ca", 3, true);
        admins.addAdmin(chief);
        setLoginFields(username, password, "chief-admin", "Secret1!");
        AITestSupport.invoke(page, "handleLogin", new Class<?>[] { AppFrame.class }, app);
        assertEquals(AppFrame.CARD_CHIEF_EVENT_COORDINATOR, cards.getLastCard());

        setLoginFields(username, password, "missing", "wrong");
        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handleLogin",
                new Class<?>[] { AppFrame.class }, app));
        assertEquals("", username.getText());
    }

    @Test
    public void manageRoomsCoversNullSelectionsAndEveryStateAction() {
        app.setCurrentAdministrator(new Administrator("manage-admin", "Secret1!", "manage@yorku.ca", 4));
        ManageRoomsPage page = new ManageRoomsPage(app);
        AITestSupport.invoke(page, "refreshRooms", new Class<?>[0]);
        JComboBox<?> dropdown = AITestSupport.getField(page, "roomDropdown");

        dropdown.setSelectedIndex(-1);
        AITestSupport.invoke(page, "handleRoomEnabling", new Class<?>[] { AppFrame.class }, app);
        AITestSupport.invoke(page, "handleRoomDisabling", new Class<?>[] { AppFrame.class }, app);
        AITestSupport.invoke(page, "handleRoomClosing", new Class<?>[] { AppFrame.class }, app);
        AITestSupport.invoke(page, "handleMaintenanceFinished", new Class<?>[] { AppFrame.class }, app);

        dropdown.setSelectedIndex(0);
        Room room = (Room) AITestSupport.invoke(page, "getSelectedRoom", new Class<?>[0]);
        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handleRoomEnabling",
                new Class<?>[] { AppFrame.class }, app));
        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handleRoomDisabling",
                new Class<?>[] { AppFrame.class }, app));
        assertEquals("DISABLED", room.getStatus());
        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handleRoomClosing",
                new Class<?>[] { AppFrame.class }, app));
        assertEquals("CLOSED", room.getStatus());
        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handleMaintenanceFinished",
                new Class<?>[] { AppFrame.class }, app));
        assertEquals("ENABLED", room.getStatus());
    }

    @Test
    public void paymentPlanBuildsEveryStrategyForBookingAndExtension() {
        app.setCurrentUser(new Student("payer", "Secret1!", "payer@my.yorku.ca", 5, "S5"));
        PaymentPlanPage page = new PaymentPlanPage(app);
        BookingInformationPage.getInfo().get(0).setText("01/01/40");
        BookingInformationPage.getInfo().get(1).setText("09:00");
        BookingInformationPage.getInfo().get(2).setText("11:00");

        PaymentPage.setTypeOfPayment("book");
        AITestSupport.invoke(page, "handleCancelButton", new Class<?>[] { AppFrame.class }, app);
        assertEquals(AppFrame.CARD_BOOKING_INFORMATION, cards.getLastCard());
        assertPaymentStrategy(page, "handleCreditPayment", CreditCardPayment.class);
        assertPaymentStrategy(page, "handleDebitPayment", DebitCardPayment.class);
        assertPaymentStrategy(page, "handleBillingPayment", InstitutionsBilling.class);

        BookingManager.getInstance().createBooking("5", "CLH-205", "PLAN-EXT",
                AITestSupport.date("2040-01-01 00:00"), "09:00", "10:00", 0, 20, 20);
        ExtendBookingPage.refreshBookings(app);
        JTextField end = AITestSupport.getField(ExtendBookingPage.class, "endTimeInputField");
        end.setText("11:00");
        PaymentPage.setTypeOfPayment("extend");
        AITestSupport.invoke(page, "handleCancelButton", new Class<?>[] { AppFrame.class }, app);
        assertEquals(AppFrame.CARD_EXTEND_BOOKING, cards.getLastCard());
        assertPaymentStrategy(page, "handleCreditPayment", CreditCardPayment.class);
        assertPaymentStrategy(page, "handleDebitPayment", DebitCardPayment.class);
        assertPaymentStrategy(page, "handleBillingPayment", InstitutionsBilling.class);
    }

    @Test
    public void paymentPageCoversLabelsMissingRoomInvalidCardBookingAndExtension() {
        Student user = new Student("pay-user", "Secret1!", "pay@my.yorku.ca", 6, "S6");
        app.setCurrentUser(user);
        PaymentPage page = new PaymentPage(app);
        JTextField card = AITestSupport.getField(page, "cardInputField");
        JLabel total = AITestSupport.getField(page, "totalCostLabel");
        JLabel deposit = AITestSupport.getField(page, "depositLabel");

        PaymentPage.paymentMethod(new CreditCardPayment(user.getHourlyRate(), "09:00", "11:00", "", 0));
        AITestSupport.invoke(page, "refreshCostLabel", new Class<?>[0]);
        assertTrue(total.getText().startsWith("Total Cost: $"));
        assertTrue(deposit.getText().startsWith("Deposit Due Now"));

        card.setText("1234567812345678");
        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handlePayment",
                new Class<?>[] { AppFrame.class }, app));

        AITestSupport.setField(RoomOptionsPage.class, "selectedRoomID", "CLH-205");
        card.setText("bad-card");
        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handlePayment",
                new Class<?>[] { AppFrame.class }, app));
        assertEquals("", card.getText());

        PaymentPage.setTypeOfPayment("book");
        BookingInformationPage.getInfo().get(0).setText("invalid");
        BookingInformationPage.getInfo().get(1).setText("09:00");
        BookingInformationPage.getInfo().get(2).setText("10:00");
        card.setText("1234567812345678");
        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handlePayment",
                new Class<?>[] { AppFrame.class }, app));

        BookingInformationPage.getInfo().get(0).setText("01/01/40");
        card.setText("1234567812345678");
        PaymentPage.paymentMethod(new CreditCardPayment(user.getHourlyRate(), "09:00", "10:00", "", 0));
        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handlePayment",
                new Class<?>[] { AppFrame.class }, app));
        assertEquals(1, BookingManager.getInstance().numOfBookings());
        assertEquals("6", RoomManager.getRoomManagerInstance().selectRoomID("CLH-205").getUserId());
        assertEquals(AppFrame.CARD_USER_OPTIONS, cards.getLastCard());

        AITestSupport.resetBookingManager();
        BookingManager.getInstance().createBooking("6", "CLH-205", "PAY-EXT",
                AITestSupport.date("2040-01-01 00:00"), "09:00", "10:00", 0, 20, user.getHourlyRate());
        ExtendBookingPage.refreshBookings(app);
        JTextField end = AITestSupport.getField(ExtendBookingPage.class, "endTimeInputField");
        end.setText("11:00");
        PaymentPage.setTypeOfPayment("extend");
        PaymentPage.paymentMethod(new DebitCardPayment(user.getHourlyRate(), "10:00", "11:00", "", -1));
        card.setText("1234567812345678");
        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handlePayment",
                new Class<?>[] { AppFrame.class }, app));
        assertEquals("11:00", BookingManager.getInstance().getBooking("PAY-EXT").getEndTime());
        assertEquals("", ExtendBookingPage.endTimeInputField());
    }

    @Test
    public void roomOptionsCoversConfirmAndCancelNavigation() {
        RoomOptionsPage page = new RoomOptionsPage(app);
        AITestSupport.invoke(page, "refreshRooms", new Class<?>[0]);
        JComboBox<?> dropdown = AITestSupport.getField(page, "roomDropdown");
        dropdown.setSelectedIndex(0);
        ((javax.swing.JButton) AITestSupport.getField(page, "confirm")).doClick(0);
        assertEquals(dropdown.getSelectedItem(), RoomOptionsPage.getSelectedRoomID());
        assertEquals(AppFrame.CARD_BOOKING_INFORMATION, cards.getLastCard());

        AITestSupport.invoke(page, "handleCancelButton", new Class<?>[] { AppFrame.class }, app);
        assertEquals(AppFrame.CARD_USER_OPTIONS, cards.getLastCard());
    }

    @Test
    public void badgeScannerCoversMissingDeniedAndGrantedAccess() {
        Student user = new Student("scan-user", "Secret1!", "scan@my.yorku.ca", 7, "S7");
        app.setCurrentUser(user);
        ScanBadgePage page = new ScanBadgePage(app);
        JComboBox<?> dropdown = AITestSupport.getField(page, "roomDropdown");
        JLabel result = AITestSupport.getField(page, "resultLabel");

        dropdown.removeAllItems();
        AITestSupport.invoke(page, "handleScan", new Class<?>[] { AppFrame.class }, app);
        assertEquals("No such room.", result.getText());

        AITestSupport.invoke(page, "refreshRooms", new Class<?>[0]);
        dropdown.setSelectedItem("CLH-205");
        AITestSupport.invoke(page, "handleScan", new Class<?>[] { AppFrame.class }, app);
        assertEquals("Access Denied", result.getText());

        BookingManager.getInstance().createBooking("7", "CLH-205", "SCAN-ACTIVE", new Date(), "00:00",
                "23:59", 20, 20, user.getHourlyRate());
        AITestSupport.invoke(page, "handleScan", new Class<?>[] { AppFrame.class }, app);
        Booking booking = BookingManager.getInstance().getBooking("SCAN-ACTIVE");
        assertEquals("Access Granted - Room now OCCUPIED", result.getText());
        assertTrue(booking.isCheckedIn());
        assertTrue(RoomManager.getRoomManagerInstance().selectRoomID("CLH-205").isOccupied());
    }

    @Test
    public void signUpCoversAllValidationPersistenceAndSuccessPaths() {
        SignUpPage page = new SignUpPage(app);
        JTextField username = AITestSupport.getField(page, "usernameField");
        JPasswordField password = AITestSupport.getField(page, "passwordField");
        JTextField email = AITestSupport.getField(page, "emailField");
        JComboBox<?> type = AITestSupport.getField(page, "userTypeBox");
        JTextField organization = AITestSupport.getField(page, "orgIdOrStudentNumberField");
        MaintainUser users = app.getMaintainUser();

        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handleSignUp",
                new Class<?>[] { AppFrame.class }, app));

        setSignUpFields(username, password, email, type, organization, "new", "Secret1!", "bad", "Student",
                "S1");
        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handleSignUp",
                new Class<?>[] { AppFrame.class }, app));

        setSignUpFields(username, password, email, type, organization, "new", "weak", "new@my.yorku.ca",
                "Student", "S1");
        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handleSignUp",
                new Class<?>[] { AppFrame.class }, app));

        users.addUser(new Partner("taken-user", "Secret1!", "taken@example.com", 1, "ORG"));
        setSignUpFields(username, password, email, type, organization, "taken-user", "Secret1!",
                "other@example.com", "Partner", "ORG2");
        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handleSignUp",
                new Class<?>[] { AppFrame.class }, app));

        setSignUpFields(username, password, email, type, organization, "other-user", "Secret1!",
                "taken@example.com", "Partner", "ORG3");
        AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handleSignUp",
                new Class<?>[] { AppFrame.class }, app));

        AITestSupport.preserveFile(AppFrame.USERS_CSV_PATH, () -> {
            setSignUpFields(username, password, email, type, organization, "created-user", "Secret1!",
                    "created@example.com", "Partner", "ORG4");
            AITestSupport.runClosingDialogs(() -> AITestSupport.invoke(page, "handleSignUp",
                    new Class<?>[] { AppFrame.class }, app));
        });
        assertTrue(users.usernameExists("created-user"));
        assertEquals(AppFrame.CARD_LOGIN, cards.getLastCard());
        assertEquals("", username.getText());

        AITestSupport.preserveFile(AppFrame.USERS_CSV_PATH, () -> {
            AITestSupport.makeDirectoryAtFilePath(AppFrame.USERS_CSV_PATH);
            setSignUpFields(username, password, email, type, organization, "save-failure", "Secret1!",
                    "save-failure@example.com", "Other", "ORG5");
            AITestSupport.runSilencingError(() -> AITestSupport.runClosingDialogs(() ->
                    AITestSupport.invoke(page, "handleSignUp", new Class<?>[] { AppFrame.class }, app)));
        });
    }

    private void assertPaymentStrategy(PaymentPlanPage page, String methodName, Class<?> expectedType) {
        AITestSupport.invoke(page, methodName, new Class<?>[] { AppFrame.class }, app);
        Context context = AITestSupport.getField(PaymentPage.class, "payment");
        assertEquals(expectedType, context.getPayment().getClass());
        assertEquals(AppFrame.CARD_PAYMENT, cards.getLastCard());
    }

    private static void setAdminFields(JTextField username, JTextField email, JPasswordField password,
            String usernameValue, String emailValue, String passwordValue) {
        username.setText(usernameValue);
        email.setText(emailValue);
        password.setText(passwordValue);
    }

    private static void setLoginFields(JTextField username, JPasswordField password, String usernameValue,
            String passwordValue) {
        username.setText(usernameValue);
        password.setText(passwordValue);
    }

    private static void setSignUpFields(JTextField username, JPasswordField password, JTextField email,
            JComboBox<?> type, JTextField organization, String usernameValue, String passwordValue,
            String emailValue, String typeValue, String organizationValue) {
        username.setText(usernameValue);
        password.setText(passwordValue);
        email.setText(emailValue);
        type.setSelectedItem(typeValue);
        organization.setText(organizationValue);
    }
}

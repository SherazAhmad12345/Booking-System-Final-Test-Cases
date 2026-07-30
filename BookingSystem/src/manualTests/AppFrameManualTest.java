package manualTests;

import static org.junit.Assert.*;

import java.awt.CardLayout;
import java.awt.Component;
import java.lang.reflect.Field;

import javax.swing.JPanel;
import javax.swing.JTextField;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import administratorManagement.Administrator;
import gui.AppFrame;

public class AppFrameManualTest {

    private AppFrame app;

    @Before
    public void setUp() {
        app = AppFrame.getInstance();
        app.setVisible(false);
    }

    @After
    public void tearDown() {
        app.setVisible(false);
    }

    @Test
    public void testSingletonInstance() {
        assertSame(AppFrame.getInstance(), AppFrame.getInstance());
    }

    @Test
    public void testFrameTitleAndSize() {
        assertEquals("York's Booking Manager", app.getTitle());
        assertEquals(500, app.getWidth());
        assertEquals(450, app.getHeight());
    }

    @Test
    public void testMaintainUserAndAdministratorObjectsExist() {
        assertNotNull(app.getMaintainUser());
        assertNotNull(app.getMaintainAdministrator());
    }

    @Test
    public void testCardContainerUsesCardLayout() throws Exception {
        JPanel container = getCardContainer();
        assertTrue(container.getLayout() instanceof CardLayout);
    }

    @Test
    public void testAllMainCardsWereAdded() throws Exception {
        JPanel container = getCardContainer();
        assertTrue("AppFrame should contain all GUI cards.", container.getComponentCount() >= 15);
    }

    @Test
    public void testShowWelcomeCard() throws Exception {
        app.showCard(AppFrame.CARD_WELCOME);
        assertEquals("WelcomePage", getVisibleCardSimpleName());
    }

    @Test
    public void testShowSignUpCard() throws Exception {
        app.showCard(AppFrame.CARD_SIGNUP);
        assertEquals("SignUpPage", getVisibleCardSimpleName());
    }

    @Test
    public void testShowAdministratorOptionsCard() throws Exception {
        app.showCard(AppFrame.CARD_ADMINISTRATOR_OPTIONS);
        assertEquals("AdministratorOptionPage", getVisibleCardSimpleName());
    }

    @Test
    public void testShowCreateNewRoomCard() throws Exception {
        app.showCard(AppFrame.CARD_CREATE_NEW_ROOM);
        assertEquals("CreateNewRoomPage", getVisibleCardSimpleName());
    }

    @Test
    public void testSetAndGetCurrentAdministrator() {
        Administrator admin = new Administrator("TestAdmin", "Abc123$#", "admin@yorku.ca", 500);
        app.setCurrentAdministrator(admin);
        assertSame(admin, app.getCurrentAdministrator());
    }

    @Test
    public void testSetCurrentAdministratorToNull() {
        app.setCurrentAdministrator(null);
        assertNull(app.getCurrentAdministrator());
    }

    @Test
    public void testClearAllFieldsClearsDirectTextFields() {
        JPanel panel = new JPanel();
        JTextField field1 = new JTextField("hello");
        JTextField field2 = new JTextField("world");
        panel.add(field1);
        panel.add(field2);

        app.clearAllFields(panel);

        assertEquals("", field1.getText());
        assertEquals("", field2.getText());
    }

    private JPanel getCardContainer() throws Exception {
        Field field = AppFrame.class.getDeclaredField("cardContainer");
        field.setAccessible(true);
        return (JPanel) field.get(app);
    }

    private String getVisibleCardSimpleName() throws Exception {
        for (Component component : getCardContainer().getComponents()) {
            if (component.isVisible()) {
                return component.getClass().getSimpleName();
            }
        }
        return "";
    }
}

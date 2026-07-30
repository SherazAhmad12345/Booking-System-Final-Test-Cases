package manualTests;

import static org.junit.Assert.*;

import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.junit.Before;
import org.junit.Test;

import gui.AdministratorOptionPage;
import gui.AppFrame;

public class AdministratorOptionPageManualTest {

    private AppFrame app;
    private AdministratorOptionPage page;

    @Before
    public void setUp() throws Exception {
        app = AppFrame.getInstance();
        app.setVisible(false);
        page = getCard(AdministratorOptionPage.class);
    }

    @Test
    public void testPageExists() {
        assertNotNull(page);
    }

    @Test
    public void testUsesGridBagLayout() {
        assertTrue(page.getLayout() instanceof GridBagLayout);
    }

    @Test
    public void testHasThreeButtons() {
        assertEquals(3, findAll(page, JButton.class).size());
    }

    @Test
    public void testAddRoomsButtonExists() {
        assertNotNull(findButton(page, "Add Rooms"));
    }

    @Test
    public void testManageRoomsButtonExists() {
        assertNotNull(findButton(page, "Manage Rooms"));
    }

    @Test
    public void testLogoutButtonExists() {
        assertNotNull(findButton(page, "logout"));
    }

    @Test
    public void testNoTextFieldsOnMenuPage() {
        assertEquals(0, findAll(page, JTextField.class).size());
    }

    @Test
    public void testAddRoomsButtonShowsCreateRoomCard() throws Exception {
        findButton(page, "Add Rooms").doClick();
        assertEquals("CreateNewRoomPage", getVisibleCardSimpleName());
    }

    @Test
    public void testManageRoomsButtonShowsManageRoomsCard() throws Exception {
        findButton(page, "Manage Rooms").doClick();
        assertEquals("ManageRoomsPage", getVisibleCardSimpleName());
    }

    @Test
    public void testLogoutButtonShowsWelcomeCard() throws Exception {
        findButton(page, "logout").doClick();
        assertEquals("WelcomePage", getVisibleCardSimpleName());
    }

    @Test
    public void testButtonTextOrder() {
        List<JButton> buttons = findAll(page, JButton.class);
        assertEquals("Add Rooms", buttons.get(0).getText());
        assertEquals("Manage Rooms", buttons.get(1).getText());
        assertEquals("logout", buttons.get(2).getText());
    }

    private <T> T getCard(Class<T> type) throws Exception {
        for (Component component : getCardContainer().getComponents()) {
            if (type.isInstance(component)) {
                return type.cast(component);
            }
        }
        return null;
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

    private JButton findButton(Container root, String text) {
        for (JButton button : findAll(root, JButton.class)) {
            if (text.equals(button.getText())) {
                return button;
            }
        }
        return null;
    }

    private <T extends Component> List<T> findAll(Container root, Class<T> type) {
        List<T> matches = new ArrayList<T>();
        for (Component component : root.getComponents()) {
            if (type.isInstance(component)) {
                matches.add(type.cast(component));
            }
            if (component instanceof Container) {
                matches.addAll(findAll((Container) component, type));
            }
        }
        return matches;
    }
}

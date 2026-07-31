package AITests;

import static org.junit.Assert.*;

import org.junit.Test;

import gui.AdministratorOptionPage;

public class AdministratorOptionPageTest {
    @Test
    public void buildsAllAdministratorNavigationButtons() {
        AdministratorOptionPage page = AITestSupport.onEdt(() -> new AdministratorOptionPage(null));
        assertNotNull(AITestSupport.findButton(page, "Add Rooms"));
        assertNotNull(AITestSupport.findButton(page, "Manage Rooms"));
        assertNotNull(AITestSupport.findButton(page, "logout"));
        assertEquals(1, page.getComponentCount());
    }
}

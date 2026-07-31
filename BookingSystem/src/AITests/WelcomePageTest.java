package AITests;

import static org.junit.Assert.*;

import java.awt.BorderLayout;

import org.junit.Test;

import gui.WelcomePage;

public class WelcomePageTest {
    @Test
    public void buildsWelcomeTitleAndNavigationButtons() {
        WelcomePage page = new WelcomePage(null);
        assertTrue(page.getLayout() instanceof BorderLayout);
        assertNotNull(AITestSupport.findButton(page, "Sign Up"));
        assertNotNull(AITestSupport.findButton(page, "Login"));
    }
}

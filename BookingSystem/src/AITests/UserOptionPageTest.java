package AITests;

import static org.junit.Assert.*;

import org.junit.Test;

import gui.UserOptionPage;

public class UserOptionPageTest {
    @Test
    public void buildsEveryUserNavigationButton() {
        UserOptionPage page = new UserOptionPage(null);
        assertNotNull(AITestSupport.findButton(page, "Book Room"));
        assertNotNull(AITestSupport.findButton(page, "Extend Booking"));
        assertNotNull(AITestSupport.findButton(page, "Cancel Booking"));
        assertNotNull(AITestSupport.findButton(page, "Scan Badge (Room Entry)"));
        assertNotNull(AITestSupport.findButton(page, "Logout"));
    }
}

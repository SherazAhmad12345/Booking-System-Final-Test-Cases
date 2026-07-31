package AITests;

import static org.junit.Assert.*;
import org.junit.Test;
import userManagement.Partner;

public class PartnerTest {
    @Test
    public void reportsPartnerTypeAndRate() {
        Partner user = new Partner("u", "p", "e", 1, "O1");
        assertEquals("Partner", user.getUserType());
        assertEquals(50, user.getHourlyRate());
        assertNotNull(new Partner());
    }
}

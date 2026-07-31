package AITests;

import static org.junit.Assert.*;
import org.junit.Test;
import userManagement.Staff;

public class StaffTest {
    @Test
    public void reportsStaffTypeAndRate() {
        Staff user = new Staff("u", "p", "e", 1, "O1");
        assertEquals("Staff", user.getUserType());
        assertEquals(40, user.getHourlyRate());
        assertNotNull(new Staff());
    }
}

package AITests;

import static org.junit.Assert.*;
import org.junit.Test;
import userManagement.Faculty;

public class FacultyTest {
    @Test
    public void reportsFacultyTypeAndRate() {
        Faculty user = new Faculty("u", "p", "e", 1, "O1");
        assertEquals("Faculty", user.getUserType());
        assertEquals(30, user.getHourlyRate());
        assertNotNull(new Faculty());
    }
}

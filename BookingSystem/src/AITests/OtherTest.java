package AITests;

import static org.junit.Assert.*;
import org.junit.Test;
import userManagement.Other;

public class OtherTest {
    @Test
    public void reportsOtherTypeAndRate() {
        Other user = new Other("u", "p", "e", 1, "X1");
        assertEquals("Other", user.getUserType());
        assertEquals(50, user.getHourlyRate());
        assertNotNull(new Other());
    }
}

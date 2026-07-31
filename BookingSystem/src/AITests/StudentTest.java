package AITests;

import static org.junit.Assert.*;
import org.junit.Test;
import userManagement.Student;

public class StudentTest {
    @Test
    public void reportsStudentTypeAndRate() {
        Student user = new Student("u", "p", "e", 1, "S1");
        assertEquals("Student", user.getUserType());
        assertEquals(20, user.getHourlyRate());
        assertNotNull(new Student());
    }
}

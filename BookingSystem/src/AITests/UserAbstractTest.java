package AITests;

import static org.junit.Assert.*;

import org.junit.Test;

import userManagement.Student;
import userManagement.User;

public class UserAbstractTest {
    @Test
    public void commonUserFieldsCanBeReadAndUpdated() {
        User user = new Student("alice", "Strong1!", "alice@my.yorku.ca", 4, "S123");
        assertEquals("alice", user.getUsername());
        assertEquals("Strong1!", user.getPassword());
        assertEquals("alice@my.yorku.ca", user.getEmail());
        assertEquals(4, user.getId());
        assertEquals("S123", user.getOrgIdOrStudentNumber());
        assertTrue(user.checkPassword("Strong1!"));
        assertFalse(user.checkPassword("wrong"));

        user.setUsername("bob");
        user.setPassword("New2@");
        user.setEmail("bob@my.yorku.ca");
        user.setId(9);
        user.setOrgIdOrStudentNumber("S999");
        assertEquals("bob", user.getUsername());
        assertEquals("New2@", user.getPassword());
        assertEquals("bob@my.yorku.ca", user.getEmail());
        assertEquals(9, user.getId());
        assertEquals("S999", user.getOrgIdOrStudentNumber());
        assertTrue(user.toString().contains("Student"));
    }

    @Test
    public void nullPasswordNeverAuthenticates() {
        User user = new Student();
        assertFalse(user.checkPassword(null));
        assertNull(user.getUsername());
    }
}

package AITests;

import static org.junit.Assert.*;

import org.junit.Test;

import userManagement.Faculty;
import userManagement.Other;
import userManagement.Partner;
import userManagement.Staff;
import userManagement.Student;
import userManagement.UserFactory;

public class UserFactoryTest {
    @Test
    public void createsEverySupportedUserTypeIgnoringCaseAndWhitespace() {
        assertNotNull(new UserFactory());
        assertTrue(UserFactory.createUser(" student ", "u", "p", "e", 1, "x") instanceof Student);
        assertTrue(UserFactory.createUser("FACULTY", "u", "p", "e", 1, "x") instanceof Faculty);
        assertTrue(UserFactory.createUser("staff", "u", "p", "e", 1, "x") instanceof Staff);
        assertTrue(UserFactory.createUser("partner", "u", "p", "e", 1, "x") instanceof Partner);
        assertTrue(UserFactory.createUser("other", "u", "p", "e", 1, "x") instanceof Other);
    }

    @Test(expected = IllegalArgumentException.class)
    public void rejectsNullType() {
        UserFactory.createUser(null, "u", "p", "e", 1, "x");
    }

    @Test(expected = IllegalArgumentException.class)
    public void rejectsUnknownType() {
        UserFactory.createUser("visitor", "u", "p", "e", 1, "x");
    }

    @Test
    public void validatesStrongPasswords() {
        assertTrue(UserFactory.isStrongPassword("Strong1!"));
        assertFalse(UserFactory.isStrongPassword("Short1!"));
        assertFalse(UserFactory.isStrongPassword("noupper1!"));
        assertFalse(UserFactory.isStrongPassword("NOLOWER1!"));
        assertFalse(UserFactory.isStrongPassword("NoDigit!"));
        assertFalse(UserFactory.isStrongPassword("NoSymbol1"));
    }

    @Test
    public void validatesEmailRulesByUserType() {
        assertTrue(UserFactory.isValidEmail("name@my.yorku.ca", "Student"));
        assertFalse(UserFactory.isValidEmail("name@yorku.ca", "Student"));
        assertTrue(UserFactory.isValidEmail("name@yorku.ca", "Faculty"));
        assertTrue(UserFactory.isValidEmail("name@yorku.ca", "Staff"));
        assertFalse(UserFactory.isValidEmail("name@my.yorku.ca", "Staff"));
        assertTrue(UserFactory.isValidEmail("name@example.com", "Other"));
        assertTrue(UserFactory.isValidEmail("name@example.com", "Partner"));
        assertFalse(UserFactory.isValidEmail("name@example", "Other"));
        assertFalse(UserFactory.isValidEmail(null, "Other"));
        assertFalse(UserFactory.isValidEmail("", "Other"));
    }
}

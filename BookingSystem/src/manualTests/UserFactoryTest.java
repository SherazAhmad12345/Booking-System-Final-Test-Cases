package manualTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import userManagement.User;
import userManagement.UserFactory;

public class UserFactoryTest {

	User student;
	User faculty;
	User other;
	User partner;
	User staff;
	User unknown;

	@Before
	public void setup() {
		student = UserFactory.createUser("Student", "username1", "password1", "email1", 1, "1");
		faculty = UserFactory.createUser("Faculty", "username2", "password2", "email2", 2, "2");
		other = UserFactory.createUser("Other", "username3", "password3", "email3", 3, "3");
		partner = UserFactory.createUser("Partner", "username4", "password4", "email4", 4, "4");
		staff = UserFactory.createUser("Staff", "username5", "password5", "email5", 5, "5");

	}

	@Test
	public void createUserTest() {
		assertEquals("Incorrect user type.", student.getUserType(), "Student");
		assertEquals("Incorrect user type.", faculty.getUserType(), "Faculty");
		assertEquals("Incorrect user type.", other.getUserType(), "Other");
		assertEquals("Incorrect user type.", partner.getUserType(), "Partner");
		assertEquals("Incorrect user type.", staff.getUserType(), "Staff");
		assertThrows(IllegalArgumentException.class, () -> {
			unknown = UserFactory.createUser("Unknown", "username5", "password5", "email5", 5, "5");
			;
		});
	}

	@Test
	public void isStrongPassword() {
		assertFalse("Returned true despite password being weak.", UserFactory.isStrongPassword("s"));
		assertFalse("Returned true despite password being weak.", UserFactory.isStrongPassword("sherazahmad"));
		assertFalse("Returned true despite password being weak.", UserFactory.isStrongPassword("sherazahmad1"));
		assertFalse("Returned true despite password being weak.", UserFactory.isStrongPassword("sheraz@ahmad1"));
		assertTrue("Returned false despite password being strong.", UserFactory.isStrongPassword("Sheraz@ahmad1"));
	}

	@Test
	public void isValidEmail() {
		assertFalse("Returned true despite having empty email input.", UserFactory.isValidEmail("", "Other"));
		assertFalse("Returned true despite having null email input.", UserFactory.isValidEmail(null, "Other"));
		assertFalse("Returned true despite missing required @my.yorku.ca.", UserFactory.isValidEmail("orku.ca", "Student"));
		assertFalse("Returned true despite missing required text before @my.yorku.ca.", UserFactory.isValidEmail("@my.yorku.ca", "Student"));
		assertTrue("Returned false despite meeting the format requirments for student emails.", UserFactory.isValidEmail("sha@my.yorku.ca", "Student"));
		assertFalse("Returned true despite missing required @yorku.ca.", UserFactory.isValidEmail("orku.ca", "Faculty"));
		assertFalse("Returned true despite missing required text before @yorku.ca.", UserFactory.isValidEmail("@yorku.ca", "Faculty"));
		assertTrue("Returned false despite meeting the format requirements for faculty emails.", UserFactory.isValidEmail("sha@yorku.ca", "Faculty"));
		assertFalse("Returned true despite missing required @yorku.ca.", UserFactory.isValidEmail("orku.ca", "Staff"));
		assertFalse("Returned true despite missing required text before @yorku.ca", UserFactory.isValidEmail("@yorku.ca", "Staff"));
		assertTrue("Returned false despite meeting the format requirements for staff emails.", UserFactory.isValidEmail("sha@yorku.ca", "Staff"));
		assertFalse("Returned true despite missing text before the @ symbol.", UserFactory.isValidEmail("@gmail.com", "Partner"));
		assertFalse("Returned true despite missing a . after the @ symbol.", UserFactory.isValidEmail("nam.e@gmailcom", "Partner"));
		assertFalse("Returned true despite having a . as the last symbol in the string input.", UserFactory.isValidEmail("name@gmail.com.", "Partner"));
		assertTrue("Returned false despite meeting all non-university email requirments.", UserFactory.isValidEmail("name@gmail.com", "Partner"));
	}
}

package manualTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import userManagement.Faculty;
import userManagement.Other;
import userManagement.Partner;
import userManagement.Staff;
import userManagement.Student;
import userManagement.User;

public class UserTypeManualTest {

	User faculty;
	User student;
	User staff;
	User partner;
	User other;

	@Before
	public void setup() {
		faculty = new Faculty("username1", "password1", "email1", 0, "0");
		student = new Student("username2", "password2", "email2", 1, "1");
		staff = new Staff("username3", "password3", "email3", 2, "2");
		partner = new Partner("username4", "password4", "email4", 3, "3");
		other = new Other("username5", "password5", "email5", 4, "4");
	}

	@Test
	public void testGetters() {
		assertTrue("getUsername() did not return expected result for faculty.", faculty.getUsername() == "username1");
		assertTrue("getUsername() did not return expected result for student.", student.getUsername() == "username2");
		assertTrue("getUsername() did not return expected result for staff.", staff.getUsername() == "username3");
		assertTrue("getUsername() did not return expected result for partner.", partner.getUsername() == "username4");
		assertTrue("getUsername() did not return expected result for other.", other.getUsername() == "username5");

		assertTrue("getPassword() did not return expected result for faculty.", faculty.getPassword() == "password1");
		assertTrue("getPassword() did not return expected result for student.", student.getPassword() == "password2");
		assertTrue("getPassword() did not return expected result for staff.", staff.getPassword() == "password3");
		assertTrue("getPassword() did not return expected result for partner.", partner.getPassword() == "password4");
		assertTrue("getPassword() did not return expected result for other.", other.getPassword() == "password5");

		assertTrue("getEmail() did not return expected result for faculty.", faculty.getEmail() == "email1");
		assertTrue("getEmail() did not return expected result for student.", student.getEmail() == "email2");
		assertTrue("getEmail() did not return expected result for staff.", staff.getEmail() == "email3");
		assertTrue("getEmail() did not return expected result for partner.", partner.getEmail() == "email4");
		assertTrue("getEmail() did not return expected result for other.", other.getEmail() == "email5");

		assertTrue("getID() did not return expected result for faculty.", faculty.getId() == 0);
		assertTrue("getID() did not return expected result for student.", student.getId() == 1);
		assertTrue("getID() did not return expected result for staff.", staff.getId() == 2);
		assertTrue("getID() did not return expected result for partner.", partner.getId() == 3);
		assertTrue("getID() did not return expected result for other.", other.getId() == 4);

		assertTrue("getOrgIdOrStudentNumber() did not return expected result for faculty.",
				faculty.getOrgIdOrStudentNumber() == "0");
		assertTrue("getOrgIdOrStudentNumber() did not return expected result for student.",
				student.getOrgIdOrStudentNumber() == "1");
		assertTrue("getOrgIdOrStudentNumber() did not return expected result for staff.",
				staff.getOrgIdOrStudentNumber() == "2");
		assertTrue("getOrgIdOrStudentNumber() did not return expected result for partner.",
				partner.getOrgIdOrStudentNumber() == "3");
		assertTrue("getOrgIdOrStudentNumber() did not return expected result for other.",
				other.getOrgIdOrStudentNumber() == "4");

		assertTrue("getHourlyRate() did not return expected result for faculty.", faculty.getHourlyRate() == 30);
		assertTrue("getHourlyRate() did not return expected result for student.", student.getHourlyRate() == 20);
		assertTrue("getHourlyRate() did not return expected result for staff.", staff.getHourlyRate() == 40);
		assertTrue("getHourlyRate() did not return expected result for partner.", partner.getHourlyRate() == 50);
		assertTrue("getID() did not return expected result for other.", other.getHourlyRate() == 50);

		assertTrue("getUserType() did not return expected result for faculty.", faculty.getUserType() == "Faculty");
		assertTrue("getUserType() did not return expected result for student.", student.getUserType() == "Student");
		assertTrue("getUserType() did not return expected result for staff.", staff.getUserType() == "Staff");
		assertTrue("getUserType() did not return expected result for partner.", partner.getUserType() == "Partner");
		assertTrue("getUserType() did not return expected result for other.", other.getUserType() == "Other");
	}

	@Test
	public void testSetters() {
		faculty.setEmail("email10");
		faculty.setPassword("password10");
		faculty.setUsername("username10");
		faculty.setId(10);
		faculty.setOrgIdOrStudentNumber("10");

		student.setEmail("email11");
		student.setPassword("password11");
		student.setUsername("username11");
		student.setId(11);
		student.setOrgIdOrStudentNumber("11");
		
		staff.setEmail("email12");
		staff.setPassword("password12");
		staff.setUsername("username12");
		staff.setId(12);
		staff.setOrgIdOrStudentNumber("12");

		partner.setEmail("email13");
		partner.setPassword("password13");
		partner.setUsername("username13");
		partner.setId(13);
		partner.setOrgIdOrStudentNumber("13");

		other.setEmail("email14");
		other.setPassword("password14");
		other.setUsername("username14");
		other.setId(14);
		other.setOrgIdOrStudentNumber("14");

		assertTrue("getUsername() did not return expected result for faculty.", faculty.getUsername() == "username10");
		assertTrue("getUsername() did not return expected result for student.", student.getUsername() == "username11");
		assertTrue("getUsername() did not return expected result for staff.", staff.getUsername() == "username12");
		assertTrue("getUsername() did not return expected result for partner.", partner.getUsername() == "username13");
		assertTrue("getUsername() did not return expected result for other.", other.getUsername() == "username14");

		assertTrue("getPassword() did not return expected result for faculty.", faculty.getPassword() == "password10");
		assertTrue("getPassword() did not return expected result for student.", student.getPassword() == "password11");
		assertTrue("getPassword() did not return expected result for staff.", staff.getPassword() == "password12");
		assertTrue("getPassword() did not return expected result for partner.", partner.getPassword() == "password13");
		assertTrue("getPassword() did not return expected result for other.", other.getPassword() == "password14");

		assertTrue("getEmail() did not return expected result for faculty.", faculty.getEmail() == "email10");
		assertTrue("getEmail() did not return expected result for student.", student.getEmail() == "email11");
		assertTrue("getEmail() did not return expected result for staff.", staff.getEmail() == "email12");
		assertTrue("getEmail() did not return expected result for partner.", partner.getEmail() == "email13");
		assertTrue("getEmail() did not return expected result for other.", other.getEmail() == "email14");

		assertTrue("getID() did not return expected result for faculty.", faculty.getId() == 10);
		assertTrue("getID() did not return expected result for student.", student.getId() == 11);
		assertTrue("getID() did not return expected result for staff.", staff.getId() == 12);
		assertTrue("getID() did not return expected result for partner.", partner.getId() == 13);
		assertTrue("getID() did not return expected result for other.", other.getId() == 14);

		assertTrue("getOrgIdOrStudentNumber() did not return expected result for faculty.",
				faculty.getOrgIdOrStudentNumber() == "10");
		assertTrue("getOrgIdOrStudentNumber() did not return expected result for student.",
				student.getOrgIdOrStudentNumber() == "11");
		assertTrue("getOrgIdOrStudentNumber() did not return expected result for staff.",
				staff.getOrgIdOrStudentNumber() == "12");
		assertTrue("getOrgIdOrStudentNumber() did not return expected result for partner.",
				partner.getOrgIdOrStudentNumber() == "13");
		assertTrue("getOrgIdOrStudentNumber() did not return expected result for other.",
				other.getOrgIdOrStudentNumber() == "14");

	}

	@Test
	public void toStringTest() {
       assertEquals(student.toString(), "Student" + " [username=" + "username2" + ", email=" + "email2" + ", id=1]", "toString() method does not produce expected output");
	}
}
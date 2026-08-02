package manualTests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import userManagement.Faculty;
import userManagement.Other;
import userManagement.Partner;
import userManagement.Staff;
import userManagement.Student;

public class UserChildTypeManualTest {

	Faculty faculty;
	Student student;
	Staff staff;
	Partner partner;
	Other other;

	@Before
	public void setup() {
		faculty = new Faculty("username1", "password1", "email1", 0, "0");
		student = new Student("username2", "password2", "email2", 1, "1");
		staff = new Staff("username3", "password3", "email3", 2, "2");
		partner = new Partner("username4", "password4", "email4", 3, "3");
		other = new Other("username5", "password5", "email5", 4, "4");
	}

	// Test the getters for each user type
	@Test
	public void testGetUsername() {
		assertTrue("getUsername() did not return expected result for faculty.", faculty.getUsername() == "username1");
		assertTrue("getUsername() did not return expected result for student.", student.getUsername() == "username2");
		assertTrue("getUsername() did not return expected result for staff.", staff.getUsername() == "username3");
		assertTrue("getUsername() did not return expected result for partner.", partner.getUsername() == "username4");
		assertTrue("getUsername() did not return expected result for other.", other.getUsername() == "username5");
	}
	@Test
	public void testGetPassword() {
		assertTrue("getPassword() did not return expected result for faculty.", faculty.getPassword() == "password1");
		assertTrue("getPassword() did not return expected result for student.", student.getPassword() == "password2");
		assertTrue("getPassword() did not return expected result for staff.", staff.getPassword() == "password3");
		assertTrue("getPassword() did not return expected result for partner.", partner.getPassword() == "password4");
		assertTrue("getPassword() did not return expected result for other.", other.getPassword() == "password5");
	}
	@Test
	public void testGetEmail() {
		assertTrue("getEmail() did not return expected result for faculty.", faculty.getEmail() == "email1");
		assertTrue("getEmail() did not return expected result for student.", student.getEmail() == "email2");
		assertTrue("getEmail() did not return expected result for staff.", staff.getEmail() == "email3");
		assertTrue("getEmail() did not return expected result for partner.", partner.getEmail() == "email4");
		assertTrue("getEmail() did not return expected result for other.", other.getEmail() == "email5");
	}
	@Test
	public void testGetId() {
		assertTrue("getID() did not return expected result for faculty.", faculty.getId() == 0);
		assertTrue("getID() did not return expected result for student.", student.getId() == 1);
		assertTrue("getID() did not return expected result for staff.", staff.getId() == 2);
		assertTrue("getID() did not return expected result for partner.", partner.getId() == 3);
		assertTrue("getID() did not return expected result for other.", other.getId() == 4);
	}
	@Test
	public void testGetOrgIdOrStudentNumber() {
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
	}
	@Test
	public void testGetHourlyRate() {
		assertTrue("getHourlyRate() did not return expected result for faculty.", faculty.getHourlyRate() == 30);
		assertTrue("getHourlyRate() did not return expected result for student.", student.getHourlyRate() == 20);
		assertTrue("getHourlyRate() did not return expected result for staff.", staff.getHourlyRate() == 40);
		assertTrue("getHourlyRate() did not return expected result for partner.", partner.getHourlyRate() == 50);
		assertTrue("getID() did not return expected result for other.", other.getHourlyRate() == 50);
	}
	@Test
	public void testGetUserType() {
		assertTrue("getUserType() did not return expected result for faculty.", faculty.getUserType() == "Faculty");
		assertTrue("getUserType() did not return expected result for student.", student.getUserType() == "Student");
		assertTrue("getUserType() did not return expected result for staff.", staff.getUserType() == "Staff");
		assertTrue("getUserType() did not return expected result for partner.", partner.getUserType() == "Partner");
		assertTrue("getUserType() did not return expected result for other.", other.getUserType() == "Other");
	}
	
	// Test the setters for each user type
	@Test
	public void testSettersForFaculty() {
		faculty.setEmail("email10");
		faculty.setPassword("password10");
		faculty.setUsername("username10");
		faculty.setId(10);
		faculty.setOrgIdOrStudentNumber("10");
		

		assertTrue("getUsername() did not return expected result for faculty.", faculty.getUsername() == "username10");
		assertTrue("getPassword() did not return expected result for faculty.", faculty.getPassword() == "password10");
		assertTrue("getEmail() did not return expected result for faculty.", faculty.getEmail() == "email10");
		assertTrue("getID() did not return expected result for faculty.", faculty.getId() == 10);
		assertTrue("getOrgIdOrStudentNumber() did not return expected result for faculty.",
				faculty.getOrgIdOrStudentNumber() == "10");
	}
	@Test
	public void testSettersForStudent() {
		student.setEmail("email21");
		student.setPassword("password21");
		student.setUsername("username21");
		student.setId(21);
		student.setOrgIdOrStudentNumber("21");

		assertTrue("getUsername() did not return expected result for student.", student.getUsername() == "username21");
		assertTrue("getPassword() did not return expected result for student.", student.getPassword() == "password21");
		assertTrue("getEmail() did not return expected result for student.", student.getEmail() == "email21");
		assertTrue("getID() did not return expected result for student.", student.getId() == 21);
		assertTrue("getOrgIdOrStudentNumber() did not return expected result for student.",
				student.getOrgIdOrStudentNumber() == "21");
	}
	@Test
	public void testSettersForStaff() {
		staff.setEmail("email32");
		staff.setPassword("password32");
		staff.setUsername("username32");
		staff.setId(32);
		staff.setOrgIdOrStudentNumber("32");

		assertTrue("getUsername() did not return expected result for staff.", staff.getUsername() == "username32");
		assertTrue("getPassword() did not return expected result for staff.", staff.getPassword() == "password32");
		assertTrue("getEmail() did not return expected result for staff.", staff.getEmail() == "email32");
		assertTrue("getID() did not return expected result for staff.", staff.getId() == 32);
		assertTrue("getOrgIdOrStudentNumber() did not return expected result for staff.",
				staff.getOrgIdOrStudentNumber() == "32");
	}
	@Test
	public void testSettersForPartner() {
		partner.setEmail("email43");
		partner.setPassword("password43");
		partner.setUsername("username43");
		partner.setId(43);
		partner.setOrgIdOrStudentNumber("43");

		assertTrue("getUsername() did not return expected result for partner.", partner.getUsername() == "username43");
		assertTrue("getPassword() did not return expected result for partner.", partner.getPassword() == "password43");
		assertTrue("getEmail() did not return expected result for partner.", partner.getEmail() == "email43");
		assertTrue("getID() did not return expected result for partner.", partner.getId() == 43);
		assertTrue("getOrgIdOrStudentNumber() did not return expected result for partner.",
				partner.getOrgIdOrStudentNumber() == "43");
	}
	@Test
	public void testSettersForOther() {
		other.setEmail("email14");
		other.setPassword("password14");
		other.setUsername("username14");
		other.setId(14);
		other.setOrgIdOrStudentNumber("14");
		
		assertTrue("getUsername() did not return expected result for other.", other.getUsername() == "username14");
		assertTrue("getPassword() did not return expected result for other.", other.getPassword() == "password14");
		assertTrue("getEmail() did not return expected result for other.", other.getEmail() == "email14");
		assertTrue("getID() did not return expected result for other.", other.getId() == 14);
		assertTrue("getOrgIdOrStudentNumber() did not return expected result for other.",
				other.getOrgIdOrStudentNumber() == "14");
	}
	
	// Test the checkPassword() method for each user type
	@Test
	public void testCheckPasswordFaculty() {
		assertTrue("checkPassword() did not return expected result for faculty.", faculty.checkPassword("password1"));
	}
	@Test
	public void testCheckPasswordStudent() {
		assertTrue("checkPassword() did not return expected result for student.", student.checkPassword("password2"));		
	}
	@Test
	public void testCheckPasswordStaff() {
		assertTrue("checkPassword() did not return expected result for staff.", staff.checkPassword("password3"));		
	}
	@Test
	public void testCheckPasswordPartner() {
		assertTrue("checkPassword() did not return expected result for partner.", partner.checkPassword("password4"));		
	}
	@Test
	public void testCheckPasswordOther() {
		assertTrue("checkPassword() did not return expected result for other.", other.checkPassword("password5"));		
	}
	
	// Test the toString() method for each user type
	@Test
	public void toStringTest1() {
       assertEquals(student.toString(), "Student" + " [username=" + "username2" + ", email=" + "email2" + ", id=1]", "toString() method does not produce expected output");
	}
	@Test
	public void toStringTest2() {
	   assertEquals(faculty.toString(), "Faculty" + " [username=" + "username1" + ", email=" + "email1" + ", id=0]", "toString() method does not produce expected output");
	}
	@Test
	public void toStringTest3() {
	   assertEquals(staff.toString(), "Staff" + " [username=" + "username3" + ", email=" + "email3" + ", id=2]", "toString() method does not produce expected output");
	}
	@Test
	public void toStringTest4() {
		assertEquals(partner.toString(), "Partner" + " [username=" + "username4" + ", email=" + "email4" + ", id=3]", "toString() method does not produce expected output");
	}
	@Test
	public void toStringTest5() {
		assertEquals(other.toString(), "Other" + " [username=" + "username5" + ", email=" + "email5" + ", id=4]", "toString() method does not produce expected output");
	}
}
package manualTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import dataManagement.MaintainUser;
import userManagement.Faculty;
import userManagement.Other;
import userManagement.Partner;
import userManagement.Staff;
import userManagement.Student;
import userManagement.User;

public class MaintainUserManualTest {
	private MaintainUser maintainUser;
	private String testPath = "data/testUsers.csv";
	private File testFile;
	
	@Before
	public void setUp()
	{
		maintainUser = new MaintainUser();
		testFile = new File(testPath);
	}
	
	@After
	public void clearUp()
	{
		testFile.delete();
		maintainUser.users.clear();
	}
	
	@Test
	public void testAddValidUsers()
	{
		User user1 = new Student("John", "Ddc123S#", "john@my.yorku.ca", 1, "123456789");
		
		//User if not added yet so size should be 0
		assertEquals(0, maintainUser.users.size());
		
		//User is added
		maintainUser.addUser(user1);
		assertEquals(1, maintainUser.users.size());
		assertSame(user1, maintainUser.users.get(0));
		
		//Testing with other types of users
		User user2 = new Staff("Danny", "Adc123S#", "danny@yorku.ca", 2, "113456789");
		User user3 = new Faculty("Ava", "Bdc123##", "ava@yorku.ca", 3, "333456789");
		User user4 = new Other("Bob", "Ddc555##", "bob@hotmail.com", 4, "444556789");
		User user5 = new Partner("Asa", "Aaa789S#", "asa@gmail.com", 5, "55556789");
		maintainUser.addUser(user2);
		maintainUser.addUser(user3);
		maintainUser.addUser(user4);
		maintainUser.addUser(user5);
		
		assertEquals(5, maintainUser.users.size());
	}
	
	@Test 
	public void testUserEmailExists()
	{
		User user1 = new Student("John", "Ddc123S#", "john@my.yorku.ca", 1, "123456789");
		User user2 = new Staff("Danny", "Adc123S#", "danny@yorku.ca", 2, "113456789");
		User user3 = new Faculty("Ava", "Bdc123##", "ava@yorku.ca", 3, "333456789");
		User user4 = new Other("Bob", "Ddc555##", "bob@hotmail.com", 4, "444556789");
		User user5 = new Partner("Asa", "Aaa789S#", "asa@gmail.com", 5, "55556789");
		maintainUser.addUser(user1);
		maintainUser.addUser(user2);
		maintainUser.addUser(user3);
		maintainUser.addUser(user4);
		maintainUser.addUser(user5);
		
		//Email does not exist
		assertFalse(maintainUser.emailExists("hi@gmail.com"));
		
		//Email exists
		assertTrue(maintainUser.emailExists("asa@gmail.com"));
	}
	
	@Test
	public void userNameExists()
	{
		User user = new Student("John", "Ddc123S#", "john@my.yorku.ca", 1, "123456789");
		
		//At first the user is not added yet so size should be 0
		assertFalse(maintainUser.usernameExists("John"));
		
		//User is added
		maintainUser.addUser(user);
		assertTrue(maintainUser.usernameExists("John"));
	}
	
	@Test
	public void testUserValidAuthenticate()
	{
		User user = new Partner("Asa", "Aaa789S#", "asa@gmail.com", 1, "55556789");
		assertNotNull(user);
		maintainUser.addUser(user);
		
		//Correct username and password
		assertNotNull(maintainUser.authenticate("Asa", "Aaa789S#"));
		
		//Cases don't matter for usernames
		assertNotNull(maintainUser.authenticate("asA", "Aaa789S#"));
		assertTrue(maintainUser.usernameExists("asA"));
	}
	
	@Test
	public void testUserInValidAuthenticate()
	{
		User user = new Student("John", "Ddc123S#", "john@my.yorku.ca", 1, "123456789");
		assertNotNull(user);
		maintainUser.addUser(user);
	
		//Wrong password
		assertNull(maintainUser.authenticate("John", "Wrong Password"));
		
		//Wrong Username
		assertNull(maintainUser.authenticate("Bob", "Ddc123S#"));
	}
	
	@Test
	public void testUserNextId()
	{
		//At the start nextId() should give 1 to the next User
		assertEquals(1, maintainUser.nextId());
		
		User user = new Student("John", "Ddc123S#", "john@my.yorku.ca", 1, "123456789");
		maintainUser.addUser(user);
		
		//After nextId() should give 2 to the next User
		assertEquals(2, maintainUser.nextId());
	}
	
	@Test
	public void testUserNextIdSkipped()
	{

		User user1 = new Student("John", "Ddc123S#", "john@my.yorku.ca", 8, "123456789");
		maintainUser.addUser(user1);
		
		//After nextId() should give 9 to the next User
		assertEquals(9, maintainUser.nextId());
		
		//maxId remains the same when User added is lower than max
		User user2 = new Student("Bob", "Ddc555##", "bob@hotmail.com", 7, "444556789");
		maintainUser.addUser(user2);
		assertEquals(9, maintainUser.nextId());
	}
	
	@Test
	public void testUserSave() throws Exception
	{
		User user1 = new Student("John", "Ddc123S#", "john@my.yorku.ca", 1, "123456789");
		User user2 = new Other("Bob", "Ddc555##", "bob@hotmail.com", 2, "444556789");
		
		maintainUser.addUser(user1);
		maintainUser.addUser(user2);
		
		//Saving the user results in the csv file
		maintainUser.save(testPath);
		
		assertTrue(testFile.length() > 0);
	}
	
	@Test
	public void testLoadWhenNoUsers() throws Exception
	{
		maintainUser.load(testPath);
		assertEquals(0, maintainUser.users.size());
	}
	
	@Test
	public void testLoadUsers() throws Exception
	{
		User user1 = new Student("John", "Ddc123S#", "john@my.yorku.ca", 1, "123456789");
		User user2 = new Other("Bob", "Ddc555##", "bob@hotmail.com", 2, "444556789");
		
		maintainUser.addUser(user1);
		maintainUser.addUser(user2);
		
		//Saving the User results in the csv file
		maintainUser.save(testPath);
		assertTrue(testFile.length() > 0);
		
		//Removing Users from the arrayList, but they are still in the csv file
		maintainUser.users.clear();
		assertEquals(0, maintainUser.users.size());

		
		//See if the Users are back after load
		maintainUser.load(testPath);
		assertEquals(2, maintainUser.users.size());
	}
	
	@Test
	public void testLoadBeforeAndAfterAddingUsers() throws Exception
	{
		User user1 = new Student("John", "Ddc123S#", "john@my.yorku.ca", 1, "123456789");
		User user2 = new Staff("Danny", "Adc123S#", "danny@yorku.ca", 2, "113456789");
		User user3 = new Faculty("Ava", "Bdc123##", "ava@yorku.ca", 3, "333456789");
		User user4 = new Other("Bob", "Ddc555##", "bob@hotmail.com", 4, "444556789");
		User user5 = new Partner("Asa", "Aaa789S#", "asa@gmail.com", 5, "55556789");
		
		maintainUser.addUser(user1);
		maintainUser.addUser(user2);
		maintainUser.addUser(user3);
		maintainUser.addUser(user4);
		maintainUser.addUser(user5);
		
		//Saving the users' results in the csv file
		maintainUser.save(testPath);
		assertTrue(testFile.length() > 0);
		
		//Removing users from the arrayList, but they are still in the csv file
		maintainUser.users.clear();
		assertEquals(0, maintainUser.users.size());

		
		//See if the users are back after load
		maintainUser.load(testPath);
		assertEquals(5, maintainUser.users.size());
		
		//Adding an additional User
		User user6 = new Student("BBB", "DBc123$$", "BBB@my.yorku.ca", 6, "999999999");
		maintainUser.addUser(user6);
		maintainUser.save(testPath);
		
		//clearing users list
		maintainUser.users.clear();
		assertEquals(0, maintainUser.users.size());
		
		//Testing if CSV file saves the administrators after load again
		maintainUser.load(testPath);
		assertEquals(6, maintainUser.users.size());
	}
	
	
}

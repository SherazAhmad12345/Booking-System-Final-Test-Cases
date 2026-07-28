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

import administratorManagement.Administrator;
import dataManagement.MaintainAdministrator;

public class MaintainAdministratorManualTests {
	
	private MaintainAdministrator maintainAdministrator;
	private String testPath = "data/testAdministrators.csv";
	private File testFile;
	
	@Before
	public void setUp()
	{
		maintainAdministrator = new MaintainAdministrator();
		testFile = new File(testPath);
	}
	
	@After
	public void clearUp()
	{
		testFile.delete();
		maintainAdministrator.admins.clear();
	}
	
	@Test
	public void testAddAdmin()
	{
		Administrator admin1 = new Administrator("Boa", "Abc123S#", "boa@yorku.ca", 1);
		
		//Admin is not added yet so size should be 0
		assertEquals(0, maintainAdministrator.admins.size());
		
		//Admin is added
		maintainAdministrator.addAdmin(admin1);
		assertEquals(1, maintainAdministrator.admins.size());
		assertSame(admin1, maintainAdministrator.admins.get(0));
	}
	
	@Test
	public void testAdminUserNameExists()
	{
		Administrator admin1 = new Administrator("Boa", "Abc123S#", "boa@yorku.ca", 1);
		assertNotNull(admin1);
	
		//At first the admin doesn't exist in the list
		assertFalse(maintainAdministrator.usernameExists("Boa"));
		
		//Admin is added
		maintainAdministrator.addAdmin(admin1);
		assertTrue(maintainAdministrator.usernameExists("Boa"));
	}
	
	@Test
	public void testValidAuthenticate()
	{
		Administrator admin1 = new Administrator("Boa", "Abc123S#", "boa@yorku.ca", 1);
		assertNotNull(admin1);
		maintainAdministrator.addAdmin(admin1);
		
		//Correct username and password
		assertNotNull(maintainAdministrator.authenticate("Boa", "Abc123S#"));
		
		//Cases don't matter for usernames
		assertNotNull(maintainAdministrator.authenticate("BoA", "Abc123S#"));
	}
	
	@Test
	public void testInValidAuthenticate()
	{
		Administrator admin1 = new Administrator("Boa", "Abc123S#", "boa@yorku.ca", 1);
		assertNotNull(admin1);
		maintainAdministrator.addAdmin(admin1);
	
		//Wrong password
		assertNull(maintainAdministrator.authenticate("Boa", "Wrong Password"));
		
		//Wrong Username
		assertNull(maintainAdministrator.authenticate("Bob", "Abc123S#"));
	}
	
	@Test
	public void testNextId()
	{
		//At the start nextId() should give 1 to the next admin
		assertEquals(1, maintainAdministrator.nextId());
		
		Administrator admin1 = new Administrator("Boa", "Abc123S#", "boa@yorku.ca", 1);
		maintainAdministrator.addAdmin(admin1);
		
		//After nextId() should give 2 to the next admin
		assertEquals(2, maintainAdministrator.nextId());
	}
	
	@Test
	public void testNextIdSkipped()
	{

		Administrator admin1 = new Administrator("Boa", "Abc123S#", "boa@yorku.ca", 8);
		maintainAdministrator.addAdmin(admin1);
		
		//After nextId() should give 9 to the next admin
		assertEquals(9, maintainAdministrator.nextId());
		
		//maxId remains the same when admin added is lower than max
		Administrator admin2 = new Administrator("Sam", "Aabc123S#", "sam@yorku.ca", 7);
		maintainAdministrator.addAdmin(admin2);
		assertEquals(9, maintainAdministrator.nextId());
	}
	
	@Test
	public void testSave() throws Exception
	{
		Administrator admin1 = new Administrator("Boa", "Abc123S#", "boa@yorku.ca", 1);
		Administrator admin2 = new Administrator("Sam", "Aabc123S#", "sam@yorku.ca", 2);
		
		maintainAdministrator.addAdmin(admin1);
		maintainAdministrator.addAdmin(admin2);
		
		//Saving the administrator results in the csv file
		maintainAdministrator.save(testPath);
		
		assertTrue(testFile.length() > 0);
	}
	
	@Test
	public void testLoadWhenNoAdministrators() throws Exception
	{
		maintainAdministrator.load(testPath);
		assertEquals(0, maintainAdministrator.admins.size());
	}
	
	@Test
	public void testLoad() throws Exception
	{
		Administrator admin1 = new Administrator("Boa", "Abc123S#", "boa@yorku.ca", 1);
		Administrator admin2 = new Administrator("Sam", "Aabc123S#", "sam@yorku.ca", 2);
		
		maintainAdministrator.addAdmin(admin1);
		maintainAdministrator.addAdmin(admin2);
		
		//Saving the administrator results in the csv file
		maintainAdministrator.save(testPath);
		assertTrue(testFile.length() > 0);
		
		//Removing administrators from the arrayList, but they are still in the csv file
		maintainAdministrator.admins.clear();
		assertEquals(0, maintainAdministrator.admins.size());

		
		//See if the administrators are back after load
		maintainAdministrator.load(testPath);
		assertEquals(2, maintainAdministrator.admins.size());
	}
	
	@Test
	public void testLoadBeforeAndAfterAddingAdministrator() throws Exception
	{
		Administrator admin1 = new Administrator("Boa", "Abc123S#", "boa@yorku.ca", 1);
		Administrator admin2 = new Administrator("Sam", "Aabc123S#", "sam@yorku.ca", 2);
		
		maintainAdministrator.addAdmin(admin1);
		maintainAdministrator.addAdmin(admin2);
		
		//Saving the administrator results in the csv file
		maintainAdministrator.save(testPath);
		assertTrue(testFile.length() > 0);
		
		//Removing administrators from the arrayList, but they are still in the csv file
		maintainAdministrator.admins.clear();
		assertEquals(0, maintainAdministrator.admins.size());

		
		//See if the administrators are back after load
		maintainAdministrator.load(testPath);
		assertEquals(2, maintainAdministrator.admins.size());
		
		Administrator admin3 = new Administrator("Ada", "Aaabc123S#", "ada@yorku.ca", 3);
		maintainAdministrator.addAdmin(admin3);
		maintainAdministrator.save(testPath);
		
		//clearing adminsList
		maintainAdministrator.admins.clear();
		assertEquals(0, maintainAdministrator.admins.size());
		
		//Testing if CSV file saves the administrators after load again
		maintainAdministrator.load(testPath);
		assertEquals(3, maintainAdministrator.admins.size());

		
		
	}
	
}

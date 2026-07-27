package manualTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import administratorManagement.Administrator;
import administratorManagement.ChiefEventCoordinator;

public class ChiefEventCoordinatorManualTest {
	ChiefEventCoordinator chiefEventCoordinator = ChiefEventCoordinator.getInstance();
	
	@Before
	public void cleanBefore()
	{
		//Test cases don't run in order
		chiefEventCoordinator.emptyListsForTesting();
	}
	
	@After
	public void cleanUp()
	{
		chiefEventCoordinator.emptyListsForTesting();
	}
	
	@Test
	public void testSingletonInstance()
	{
		ChiefEventCoordinator chiefEventCoordinator2 = ChiefEventCoordinator.getInstance();
		
		assertSame(chiefEventCoordinator, chiefEventCoordinator2);
	}
	
	@Test
	public void testAdminGeneration()
	{
		Administrator admin = chiefEventCoordinator.generateAdminAccount("Ada", "aBC123#$", "ada@yorku.ca", 1);
		assertNotNull(admin);
		
		assertEquals("Ada", admin.getUsername());
		assertEquals("aBC123#$", admin.getPassword());
		assertEquals("ada@yorku.ca", admin.getEmail());
		assertEquals(1, admin.getAdminID());
		assertFalse(admin.isChiefEventCoordinator());
	}
	
	@Test
	public void testAdminGetterFail()
	{
		Administrator admin = chiefEventCoordinator.getAdministrator("User doesn't exist", "aBC123#$");
		assertNull(admin);
	}
	
	@Test
	public void testAdminGetterWrongUsername()
	{
		Administrator admin = chiefEventCoordinator.generateAdminAccount("Ada", "aBC123#$", "ada@yorku.ca", 1);
		assertNotNull(admin);
		
		Administrator adminReturnedAttempt1 = chiefEventCoordinator.getAdministrator("Wrong User", "aBC123#$");
		assertNull(adminReturnedAttempt1);
	}
	
	@Test
	public void testAdminGetterWrongPassword()
	{
		Administrator admin = chiefEventCoordinator.generateAdminAccount("Ada", "aBC123#$", "ada@yorku.ca", 1);
		assertNotNull(admin);
		
		Administrator adminReturnedAttempt2 = chiefEventCoordinator.getAdministrator("Ada", "Wrong Password");
		assertNull(adminReturnedAttempt2);
	}
	
	@Test
	public void testAdminGetterPass()
	{
		Administrator admin = chiefEventCoordinator.generateAdminAccount("Ada", "aBC123#$", "ada@yorku.ca", 1);
		
		Administrator adminReturned = chiefEventCoordinator.getAdministrator("Ada", "aBC123#$");
		
		//Both admins should be the same
		assertSame(admin, adminReturned);
	}
	
	@Test
	public void testInvalidPassword()
	{
		//Less than 8 characters
		assertFalse(chiefEventCoordinator.isStrongPassword("aA$#567"));
		
		//No Lowercase
		assertFalse(chiefEventCoordinator.isStrongPassword("AA$#5678"));
		
		//No Uppercase
		assertFalse(chiefEventCoordinator.isStrongPassword("aa$#5678"));
		
		//No Digit
		assertFalse(chiefEventCoordinator.isStrongPassword("AA$#aaaa"));
		
		//No letters
		assertFalse(chiefEventCoordinator.isStrongPassword("12$#5678"));
		
		//No symbol
		assertFalse(chiefEventCoordinator.isStrongPassword("123aA678"));
	}
	
	@Test
	public void testValidPassword()
	{
		assertTrue(chiefEventCoordinator.isStrongPassword("aBC123#$"));
	}
	
	@Test
	public void testInvalidEmail()
	{
		assertFalse(chiefEventCoordinator.isValidEmail(null));
		assertFalse(chiefEventCoordinator.isValidEmail(""));
		
		//Email doesn't end with @yorku.ca
		assertFalse(chiefEventCoordinator.isValidEmail("bob@gmail.com"));
		assertFalse(chiefEventCoordinator.isValidEmail("bob@yorku.com"));
		
		//Email length is not greater than 9 characters (@yorku.ca is 9 characters)
		assertFalse(chiefEventCoordinator.isValidEmail("b@york.ca"));
		assertFalse(chiefEventCoordinator.isValidEmail("@yorku.ca"));
	}
	
	@Test
	public void testValidEmail()
	{
		assertTrue(chiefEventCoordinator.isValidEmail("bob@yorku.ca"));
		
		//Capitals should work too
		assertTrue(chiefEventCoordinator.isValidEmail("Bob@yoRKu.cA"));
		
	}
}

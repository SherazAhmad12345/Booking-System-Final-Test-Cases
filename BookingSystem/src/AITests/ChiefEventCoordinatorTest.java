package AITests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import administratorManagement.Administrator;
import administratorManagement.ChiefEventCoordinator;

public class ChiefEventCoordinatorTest {
    private ChiefEventCoordinator coordinator;

    @Before
    public void setUp() {
        coordinator = ChiefEventCoordinator.getInstance();
        coordinator.emptyListsForTesting();
    }

    @After
    public void tearDown() {
        coordinator.emptyListsForTesting();
    }

    @Test
    public void isSingletonAndCreatesRetrievableAdministrators() {
        assertSame(coordinator, ChiefEventCoordinator.getInstance());
        Administrator admin = coordinator.generateAdminAccount("alice", "Strong1!", "alice@yorku.ca", 1);
        assertSame(admin, coordinator.getAdministrator("alice", "Strong1!"));
        assertNull(coordinator.getAdministrator("alice", "bad"));
        assertNull(coordinator.getAdministrator("missing", "Strong1!"));
    }

    @Test
    public void validatesPasswordsAndYorkEmailAddresses() {
        assertTrue(coordinator.isStrongPassword("Strong1!"));
        assertFalse(coordinator.isStrongPassword("short1!"));
        assertFalse(coordinator.isStrongPassword("alllower1!"));
        assertTrue(coordinator.isValidEmail("NAME@YORKU.CA"));
        assertFalse(coordinator.isValidEmail("@yorku.ca"));
        assertFalse(coordinator.isValidEmail("name@example.com"));
        assertFalse(coordinator.isValidEmail(null));
    }
}

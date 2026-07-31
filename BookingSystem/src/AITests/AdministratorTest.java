package AITests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import administratorManagement.Administrator;
import roomManagement.RoomManager;

public class AdministratorTest {
    private Administrator administrator;

    @Before
    public void setUp() {
        AITestSupport.resetRoomManager();
        administrator = new Administrator("admin", "Secret1!", "admin@yorku.ca", 7, true);
    }

    @Test
    public void exposesAccountDataAndPasswordChecks() {
        assertEquals("admin", administrator.getUsername());
        assertEquals("Secret1!", administrator.getPassword());
        assertEquals("admin@yorku.ca", administrator.getEmail());
        assertEquals(7, administrator.getAdminID());
        assertTrue(administrator.isChiefEventCoordinator());
        assertTrue(administrator.checkPassword("Secret1!"));
        assertFalse(administrator.checkPassword("wrong"));
        assertEquals("Administrator", administrator.getAdminType());
        assertTrue(administrator.toString().contains("admin@yorku.ca"));
    }

    @Test
    public void delegatesRoomOperationsToRoomManager() {
        assertTrue(administrator.addRoom("AI-101", 20, "AI Lab"));
        assertNotNull(administrator.selectRoomID("AI-101"));
        assertTrue(administrator.roomLocationAlreadyExists("AI Lab"));
        administrator.selectRoomID("AI-101").setUser("42");
        assertEquals("AI-101", administrator.getAssignedRoomID("42"));
        assertTrue(administrator.disableRoom("AI-101"));
        assertTrue(administrator.enableRoom("AI-101"));
        assertTrue(administrator.closeRoom("AI-101"));
        assertTrue(administrator.maintenanceAndRepairsFinished("AI-101"));
        assertEquals(RoomManager.getRoomManagerInstance().getAllRooms().size(), administrator.getAllRooms().size());
    }
}

package AITests;

import static org.junit.Assert.*;

import javax.swing.JComboBox;

import org.junit.Before;
import org.junit.Test;

import gui.ManageRoomsPage;
import roomManagement.Room;
import roomManagement.RoomManager;

public class ManageRoomsPageTest {
    @Before
    public void resetRooms() {
        AITestSupport.resetRoomManager();
    }

    @Test
    public void refreshExcludesOccupiedRoomsAndMapsSelection() {
        RoomManager manager = RoomManager.getRoomManagerInstance();
        manager.selectRoomID("CLH-205").setOccupied(true);
        ManageRoomsPage page = new ManageRoomsPage(null);
        AITestSupport.invoke(page, "refreshRooms", new Class<?>[0]);
        JComboBox<?> dropdown = AITestSupport.getField(page, "roomDropdown");
        assertEquals(4, dropdown.getItemCount());
        Room selected = AITestSupport.invoke(page, "getSelectedRoom", new Class<?>[0]);
        assertNotNull(selected);
        assertNotEquals("CLH-205", selected.getRoomID());
        dropdown.setSelectedIndex(-1);
        assertNull(AITestSupport.invoke(page, "getSelectedRoom", new Class<?>[0]));
    }
}

package AITests;

import static org.junit.Assert.*;

import javax.swing.JComboBox;

import org.junit.Before;
import org.junit.Test;

import gui.RoomOptionsPage;
import roomManagement.RoomManager;

public class RoomOptionsPageTest {
    @Before
    public void resetRooms() {
        AITestSupport.resetRoomManager();
    }

    @Test
    public void refreshListsOnlyEnabledRooms() {
        RoomManager.getRoomManagerInstance().disableRoom("CLH-205");
        RoomOptionsPage page = new RoomOptionsPage(null);
        AITestSupport.invoke(page, "refreshRooms", new Class<?>[0]);
        JComboBox<?> dropdown = AITestSupport.getField(page, "roomDropdown");
        assertEquals(4, dropdown.getItemCount());
        for (int i = 0; i < dropdown.getItemCount(); i++) {
            assertNotEquals("CLH-205", dropdown.getItemAt(i));
        }
        assertNotNull(AITestSupport.findButton(page, "confirm"));
        assertNull(RoomOptionsPage.getSelectedRoomID());
    }
}

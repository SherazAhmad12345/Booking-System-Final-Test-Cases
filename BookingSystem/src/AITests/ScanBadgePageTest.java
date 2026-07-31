package AITests;

import static org.junit.Assert.*;

import javax.swing.JComboBox;

import org.junit.Before;
import org.junit.Test;

import gui.ScanBadgePage;

public class ScanBadgePageTest {
    @Before
    public void resetRooms() {
        AITestSupport.resetRoomManager();
    }

    @Test
    public void refreshListsEveryRoomAndBuildsScanControls() {
        ScanBadgePage page = new ScanBadgePage(null);
        AITestSupport.invoke(page, "refreshRooms", new Class<?>[0]);
        JComboBox<?> dropdown = AITestSupport.getField(page, "roomDropdown");
        assertEquals(5, dropdown.getItemCount());
        assertNotNull(AITestSupport.findButton(page, "Scan Badge"));
        assertNotNull(AITestSupport.findButton(page, "Back"));
    }
}

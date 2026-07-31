package AITests;

import static org.junit.Assert.*;

import javax.swing.JTextField;

import org.junit.Test;

import gui.CreateNewRoomPage;

public class CreateNewRoomPageTest {
    @Test
    public void buildsAndClearsRoomCreationForm() {
        CreateNewRoomPage page = new CreateNewRoomPage(null);
        assertNotNull(AITestSupport.findButton(page, "Create Room"));
        assertNotNull(AITestSupport.findButton(page, "cancel"));
        JTextField id = AITestSupport.getField(page, "createRoomIDInputField");
        JTextField location = AITestSupport.getField(page, "roomLocationInputField");
        JTextField capacity = AITestSupport.getField(page, "roomCapacityInputField");
        id.setText("R");
        location.setText("L");
        capacity.setText("10");
        AITestSupport.invoke(page, "clearFields", new Class<?>[0]);
        assertEquals("", id.getText());
        assertEquals("", location.getText());
        assertEquals("", capacity.getText());
    }
}

package AITests;

import static org.junit.Assert.*;

import java.awt.GraphicsEnvironment;

import javax.swing.JPanel;
import javax.swing.JTextField;

import org.junit.Assume;
import org.junit.Test;

import administratorManagement.Administrator;
import gui.AppFrame;
import userManagement.Student;

public class AppFrameTest {
    @Test
    public void singletonProvidesManagersSessionStateCardsAndFieldClearing() {
        Assume.assumeFalse(GraphicsEnvironment.isHeadless());
        AppFrame frame = AITestSupport.onEdt(AppFrame::getInstance);
        assertSame(frame, AppFrame.getInstance());
        assertNotNull(frame.getMaintainUser());
        assertNotNull(frame.getMaintainAdministrator());

        Student user = new Student("u", "p", "e", 1, "S");
        Administrator admin = new Administrator("a", "p", "e", 2);
        frame.setCurrentUser(user);
        frame.setCurrentAdministrator(admin);
        assertSame(user, frame.getCurrentUser());
        assertSame(admin, frame.getCurrentAdministrator());

        JPanel panel = new JPanel();
        JTextField first = new JTextField("one");
        JTextField second = new JTextField("two");
        panel.add(first);
        panel.add(second);
        frame.clearAllFields(panel);
        assertEquals("", first.getText());
        assertEquals("", second.getText());
        frame.showCard(AppFrame.CARD_WELCOME);
        assertEquals("data/users.csv", AppFrame.USERS_CSV_PATH);
        assertEquals("data/administrators.csv", AppFrame.ADMINISTRATORS_CSV_PATH);
    }

    @Test
    public void malformedCsvFilesAreCaughtAndMainDisplaysTheSingleton() {
        Assume.assumeFalse(GraphicsEnvironment.isHeadless());
        AppFrame original = AITestSupport.onEdt(AppFrame::getInstance);
        try {
            AITestSupport.preserveFile(AppFrame.USERS_CSV_PATH, () ->
                AITestSupport.preserveFile(AppFrame.ADMINISTRATORS_CSV_PATH, () -> {
                    AITestSupport.writeText(AppFrame.USERS_CSV_PATH,
                            "username,password,email,id,type,orgIdOrStudentNumber\n"
                            + "broken,p,e,not-a-number,Student,S\n");
                    AITestSupport.writeText(AppFrame.ADMINISTRATORS_CSV_PATH,
                            "username,password,email,id,isChiefEventCoordinator\n"
                            + "broken,p,e,not-a-number,false\n");
                    AITestSupport.setField(AppFrame.class, "instance", null);
                    final AppFrame[] recovered = new AppFrame[1];
                    AITestSupport.runSilencingError(() -> recovered[0] = AITestSupport.onEdt(AppFrame::getInstance));
                    assertNotNull(recovered[0].getMaintainUser());
                    assertNotNull(recovered[0].getMaintainAdministrator());
                    AITestSupport.onEdt(() -> {
                        AppFrame.main(new String[0]);
                        assertTrue(recovered[0].isVisible());
                        recovered[0].setVisible(false);
                        recovered[0].dispose();
                        return null;
                    });
                }));
        } finally {
            AITestSupport.setField(AppFrame.class, "instance", original);
        }
    }

}

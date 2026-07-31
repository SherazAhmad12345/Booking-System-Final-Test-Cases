package AITests;

import static org.junit.Assert.*;

import java.util.List;

import javax.swing.JTextField;

import org.junit.After;
import org.junit.Test;

import gui.BookingInformationPage;

public class BookingInformationPageTest {
    @After
    public void clearFields() {
        for (JTextField field : BookingInformationPage.getInfo()) {
            field.setText("");
        }
    }

    @Test
    public void validatesStrictDatesAndBuildsInputPanel() {
        BookingInformationPage page = AITestSupport.onEdt(() -> new BookingInformationPage(null));
        assertEquals(3, BookingInformationPage.getInfo().size());
        assertNotNull(BookingInformationPage.getPanel());
        assertNotNull(AITestSupport.findButton(page, "confirm"));
        assertTrue(BookingInformationPage.isValidDate("02/29/28"));
        assertFalse(BookingInformationPage.isValidDate("02/29/27"));
        assertFalse(BookingInformationPage.isValidDate("2/29/28"));
        assertFalse(BookingInformationPage.isValidDate("01/01/25"));
        assertFalse(BookingInformationPage.isValidDate(null));
    }

    @Test
    public void privateTimeValidationRequiresOrderedTwentyFourHourTimes() {
        BookingInformationPage page = new BookingInformationPage(null);
        assertTrue(AITestSupport.invoke(page, "isValidTime", new Class<?>[] { String.class, String.class },
                "09:00", "10:00"));
        assertTrue(AITestSupport.invoke(page, "isValidTime", new Class<?>[] { String.class, String.class },
                "9:00", "10:00"));
        assertFalse(AITestSupport.invoke(page, "isValidTime", new Class<?>[] { String.class, String.class },
                "10:00", "09:00"));
        assertFalse(AITestSupport.invoke(page, "isValidTime", new Class<?>[] { String.class, String.class },
                "24:00", "25:00"));
        assertFalse(AITestSupport.invoke(page, "isValidTime", new Class<?>[] { String.class, String.class },
                "bad", "10:00"));
        assertEquals(Integer.valueOf(570), AITestSupport.invoke(page, "trueTimeValue",
                new Class<?>[] { String.class }, "9:30"));
    }

    @Test
    public void hasPassedUsesEnteredDateAndTimes() {
        BookingInformationPage page = new BookingInformationPage(null);
        List<JTextField> fields = BookingInformationPage.getInfo();
        fields.get(0).setText("01/01/30");
        fields.get(1).setText("10:00");
        fields.get(2).setText("11:00");
        assertFalse(page.hasPassed(AITestSupport.date("2030-01-01 09:00")));
        assertTrue(page.hasPassed(AITestSupport.date("2030-01-01 10:01")));
        fields.get(0).setText("invalid");
        assertTrue(page.hasPassed(AITestSupport.date("2030-01-01 09:00")));
    }
}

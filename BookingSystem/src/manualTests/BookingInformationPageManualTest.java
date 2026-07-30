package manualTests;

import static org.junit.Assert.*;

import java.awt.Component;
import java.awt.Container;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.junit.Before;
import org.junit.Test;

import gui.AppFrame;
import gui.BookingInformationPage;

public class BookingInformationPageManualTest {

    private AppFrame app;
    private BookingInformationPage page;

    @Before
    public void setUp() throws Exception {
        app = AppFrame.getInstance();
        app.setVisible(false);
        page = getCard(BookingInformationPage.class);
        clearBookingFields();
    }

    @Test
    public void testPageExists() {
        assertNotNull(page);
    }

    @Test
    public void testGetInfoReturnsThreeTextFields() {
        assertEquals(3, BookingInformationPage.getInfo().size());
    }

    @Test
    public void testPanelHasConfirmAndCancelButtons() {
        assertNotNull(findButton(page, "confirm"));
        assertNotNull(findButton(page, "cancel"));
    }

    @Test
    public void testValidDateAccepted() {
        assertTrue(BookingInformationPage.isValidDate("12/31/99"));
    }

    @Test
    public void testNullDateRejected() {
        assertFalse(BookingInformationPage.isValidDate(null));
    }

    @Test
    public void testEmptyDateRejected() {
        assertFalse(BookingInformationPage.isValidDate("   "));
    }

    @Test
    public void testWrongDateFormatRejected() {
        assertFalse(BookingInformationPage.isValidDate("2026-12-31"));
    }

    @Test
    public void testImpossibleDateRejected() {
        assertFalse(BookingInformationPage.isValidDate("02/30/26"));
    }

    @Test
    public void testYearBeforeTwentySixRejected() {
        assertFalse(BookingInformationPage.isValidDate("12/31/25"));
    }

    @Test
    public void testValidTimeAcceptedUsingReflection() throws Exception {
        assertTrue(callIsValidTime("10:00", "11:00"));
    }

    @Test
    public void testInvalidTimeWithoutColonRejected() throws Exception {
        assertFalse(callIsValidTime("1000", "11:00"));
    }

    @Test
    public void testInvalidMinuteRejected() throws Exception {
        assertFalse(callIsValidTime("10:70", "11:00"));
    }

    @Test
    public void testEndBeforeStartRejected() throws Exception {
        assertFalse(callIsValidTime("12:00", "11:00"));
    }

    @Test
    public void testTrueTimeValueConvertsToMinutes() throws Exception {
        assertEquals(90, callTrueTimeValue("01:30"));
    }

    @Test
    public void testHasPassedFalseForFutureBooking() {
        setBookingFields(formatDaysFromNow(1), "10:00", "11:00");
        assertFalse(page.hasPassed(new Date()));
    }

    @Test
    public void testHasPassedTrueForPastBooking() {
        setBookingFields(formatDaysFromNow(-1), "10:00", "11:00");
        assertTrue(page.hasPassed(new Date()));
    }

    @Test
    public void testCancelButtonShowsRoomOptionsCard() throws Exception {
        findButton(page, "cancel").doClick();
        assertEquals("RoomOptionsPage", getVisibleCardSimpleName());
    }

    @Test
    public void testConfirmValidInformationShowsPaymentPlanCard() throws Exception {
        setBookingFields(formatDaysFromNow(1), "10:00", "11:00");
        findButton(page, "confirm").doClick();
        assertEquals("PaymentPlanPage", getVisibleCardSimpleName());
    }

    private void clearBookingFields() {
        for (JTextField field : BookingInformationPage.getInfo()) {
            field.setText("");
        }
    }

    private void setBookingFields(String date, String start, String end) {
        List<JTextField> fields = BookingInformationPage.getInfo();
        fields.get(0).setText(date);
        fields.get(1).setText(start);
        fields.get(2).setText(end);
    }

    private String formatDaysFromNow(int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, days);
        return new SimpleDateFormat("MM/dd/yy").format(calendar.getTime());
    }

    private boolean callIsValidTime(String start, String end) throws Exception {
        Method method = BookingInformationPage.class.getDeclaredMethod("isValidTime", String.class, String.class);
        method.setAccessible(true);
        return (Boolean) method.invoke(page, start, end);
    }

    private int callTrueTimeValue(String time) throws Exception {
        Method method = BookingInformationPage.class.getDeclaredMethod("trueTimeValue", String.class);
        method.setAccessible(true);
        return (Integer) method.invoke(page, time);
    }

    private <T> T getCard(Class<T> type) throws Exception {
        for (Component component : getCardContainer().getComponents()) {
            if (type.isInstance(component)) {
                return type.cast(component);
            }
        }
        return null;
    }

    private JPanel getCardContainer() throws Exception {
        Field field = AppFrame.class.getDeclaredField("cardContainer");
        field.setAccessible(true);
        return (JPanel) field.get(app);
    }

    private String getVisibleCardSimpleName() throws Exception {
        for (Component component : getCardContainer().getComponents()) {
            if (component.isVisible()) {
                return component.getClass().getSimpleName();
            }
        }
        return "";
    }

    private JButton findButton(Container root, String text) {
        for (JButton button : findAll(root, JButton.class)) {
            if (text.equals(button.getText())) {
                return button;
            }
        }
        return null;
    }

    private <T extends Component> List<T> findAll(Container root, Class<T> type) {
        List<T> matches = new ArrayList<T>();
        for (Component component : root.getComponents()) {
            if (type.isInstance(component)) {
                matches.add(type.cast(component));
            }
            if (component instanceof Container) {
                matches.addAll(findAll((Container) component, type));
            }
        }
        return matches;
    }
}

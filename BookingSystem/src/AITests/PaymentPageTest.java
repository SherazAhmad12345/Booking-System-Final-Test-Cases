package AITests;

import static org.junit.Assert.*;

import org.junit.Test;

import gui.PaymentPage;
import payment.CreditCardPayment;

public class PaymentPageTest {
    @Test
    public void validatesSixteenDigitCardNumbers() {
        PaymentPage page = new PaymentPage(null);
        assertTrue(AITestSupport.invoke(page, "isCard", new Class<?>[] { String.class }, "1234567812345678"));
        assertFalse(AITestSupport.invoke(page, "isCard", new Class<?>[] { String.class }, "1234"));
        assertFalse(AITestSupport.invoke(page, "isCard", new Class<?>[] { String.class }, "abcdefghijklmnop"));
        assertFalse(AITestSupport.invoke(page, "isCard", new Class<?>[] { String.class }, ""));
    }

    @Test
    public void storesPaymentModeAndStrategyAndExposesPanel() {
        PaymentPage.setTypeOfPayment("book");
        assertEquals("book", PaymentPage.getPaymentType());
        PaymentPage.paymentMethod(new CreditCardPayment(20, "10:00", "11:00", "", 0));
        assertNotNull(AITestSupport.getField(PaymentPage.class, "payment"));
        assertNotNull(PaymentPage.getPanel());
    }
}

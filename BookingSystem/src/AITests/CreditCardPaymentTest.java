package AITests;

import static org.junit.Assert.*;

import org.junit.Test;

import payment.CreditCardPayment;

public class CreditCardPaymentTest {
    @Test
    public void calculatesFeeCostDepositAndStatus() {
        CreditCardPayment payment = new CreditCardPayment(30, "09:30", "11:00", "", 0);
        assertEquals(1.5, payment.getFee(), 0.001);
        assertEquals(46.5, payment.calculateCost(), 0.001);
        assertEquals(31.5, payment.calculateDeposit(), 0.001);
        assertEquals("Pending", payment.getStatus());
        CreditCardPayment paid = new CreditCardPayment(30, "09:30", "11:00", "", 46.5);
        assertEquals("Complete", paid.getStatus());
    }

    @Test
    public void extensionDepositSentinelProducesZeroDeposit() {
        assertEquals(0, new CreditCardPayment(20, "10:00", "11:00", "", -1).calculateDeposit(), 0.001);
    }
}

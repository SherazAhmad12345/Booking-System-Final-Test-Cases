package AITests;

import static org.junit.Assert.*;

import org.junit.Test;

import payment.DebitCardPayment;

public class DebitCardPaymentTest {
    @Test
    public void calculatesFeeCostDepositAndStatus() {
        DebitCardPayment payment = new DebitCardPayment(20, "10:15", "12:45", "", 0);
        assertEquals(2.5, payment.getFee(), 0.001);
        assertEquals(52.5, payment.calculateCost(), 0.001);
        assertEquals(22.5, payment.calculateDeposit(), 0.001);
        assertEquals("Pending", payment.getStatus());
        DebitCardPayment paid = new DebitCardPayment(20, "10:15", "12:45", "", 52);
        assertEquals("Pending", paid.getStatus());
        DebitCardPayment exactlyPaid = new DebitCardPayment(19.5, "10:00", "11:00", "", 22);
        assertEquals("Complete", exactlyPaid.getStatus());
    }
}

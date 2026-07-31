package AITests;

import static org.junit.Assert.*;

import org.junit.Test;

import payment.Context;
import payment.CreditCardPayment;
import payment.DebitCardPayment;
import payment.Payment;

public class PaymentContextTest {
    @Test
    public void delegatesCalculationAndMutatesPaymentData() {
        Payment credit = new CreditCardPayment(20, "10:00", "12:00", "", 0);
        Context context = new Context(credit);
        assertSame(credit, context.getPayment());
        assertEquals(41.5, context.executeCalculateCost(), 0.001);
        assertEquals(21.5, context.executeCalculateDeposit(), 0.001);
        context.setCardInformation("1234567812345678");
        context.setDeposit(41.5);
        assertEquals("1234567812345678", context.getCardInformation());
        assertEquals(41.5, context.getDeposit(), 0.001);
        assertEquals("Complete", credit.getStatus());

        Payment debit = new DebitCardPayment(20, "10:00", "11:00", "", 0);
        context.setPayment(debit);
        assertSame(debit, context.getPayment());
        assertEquals(22.5, context.executeCalculateCost(), 0.001);
    }
}

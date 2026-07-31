package AITests;

import static org.junit.Assert.*;

import org.junit.Test;

import payment.InstitutionsBilling;

public class InstitutionsBillingTest {
    @Test
    public void calculatesFeeCostDepositAndStatus() {
        InstitutionsBilling payment = new InstitutionsBilling(40, "08:00", "09:30", "", 0);
        assertEquals(3.5, payment.getFee(), 0.001);
        assertEquals(63.5, payment.calculateCost(), 0.001);
        assertEquals(43.5, payment.calculateDeposit(), 0.001);
        assertEquals("Pending", payment.getStatus());
        InstitutionsBilling exactlyPaid = new InstitutionsBilling(20.5, "10:00", "11:00", "", 24);
        assertEquals("Complete", exactlyPaid.getStatus());
    }
}

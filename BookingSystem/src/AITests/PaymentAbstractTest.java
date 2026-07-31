package AITests;

import static org.junit.Assert.*;

import org.junit.Test;

import payment.Payment;

public class PaymentAbstractTest {
    private static class FixedPayment extends Payment {
        FixedPayment(double hourlyRate, double deposit) {
            super(hourlyRate, "11:00", "10:00", "card", deposit);
        }
        @Override public double calculateCost() { return 99; }
        @Override public String getStatus() { return status; }
        @Override public double getFee() { return 0.75; }
    }

    @Test
    public void baseClassInitializesPendingAndCalculatesDeposit() {
        FixedPayment payment = new FixedPayment(12.345, 0);
        assertEquals("Pending", payment.getStatus());
        assertEquals(13.1, payment.calculateDeposit(), 0.001);
        assertEquals(99, payment.calculateCost(), 0.001);
        assertEquals(0.75, payment.getFee(), 0.001);
    }
}

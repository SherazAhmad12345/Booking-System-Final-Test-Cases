package AITests;

import static org.junit.Assert.*;

import org.junit.Test;

import gui.Payment;

public class GuiPaymentTest {
    private static class FixedGuiPayment extends Payment {
        FixedGuiPayment(double rate, double deposit) {
            super(rate, "11:00", "10:00", "card", deposit);
        }
        @Override public double calculateCost() { return 42; }
        @Override public String getStatus() { return status; }
        @Override protected double getFee() { return 1.25; }
    }

    @Test
    public void calculatesDepositAndHandlesExtensionSentinel() {
        Payment payment = new FixedGuiPayment(20, 0);
        assertEquals(21.25, payment.calculateDeposit(), 0.001);
        assertEquals("Pending", payment.getStatus());
        assertEquals(42, payment.calculateCost(), 0.001);
        assertEquals(0, new FixedGuiPayment(20, -1).calculateDeposit(), 0.001);
    }
}

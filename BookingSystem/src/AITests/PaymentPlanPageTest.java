package AITests;

import static org.junit.Assert.*;

import org.junit.Test;

import gui.PaymentPlanPage;

public class PaymentPlanPageTest {
    @Test
    public void buildsAllPaymentChoiceButtons() {
        PaymentPlanPage page = new PaymentPlanPage(null);
        assertNotNull(AITestSupport.findButton(page, "Credit"));
        assertNotNull(AITestSupport.findButton(page, "Debit"));
        assertNotNull(AITestSupport.findButton(page, "Institutional Billing"));
        assertNotNull(AITestSupport.findButton(page, "Cancel"));
    }
}

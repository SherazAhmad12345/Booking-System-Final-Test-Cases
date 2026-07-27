package manualTests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import payment.Context;
import payment.CreditCardPayment;
import payment.DebitCardPayment;
import payment.Payment;

public class ContextTestsManual {

	// Note: executeCalculateDeposit() and executeCalculateCost() are already tested
	// in PaymentsTestManual.
	Context context;

	@Before
	public void setup() {
		context = new Context(new CreditCardPayment(40, "3:30", "4:30", "1111222233334444", 20));
	}

	@Test
	public void testSetters()
	{
		Payment debit = new DebitCardPayment(50, "3:30", "4:30", "1111222233334444", 20);
		
		context.setPayment(debit);
	    context.setDeposit(0);
	    context.setCardInformation("1111000011110000");
	    assertEquals("payment was not set properly", context.getPayment(), debit);
	    assertEquals("deposit was not set properly", "" + context.getDeposit(), "0.0");
	    assertEquals("card information was not set properly", context.getCardInformation(), "1111000011110000");
	}

}

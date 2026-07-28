package manualTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import payment.CreditCardPayment;
import payment.DebitCardPayment;
import payment.InstitutionsBilling;
import payment.Payment;

public class PaymentManualTest {

	@Test
	public void calculateDepositTest()
	{
		Payment credit = new CreditCardPayment(20, "3:30", "4:30", "1111222233334444", -1);
		Payment debit =  new DebitCardPayment(20, "3:30", "4:30", "1111222233334444", 20);	    
	    	
		assertEquals("deposit did not match appropriate amount", "22.5", "" + debit.calculateDeposit());
	    assertEquals("calculate deposit did not default to 0 when deposit was -1.", "0.0", "" + credit.calculateDeposit());
	}
}

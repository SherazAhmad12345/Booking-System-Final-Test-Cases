package manualTests;

import payment.Payment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

import payment.CreditCardPayment;
import payment.DebitCardPayment;
import payment.InstitutionsBilling;

public class PaymentTypesTestsManual {
  
	Payment credit;
	Payment debit;
	Payment billing;
	
	@Before
	public void setUp()
	{
		credit = new CreditCardPayment(20, "3:30", "4:30", "1111222233334444", 21.5);
		debit =  new DebitCardPayment(20, "3:30", "4:30", "1111222233334444", 25);
	    billing = new InstitutionsBilling(20, "3:30", "4:30", "1111222233334444", 15);
	}
		
	@Test
	public void calculateCostTest()
	{
		assertEquals("Expected total cost does not match actual cost for credit payments.", 21.5, credit.calculateCost(), 0.001);
		assertEquals("Expected total cost does not match actual cost for debit payments.", 22.5, debit.calculateCost(), 0.001);
		assertEquals("Expected total cost does not match actual cost for billing payments.", 23.5, billing.calculateCost(), 0.001);
	}
	
	@Test 
	public void getFeeTest()
	{
		assertEquals("Actual fee does not match expected for credit payments.", 1.5, credit.getFee(), 0.001);
		assertEquals("Actual fee does not match expected fee for debit payments.", 2.5, debit.getFee(), 0.001);
		assertEquals("Actual fee does not match expected fee for billing payments.", 3.5, billing.getFee(), 0.001);
	}
	
	@Test
	public void getStatusTest()
	{
		assertEquals("Status is incorrect for credit", credit.getStatus(), "Complete");
		assertTrue("Status is incorrect for debit", debit.getStatus() != "Complete");
		assertTrue("Status is incorrect for billing", billing.getStatus() != "Complete");
	}
	
}

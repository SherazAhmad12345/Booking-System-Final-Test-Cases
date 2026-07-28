package manualTests;

import payment.Payment;

import static org.junit.Assert.assertEquals;
import org.junit.*;

import payment.CreditCardPayment;
import payment.DebitCardPayment;
import payment.InstitutionsBilling;
import payment.Context;

public class ContextTestsManual{
	Context credit;
	Context debit;
	Context billing;
	
	Payment creditP;
	Payment debitP;
	Payment billingP;
	
	@Before
	public void setUp()	{
		creditP = new CreditCardPayment(20, "3:30", "4:30", "1111222233334444", 21.5);
		debitP =  new DebitCardPayment(20, "3:30", "4:30", "1111222233334444", 25);
		billingP = new InstitutionsBilling(20, "3:30", "4:30", "1111222233334444", 15);
		
		credit = new Context(creditP);
		debit = new Context(debitP);
	    billing = new Context(billingP);
	}
	@Test
	public void setCardInformationTest() {
		
		credit.setCardInformation("1234567890123456");
		assertEquals("Card information does not match expected for credit payments.", "1234567890123456", credit.getCardInformation());
	}
	@Test
	public void setDepositTest() {
		
		debit.setDeposit(30);
		assertEquals("Deposit does not match expected for debit payments.", 30, debit.getDeposit(), 0.001);
	}

	@Test
	public void setPaymentTest() {
		credit.setPayment(debit.getPayment());
		
		//assertEquals("Payment type does not match.", debitP, credit.executeCalculateCost(), 0.001);
		assertEquals("Payment type does not match expected for debit payments.", 22.5, credit.executeCalculateDeposit(), 0.001);
	}
	@Test
	public void executeCalculateDeposit() {
		
		assertEquals("Expected deposit does not match actual deposit for credit payments.", 21.5, credit.executeCalculateDeposit(), 0.001);
		assertEquals("Expected deposit does not match actual deposit for debit payments.", 22.5, debit.executeCalculateDeposit(), 0.001);
		assertEquals("Expected deposit does not match actual deposit for billing payments.", 23.5, billing.executeCalculateDeposit(), 0.001);	
	}
	@Test
	public void executeCalculateCost() {
		assertEquals("Expected total cost does not match actual cost for credit payments.", 21.5, credit.executeCalculateCost(), 0.001);
		assertEquals("Expected total cost does not match actual cost for debit payments.", 22.5, debit.executeCalculateCost(), 0.001);
		assertEquals("Expected total cost does not match actual cost for billing payments.", 23.5, billing.executeCalculateCost(), 0.001);	
	}
	
	
}

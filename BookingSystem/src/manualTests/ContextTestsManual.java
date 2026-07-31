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
	
	//1-The following tests are added to verify that the payment type can be set and retrieved correctly after using the setPayment()
	@Test
	public void setPaymentTest() {
		credit.setPayment(debit.getPayment());
		
		//assertEquals("Payment type does not match.", debitP, credit.executeCalculateCost(), 0.001);
		assertEquals("Payment type does not match expected for debit payments.", 22.5, credit.executeCalculateDeposit(), 0.001);
	}
	
	//2-executeCalculateDeposit() test is added to verify that the deposit calculation is correct for each payment type.
	@Test
	public void executeCalculateDeposit() {		
		assertEquals("Expected deposit does not match actual deposit for credit payments.", 21.5, credit.executeCalculateDeposit(), 0.001);		
	}
	@Test
	public void executeCalculateDeposit1() {
		assertEquals("Expected deposit does not match actual deposit for debit payments.", 22.5, debit.executeCalculateDeposit(), 0.001);
	}
	@Test
	public void executeCalculateDeposit2() {
		assertEquals("Expected deposit does not match actual deposit for billing payments.", 23.5, billing.executeCalculateDeposit(), 0.001);	
	}
	
	@Test
	public void executeCalculateDepositAfterSetPayment() {
		credit.setPayment(debit.getPayment());
		assertEquals("Expected deposit does not match actual deposit for debit payments after setPayment.", 22.5, credit.executeCalculateDeposit(), 0.001);
	}
	@Test
	public void executeCalculateDepositAfterSetPayment1() {
		credit.setPayment(billing.getPayment());
		assertEquals("Expected deposit does not match actual deposit for billing payments after setPayment.", 23.5, credit.executeCalculateDeposit(), 0.001);
	}
	@Test
	public void executeCalculateDepositAfterSetPayment2() {
		debit.setPayment(billing.getPayment());
		assertEquals("Expected deposit does not match actual deposit for billing payments after setPayment.", 23.5, debit.executeCalculateDeposit(), 0.001);
	}
	
	//3-executeCalculateCost() test is added to verify that the cost calculation is correct for each payment type.
	@Test
	public void executeCalculateCost() {
		assertEquals("Expected total cost does not match actual cost for credit payments.", 21.5, credit.executeCalculateCost(), 0.001);
		assertEquals("Expected total cost does not match actual cost for debit payments.", 22.5, debit.executeCalculateCost(), 0.001);
		assertEquals("Expected total cost does not match actual cost for billing payments.", 23.5, billing.executeCalculateCost(), 0.001);	
	}
	@Test
	public void executeCalculateCostAfterSetPayment() {
		credit.setPayment(debit.getPayment());
		assertEquals("Expected total cost does not match actual cost for debit payments after setPayment.", 22.5, credit.executeCalculateCost(), 0.001);
	}
	
	//4-The following tests are added to verify that the card information can be set and retrieved correctly after using the setCardInformation() 
	@Test
	public void executeCalculateCostAfterSetCardInformation() {		
		billing.setCardInformation("9876543210987654");
		assertEquals("Card information does not match expected for billing payments after setCardInformation.", "9876543210987654", billing.getCardInformation());
	}
	@Test
	public void setCardInformationTest() {
		credit.setCardInformation("1234567890123456");
		assertEquals("Card information does not match expected for credit payments.", "1234567890123456", credit.getCardInformation());
	}
	
	//5-The following tests are added to verify that the deposit can be set and retrieved correctly after using the setDeposit()
	@Test
	public void executeCalculateDepositAfterSetDeposit() {		
		debit.setDeposit(35);
		assertEquals("Deposit does not match expected for debit payments after setDeposit.", 35, debit.getDeposit(), 0.001);
	}
	@Test
	public void setDepositTest() {
		
		debit.setDeposit(30);
		assertEquals("Deposit does not match expected for debit payments.", 30, debit.getDeposit(), 0.001);
	}
	
}

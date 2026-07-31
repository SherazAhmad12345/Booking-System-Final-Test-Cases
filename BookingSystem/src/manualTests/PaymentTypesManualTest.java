package manualTests;

import payment.Payment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

import payment.CreditCardPayment;
import payment.DebitCardPayment;
import payment.InstitutionsBilling;

public class PaymentTypesManualTest {
  
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
	//1-The following tests are added to verify that the payment type is correctly identified for each payment instance.
	@Test
	public void paymentTypeTest1() {
		assertTrue("Payment type is not CreditCardPayment.", credit instanceof CreditCardPayment);	
	}
	@Test
	public void paymentTypeTest2() {
		assertFalse("Payment type is incorrectly identified as CreditCardPayment.", !(credit instanceof CreditCardPayment));
	}
	@Test
	public void paymentTypeTest3() {
		assertTrue("Payment type is not DebitCardPayment.", debit instanceof DebitCardPayment);
	}
	@Test
	public void paymentTypeTest4() {
		assertFalse("Payment type is incorrectly identified as DebitCardPayment.", !(debit instanceof DebitCardPayment));
	}
	@Test
	public void paymentTypeTest5() {
		assertTrue("Payment type is not InstitutionsBilling.", billing instanceof InstitutionsBilling);
	}
	@Test
	public void paymentTypeTest6() {
		assertFalse("Payment type is incorrectly identified as InstitutionsBilling.", !(billing instanceof InstitutionsBilling));
	}
	
	//2-The following tests are added to verify that the deposit calculation is correct for each payment type.
	@Test
	public void calculateDepositTest1() {
		assertEquals("Expected deposit does not match actual deposit for credit payments.", 21.5, credit.calculateDeposit(), 0.001);	
	}
	@Test
	public void calculateDepositTest2() {
		assertFalse("Expected deposit does not match actual deposit for credit payments.", credit.calculateDeposit() != 21.5);
	}
	@Test
	public void calculateDepositTest3() {
		assertEquals("Expected deposit does not match actual deposit for debit payments.", 22.5, debit.calculateDeposit(), 0.001);
	}
	@Test
	public void calculateDepositTest4() {
		assertFalse("Expected deposit does not match actual deposit for debit payments.", debit.calculateDeposit() != 22.5);
	}
	@Test
	public void calculateDepositTest5() {
		assertEquals("Expected deposit does not match actual deposit for billing payments.", 23.5, billing.calculateDeposit(), 0.001);
	}
	@Test
	public void calculateDepositTest6() {
		assertFalse("Expected deposit does not match actual deposit for billing payments.", billing.calculateDeposit() != 23.5);
	}
		
	//3-The following tests are added to verify that the cost calculation is correct for each payment type.
	@Test
	public void calculateCostTest1()
	{
		assertEquals("Expected total cost does not match actual cost for credit payments.", 21.5, credit.calculateCost(), 0.001);	
	}
	@Test
	public void calculateCostTest2() {
		assertFalse("Expected total cost does not match actual cost for credit payments.", credit.calculateCost() != 21.5);
	}
	@Test
	public void calculateCostTest3() {
		assertEquals("Expected total cost does not match actual cost for debit payments.", 22.5, debit.calculateCost(), 0.001);
	}
	@Test
	public void calculateCostTest4() {
		assertFalse("Expected total cost does not match actual cost for debit payments.", debit.calculateCost() != 22.5);
	}
	@Test
	public void calculateCostTest5() {
		assertEquals("Expected total cost does not match actual cost for billing payments.", 23.5, billing.calculateCost(), 0.001);
	}
	@Test
	public void calculateCostTest6() {
		assertFalse("Expected total cost does not match actual cost for billing payments.", billing.calculateCost() != 23.5);
	}
	
	//4-The following tests are added to verify that the fee calculation is correct for each payment type.
	@Test 
	public void getFeeTest1()
	{
		assertEquals("Actual fee does not match expected for credit payments.", 1.5, credit.getFee(), 0.001);	
	}
	@Test 
	public void getFeeTest2() {
		assertFalse("Actual fee does not match expected for credit payments.", credit.getFee() != 1.5);
	}
	@Test 
	public void getFeeTest3() {
		assertEquals("Actual fee does not match expected fee for debit payments.", 2.5, debit.getFee(), 0.001);
	}
	@Test 
	public void getFeeTest4() {
		assertFalse("Actual fee does not match expected fee for debit payments.", debit.getFee() != 2.5);
	}
	@Test 
	public void getFeeTest5() {
		assertEquals("Actual fee does not match expected fee for billing payments.", 3.5, billing.getFee(), 0.001);
	}
	@Test 
	public void getFeeTest6() {
		assertFalse("Actual fee does not match expected fee for billing payments.", billing.getFee() != 3.5);
	}
	
	//5-The following tests are added to verify that the status is correctly set and retrieved for each payment type.
	@Test
	public void getStatusTest1()
	{
		assertEquals("Status is incorrect for credit", credit.getStatus(), "Complete");
	}
	@Test
	public void getStatusTest2() {
		assertFalse("Status is incorrect for credit", credit.getStatus() != "Complete");
	}
	@Test
	public void getStatusTest3() {
		assertTrue("Status is incorrect for debit", debit.getStatus() != "Complete");
	}
	@Test
	public void getStatusTest4() {
		assertFalse("Status is incorrect for debit", debit.getStatus() == "Complete");
	}
	@Test
	public void getStatusTest5() {
		assertTrue("Status is incorrect for billing", billing.getStatus() != "Complete");
	}
	@Test
	public void getStatusTest6() {
		assertFalse("Status is incorrect for billing", billing.getStatus() == "Complete");
	}	
}

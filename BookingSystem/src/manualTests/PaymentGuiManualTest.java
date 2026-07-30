package manualTests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import gui.Payment;

class PaymentGuiManualTest {

	// Anonymous concrete subclass used to test the abstract gui.Payment class
	private Payment makePayment(double hourlyRate, String startTime, String endTime, double deposit, double fee) {
		return new Payment(hourlyRate, endTime, startTime, "", deposit) {
			@Override public double calculateCost() { return 0; }
			@Override public String getStatus() { return status; }
			@Override protected double getFee() { return fee; }
		};
	}

	@Test
	void testInitialStatusIsPending() {
		Payment p = makePayment(20, "9:00", "10:00", 0, 1.5);
		assertEquals("Pending", p.getStatus(), "Initial status should be Pending.");
	}

	@Test
	void testCalculateDepositReturnsZeroWhenDepositIsMinusOne() {
		Payment p = makePayment(20, "9:00", "10:00", -1, 1.5);
		assertEquals(0.0, p.calculateDeposit(), 0.001,
				"Deposit should be 0 when deposit field is -1 (extend booking scenario).");
	}

	@Test
	void testCalculateDepositMinusOneIgnoresHourlyRateAndFee() {
		Payment p = makePayment(50, "9:00", "10:00", -1, 3.5);
		assertEquals(0.0, p.calculateDeposit(), 0.001,
				"Deposit of -1 should always return 0, regardless of hourly rate or fee.");
	}

	@Test
	void testCalculateDepositWithCreditFee() {
		Payment p = makePayment(20, "9:00", "10:00", 0, 1.5);
		assertEquals(21.5, p.calculateDeposit(), 0.001,
				"Deposit should equal student hourlyRate ($20) + credit fee ($1.50).");
	}

	@Test
	void testCalculateDepositWithDebitFee() {
		Payment p = makePayment(20, "9:00", "10:00", 0, 2.5);
		assertEquals(22.5, p.calculateDeposit(), 0.001,
				"Deposit should equal student hourlyRate ($20) + debit fee ($2.50).");
	}

	@Test
	void testCalculateDepositWithBillingFee() {
		Payment p = makePayment(20, "9:00", "10:00", 0, 3.5);
		assertEquals(23.5, p.calculateDeposit(), 0.001,
				"Deposit should equal student hourlyRate ($20) + billing fee ($3.50).");
	}

	@Test
	void testCalculateDepositWithFacultyHourlyRate() {
		Payment p = makePayment(30, "9:00", "10:00", 0, 1.5);
		assertEquals(31.5, p.calculateDeposit(), 0.001,
				"Deposit should reflect faculty hourly rate ($30) + credit fee ($1.50).");
	}

	@Test
	void testCalculateDepositWithStaffHourlyRate() {
		Payment p = makePayment(40, "9:00", "10:00", 0, 1.5);
		assertEquals(41.5, p.calculateDeposit(), 0.001,
				"Deposit should reflect staff hourly rate ($40) + credit fee ($1.50).");
	}

	@Test
	void testCalculateDepositWithPartnerHourlyRate() {
		Payment p = makePayment(50, "9:00", "10:00", 0, 1.5);
		assertEquals(51.5, p.calculateDeposit(), 0.001,
				"Deposit should reflect partner hourly rate ($50) + credit fee ($1.50).");
	}

	@Test
	void testCalculateDepositWithZeroHourlyRate() {
		Payment p = makePayment(0, "9:00", "10:00", 0, 1.5);
		assertEquals(1.5, p.calculateDeposit(), 0.001,
				"Deposit should equal only the fee when hourly rate is zero.");
	}

	@Test
	void testCalculateDepositIsFormattedToTwoDecimalPlaces() {
		// hourlyRate=20, fee=1.5 → raw sum is 21.5, formatted to 2 d.p. stays 21.50
		Payment p = makePayment(20, "9:00", "10:00", 0, 1.5);
		double result = p.calculateDeposit();
		// Round to 2 decimal places and compare
		double rounded = Math.round(result * 100.0) / 100.0;
		assertEquals(rounded, result, 0.0001,
				"calculateDeposit() result should already be formatted to 2 decimal places.");
	}

	@Test
	void testCalculateDepositIsDifferentAcrossPaymentTypes() {
		Payment credit  = makePayment(20, "9:00", "10:00", 0, 1.5);
		Payment debit   = makePayment(20, "9:00", "10:00", 0, 2.5);
		Payment billing = makePayment(20, "9:00", "10:00", 0, 3.5);
		assertNotEquals(credit.calculateDeposit(), debit.calculateDeposit(),
				"Credit and debit deposit amounts should differ due to different fees.");
		assertNotEquals(debit.calculateDeposit(), billing.calculateDeposit(),
				"Debit and billing deposit amounts should differ due to different fees.");
		assertNotEquals(credit.calculateDeposit(), billing.calculateDeposit(),
				"Credit and billing deposit amounts should differ due to different fees.");
	}
}

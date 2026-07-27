package payment;

public class Context{
	private Payment payment;	
	
	public Context(Payment payment) {
		this.payment = payment;
	}	
	
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	public double executeCalculateDeposit() {
		return payment.calculateDeposit();
	}
	
	public double executeCalculateCost() {
		return payment.calculateCost();
	}

	public void setCardInformation(String cardInfo) {
		this.payment.cardInformation = cardInfo;
		
	}

	public void setDeposit(double deposit) {
		this.payment.deposit = deposit;
		
	}
	
	//The below methods are only for testing purposes.
	
	public String getCardInformation()
	{
		return this.payment.cardInformation;
	}
	
	public double getDeposit()
	{
		return this.payment.deposit;
	}
	
	public Payment getPayment()
	{
		return this.payment;
	}
}

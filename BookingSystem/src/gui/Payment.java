package gui;

import java.text.DecimalFormat;

public abstract class Payment{
	protected String status;
	protected double hourlyRate;
	protected String endTime;
	protected String startTime;
	protected String cardInformation;
	protected double deposit;
		
	public Payment(double hourlyRate, String endTime, String startTime , String cardInformation, double deposit) {
		this.hourlyRate = hourlyRate;
	    this.endTime = endTime;
	    this.startTime = startTime;
		this.cardInformation = cardInformation;
		this.deposit = deposit;
		this.status = "Pending";
	}

	public abstract double calculateCost();
	public abstract String getStatus();
	protected abstract double getFee();

	//deposit due when booking is just the 1 hour rate plus the fee, not the full cost
	public double calculateDeposit() {
		DecimalFormat df = new DecimalFormat("0.00");
		
		//if deposit is irrelevant (Extend Booking), deals with it.
		if(deposit == -1)
		{
			return 0;
		}
		
		return Double.parseDouble(df.format(hourlyRate + getFee()));
	}
}

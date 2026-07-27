package payment;

import java.text.DecimalFormat;

public class CreditCardPayment extends Payment{
	
	//Arbitrary Fee to differentiate payment methods
	
	private static final double FEE = 1.5;

	public CreditCardPayment(double hourlyRate, String startTime, String endTime, String cardInformation, double deposit) {
		super(hourlyRate, endTime, startTime, cardInformation, deposit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateCost() {
		
		DecimalFormat df = new DecimalFormat("0.00");

		int startHours = Integer.parseInt(startTime.substring(0, startTime.indexOf(":")))*60;
		int startMinutes = Integer.parseInt(startTime.substring(startTime.indexOf(":") + 1));
		 
		int endHours = Integer.parseInt(endTime.substring(0, endTime.indexOf(":")))*60;
		int endMinutes = Integer.parseInt(endTime.substring(endTime.indexOf(":") + 1)) ;

		double totalTime = ((endHours + endMinutes) - (startHours + startMinutes))/60.0;
		return Double.parseDouble(df.format(totalTime*hourlyRate + FEE));
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getFee() {
		return FEE;
	}

	@Override
	public String getStatus() {
         
		if(deposit == calculateCost())
		{
			status = "Complete";
		}
	
		return status;
	}
	
}
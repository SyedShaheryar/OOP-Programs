package labtask;

public class CashPayment extends Payment{
	
	
	
	public CashPayment (double m)
	{
		super (m);
	}

	
	public void paymentDetails ()
	{
		System.out.println("Payment is in cash \namount: " + amount);
	}
	
	
	

	
	

}

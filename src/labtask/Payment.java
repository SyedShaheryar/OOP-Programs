package labtask;

public class Payment {
	
	protected double amount;
	
	public Payment (double m)
	{ 
		setAmount(m);
	}
	
	public void setAmount (double m)
	{
		if (m  > 0 && m < 50000)
		{
			amount = m;
		}
	
		else
			System.out.println("Wrong amount");
	
	}



	public double getAmount()
	{
		return amount;
	}
	

	public void paymentDetails ()
	{
		System.out.println("Amount of payment: "+ amount);
	}
}



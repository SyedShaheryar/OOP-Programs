package labtask;

public class CreditCardPayment extends Payment {
	private String Name;
	private	String Date ;
	private int ccNumber;
	
	public CreditCardPayment (String n, String d,  int ccn, double am)
	{
		super (am);
		Name = n;
		Date = d;
		ccNumber = ccn;
	}
	
	public  void setName(String n)
	{
		Name = n;
	}
	public String getName()
	{
		return Name;
	}
	
	public void setDate(String d)
	{
		Date = d;
		
	}
	public String getDate()
	{
		return Date;
	}
	
	public void setccNumber(int ccN)
	{
		ccNumber = ccN;
	}
	public int getccNumber()
	{
		return ccNumber;
	}
	
	public void paymentDetails ()
	{
		System.out.println("Payment via Credit Card");
		System.out.println("Name: " + Name + "Expiration Date: " + Date + "ccNumber: "+ ccNumber + " amount: " + amount);
	}
	
	

}

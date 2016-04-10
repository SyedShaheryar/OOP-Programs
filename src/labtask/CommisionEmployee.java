package labtask;

public class CommisionEmployee {
	
	protected String firstName;
	protected String lastName;
	protected int socialSecuritNumber; //equivalent to CNIC
	protected double grossSales;
	protected double commissionRate;

public CommisionEmployee(String f, String l, int ssn, double gs, double cr)
{
	firstName = f;
	lastName = l;
	socialSecuritNumber = ssn;
	setGrossSales(ssn);
	setCommissionRate (cr);
	
}

public void setFirstName (String f)
{
	firstName = f;
	
}

public String getFirstName ()
{
	return firstName;
}

public void setLastName (String l)
{
	lastName = l;
	
}

public String getLastName ()
{
	return lastName;
}

public void  setSSN (int ssn)
{
	socialSecuritNumber = ssn;
}

public int getSSN()
{
	return socialSecuritNumber;
}

public void setGrossSales (double gs)
{
	grossSales = (gs<0.0 && gs > 1.0)? 0.0 : gs;
}

public double getGrossSales ()
{
	return grossSales;
}

public void setCommissionRate (double cr)
{
	commissionRate = (cr > 0.0 && cr < 1.0)? cr: 0.0;
}
public double getCommissionRate ()
{
	return commissionRate;
}

public double earnings()
{
	return commissionRate  * grossSales;
}

public String toString()
{
	return String.format("%s: %s %s \n %s: %s \n %s: %.2f \n %s: %.2f","commision employee", firstName, lastName, 
			"social security number", socialSecuritNumber, 
			"gross sales", grossSales,
			"commisson rate", commissionRate);
}



}


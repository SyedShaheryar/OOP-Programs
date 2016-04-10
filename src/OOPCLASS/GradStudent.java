package OOPCLASS;

public class GradStudent extends Student {
	
	private final int numsemester = 4;
	
private final int fees = 72500; 
	
	public GradStudent(String f, String l , int n)
	{
		super(f,l,n); //calling constructor of super class 
		
	
		
	}
	public int totalFees()
	{
		return numsemester*fees;
	}
	
	public String toString()
	{
		return String.format("FirstName: %s , lastname: %s, regnumber %d", firstName,lastName,regNum);
		
	}
}

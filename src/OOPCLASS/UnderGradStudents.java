package OOPCLASS;

public class UnderGradStudents extends Student{
	private final int numSemester = 8 ; // for bs students there are fixed 8 semester
	private final int fees = 72500; 
	
	public UnderGradStudents(String f, String l , int n)
	{
		super(f,l,n); //calling constructor of super class 
		
	
		
	}
	public int totalFees()
	{
		return numSemester*fees;
	}
	

	public String toString()
	{
		return "BS STUDENT " +firstName+ " "+lastName+" "+" "+"Reg num" + " " +regNum +"which studies "+numSemester+" semesters" ;
		
	}

	

}

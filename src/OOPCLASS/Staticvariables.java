package OOPCLASS;

public class Staticvariables {
	
	public String firstName;
	private String lastName;
	public static int employeeCount = 0;

	public Staticvariables (String f, String l){
		firstName = f;
		lastName = l;
		employeeCount++;
	}
	
	public Staticvariables (Staticvariables s)
	{
		this.firstName = s.firstName;
		this.lastName = s.lastName;
		this.employeeCount++;
	}
	
	public String toString(){
		
		return String.format("Employee num %d Name = %s %s created",employeeCount,firstName,lastName);
	}
	
	public static int getEmployeeCount(){
		
		return employeeCount;
	}
	
	protected void finalize(){ // garbage collector jb object ko delete krega to isko call krega
							// whenever employee resigns it deletes its object and will decrease employeecount
		
		employeeCount--;
		System.out.println(employeeCount);
		
	}

}

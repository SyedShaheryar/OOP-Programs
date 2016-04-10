package labsessional;

public class Employee {

	private String Name;
	private String Designation;
	private int age;
	private int Salary;
	
	
	public Employee(String n, String d, int a, int s){
	
		Name = n;
		Designation =d;
		age =a;
		Salary =s;
		
	}
	
	public String getName()
	{
		return Name;
	}
	
	public String getDesignation()
	{
		return Designation;
	}
	
	public int getage()
	{
		return age;
	}
	
	public int getSalary()
	{
		return Salary;
	}
	
	
	
	
}

//INHERITENCE
package OOPCLASS;


public class Student {
	
	protected String firstName; //protected datamembers are visible to its sub classes only
	protected String lastName;
	protected int regNum;
	
	

	public Student(String f, String l, int n)
	{
		firstName = f;
		lastName = l;
		regNum = n;
		
	}
	
	public String toString()
	{
		return String.format("FirstName %s, lastName %s, RegistorNumber %d", firstName, lastName, regNum);
		//return firstName+ " "+lastName+" "+" "+"Reg num" + " " +regNum can also be done by this
		
	}
}

package OOPCLASS;

public class Employee {


	public String firstName;
	private String lastName;
	private Date birthDate;
	private Date hiringDate;
	private int Salary;
	private int totalSalary;
	private Date currentDate;

	public Employee(String f, String l, Date b, Date h, int s, Date cdate){
		
		// NO ERROR Checking for simplicity
		
		firstName = f;
		lastName = l;
		birthDate = b;
		hiringDate =h;
		Salary = s;
		currentDate = cdate;
		
	}


	public int totalSalary(){
		int a = currentDate.year-birthDate.year * currentDate.month-birthDate.month;
		return a;
		
		
	}


	public String getAge(){
		int age = hiringDate.year - birthDate.year;
		return String.format("Age of Emloyee: %s", age);
	}

	public String toString(){ 
		
		//when object is called JVM implicitly calls the toString Function

		return String.format("FirstName:  %s, LastName: %s, Birthdate: %s, HiringDate: %s, Salary: %d",firstName, lastName,birthDate,hiringDate, Salary);

	}




	}

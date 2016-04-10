package OOPCLASS;

public class TestStudent {

	public static void main(String[] args) 
	{

	Student s = new Student("ali", "Kazim", 102);
	s.toString();
	System.out.println(s + " created");
	
	
	UnderGradStudents s1 = new UnderGradStudents("Ali", "Kaaim", 1023);
	//s1.toString(); //tostring function sub class ka call hoga if we have it there agr subclass mein nhi hai to superclass ka
	System.out.println(s1.toString()+ " created");
	System.out.println("total fees:"+s1.totalFees());
	GradStudent s2 = new GradStudent("Alisha", "Kaaim", 1024);
	s2.toString(); //tostring function sub class ka call hoga if we have it there agr subclass mein nhi hai to superclass ka
	System.out.println(s2+ " created");
	System.out.println("total fees:"+s2.totalFees());
	
	
	
	}

}

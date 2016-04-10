package OOPCLASS;

public class CommisionPlusBase extends CommisionEmployee {
	 private double baseSalary;
	 
	 public CommisionPlusBase(String first, String last, int ssn, double sales, double rate, double salary)
	 {
		 super (first,last,ssn,sales,rate);
		 setBaseSalary(salary);
	 }
	
	 public void setBaseSalary (double salary)
	 {
		 baseSalary = (salary < 0.0)? 0.0 : salary;
	 }
	 
	 public double getBaseSalary(){
		 return baseSalary;
	 }

	 public double earnings ()
	 {
		 return baseSalary + (commissionRate * grossSales);
	 }


	 public String toString()
	 {
			return String.format("%s: %s %s \n %s: %s \n %s: %.2f \n %s: %.2f","commision employee", firstName, lastName, "social security number", socialSecuritNumber, "gross sales", grossSales,"commisson rate", commissionRate,"base Salary", baseSalary );
			

	 }



}

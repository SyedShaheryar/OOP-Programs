package OOPCLASS;

public class testEmployee {


		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Date h = new Date(2013,12,29);
			Date b = new Date(1976,12,1);
			Date cd = new Date(2016,2,20);
			
			Employee emp = new Employee("Ali", "Abid", b,h, 15000, cd);
			System.out.println(emp);
			System.out.println(emp.getAge());
			System.out.println("Total Salary of "+emp.firstName +": "+emp.totalSalary());
		
		
		
		
		}

		
		
		
	}

package OOPCLASS;

public class testSV {


		public static void main(String[] args) {
			// TODO Auto-generated method stub

		Staticvariables e = new Staticvariables("ali", "kazim");
		System.out.println(e);
		
		Staticvariables e1 = new Staticvariables("khalid", "kazim");
		System.out.println(e1);
		
		System.out.println(e1.getEmployeeCount());
		System.out.println(e.getEmployeeCount());
		System.out.println(Staticvariables.getEmployeeCount()); // i can call directly through class because it is static
		
		System.out.println(e1);
		System.out.println(Staticvariables.getEmployeeCount());
		
		//doing this to call garbage collector 
//		
//		e = null;
//		
//		System.gc(); //garbage collector
//		
		}

	}

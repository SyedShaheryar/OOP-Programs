package OOPCLASS;

public class testShapes {
	
public static void main (String[] args)
{
	Circle c1 = new Circle ("red", 2);
	System.out.println("area of c1 is: " + c1.getCircleArea());

	// just for learning purpose (bad practice)
	Circle c2 = new Circle (); //whenever we call a constructor PARENT'S class constructor is called Either argumented or non-argumented
							   //accordingly parent's parent class's constructor is called and in the end daddy class (OBJECT(which extends in every class implicitly) constructor is called
	System.out.println("Area of c2 is: "+ c2.getCircleArea(2.2));
	

	
	
	
	
	
	// dealing with arrays
	
		Circle circleArray [] = new Circle[2];
		circleArray[0] = c1;
		circleArray[1] = c2;
		

		
		Circle A[] = new Circle[10];
		for(int i =0; i<10;i++)
		{
			A[i] = new Circle(); // default constructor is called of Circle, then Shape and in the end of OBJECT which extends in every class implicitly)
			//System.out.println("area:" + A[i].getCircleArea(i)); // i inititally is 0 .. 1 .. 2 .. 3 upto 9
			System.out.println("AREA: " + A[i].getCircleArea(i*10)); // if radius should be 0.. 10.. 20 upto 90
		}
}


		







}

package Practice;

public class TestRectangle {
	
	public static void main(String args[]){

				Rectangle r = new Rectangle();
				System.out.println("Area using default constructor: " + r.getArea());
				Rectangle r2 = new Rectangle (12,3);
				System.out.println("Area using parametric constructor: " +r2.getArea());
				Rectangle rcopy = new Rectangle(r);
				Rectangle r2copy = new Rectangle(r2);
				System.out.println("Areas using copy constructor: "+ rcopy.getArea()+ " AND " + r2.getArea());
			

		
	}

}

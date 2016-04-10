package OOPCLASS;

public class Circle extends Shapes {
	
	public Circle(String c, double l)
	{
		super (c, l);
	}


	public double getCircleArea(){
		return  3.14 * (measurement * measurement);
	}
	
	public Circle()
	{
		//System.out.println("default constructor called");
		
	}


	
	
}
	

	
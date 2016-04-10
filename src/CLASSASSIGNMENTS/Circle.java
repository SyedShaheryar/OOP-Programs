package CLASSASSIGNMENTS;

public class Circle extends Shape {
	private final double pi = 3.14;
	
	public Circle(double m)
	{
		super(m);
	}
	
	public double getPI()
	{
		return pi;
	}
	
	public double getArea()
	{
		return pi * measurement * measurement;
		
	}
	

}

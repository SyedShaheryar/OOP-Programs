package CLASSASSIGNMENTS; 

public abstract class Shape { 
	
	protected double measurement; // will work as radius in circle class and as length in Square class
	
	public Shape(double m)
	{
		measurement = m;
	}
	
	public void setMeasurement(double m)
	{
		measurement = m;
	}
	
	public double getMeasurement()
	{
		return measurement;
	}
	
	public abstract double getArea();
	

}

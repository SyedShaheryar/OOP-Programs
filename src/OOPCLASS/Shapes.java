package OOPCLASS;

public class Shapes {
	
	protected String color;
	protected double measurement;
	
	
public Shapes(String c, double m)
{
	System.out.println("super constructor called");//we can print some message here to check which constructor is called
	
	color = c; 
	measurement = m;
}


public void SetColor(String color){ //setter getter are good practice. This Setcolor can be accessed by anyone cuz its public. the constructor's setter can only be accessed by the programmer
	this.color = color;
}

public String getColor(String color)
{
	return color;
}
public void SetMeasurement(double m)
{
	if (measurement < 0)
		System.out.println("Error");
	else 
		this.measurement = m;
}

public double GetLength(double m){
	return measurement;
}

//only for learning purpose (not a good oop practice)

public Shapes()
{
	System.out.println("Color red");
	
}


public double getCircleArea(double m)
{
	return 3.14 * m *m;
}





}

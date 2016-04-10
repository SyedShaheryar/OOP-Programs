package OOPCLASS;

public class Square extends Shapes {
	
	public Square(String c, double l)
	{
		super (c, l);
	}

	
	public double getSquareArea(double l){
		return l * l;
	}

}

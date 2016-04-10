package labsessional;

public class Factorial {
	
	private int num;
	
	public Factorial (int n)
	{
	num = n;	
	}
	
	public int calculatefactorial(){
		int factorial = 1;
		for (int i=num; i>0; i--)
		{
			factorial = factorial * i;
		}
		return factorial;
}
}
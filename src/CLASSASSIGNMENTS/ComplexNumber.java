package CLASSASSIGNMENTS;

	public class ComplexNumber 
{
		private int realPart;
		private int imaginaryPart;
		
		public ComplexNumber()
		{
			realPart=30;
			imaginaryPart = 10;
		}
			public ComplexNumber(int realPart , int imaginaryPart)
		{
			
			this.realPart = realPart;
			this.imaginaryPart = imaginaryPart; 
		
		}
		public ComplexNumber AddNum(ComplexNumber a , ComplexNumber b)
		{
			ComplexNumber c1 = new ComplexNumber(a.realPart+b.realPart,a.imaginaryPart+b.imaginaryPart);
			return c1;
			
		}
		public ComplexNumber SubtractNum(ComplexNumber a , ComplexNumber b)
		{
			ComplexNumber c2 = new ComplexNumber(a.realPart-b.realPart,a.imaginaryPart-b.imaginaryPart);
			return c2;
		}
		
		 public String toString()
		{
			return String.format("Realpart %d, ImaginaryPart %d", realPart, imaginaryPart);
		}
}

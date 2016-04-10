package CLASSASSIGNMENTS;
import java.util.Scanner;

public class testComplex 
{


		public static void main(String[] args) 
		{
			
			ComplexNumber c1 = new ComplexNumber(25,1); //using parameterized constructor
			ComplexNumber c2 = new ComplexNumber(21,5);
			ComplexNumber Added = c1.AddNum(c1, c2);
			ComplexNumber Subtracted = c1.SubtractNum(c1, c2);
			
			ComplexNumber c3 = new ComplexNumber (); //using no argument constructor
			
			ComplexNumber Added1 = c3.AddNum(c3, c2);
			ComplexNumber Subtracted1 = c3.SubtractNum(c3, c2);
			
			System.out.println("BY USING PARAMETERIZED CONSTRUCTOR");
			System.out.println("ADDITION OF COMPLEX NUMBER\n"+Added.toString());
			System.out.println("\nSUBTRACTION OF COMPLEX NUMBER\n"+Subtracted.toString());
			System.out.println("\nBY USING NO ARGUMENT CONSTRUCTOR");
			System.out.println("ADDITION OF COMPLEX NUMBER\n"+Added1.toString());
			System.out.println("\nSUBTRACTION OF COMPLEX NUMBER\n"+Subtracted1.toString());

		}

}

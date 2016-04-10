package Practice;
import java.util.Scanner;
public class TestCircle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Circle c1 = new Circle();
		
		System.out.println("Circumference: "+c1.getCircumference());
		System.out.println("This is my Radius' Circumference");
		
		System.out.println("Enter Radius Of your choice now");
		int r1 = input.nextInt();
		Circle c2 = new Circle(r1);
		System.out.printf("4%d" ,c2.getCircumference());
	
	}

}

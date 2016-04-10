package labsessional;
import java.util.Scanner;
public class FactorialTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		Factorial f = new Factorial(number);
		System.out.println(f.calculatefactorial());
		

	}

}

package OOPCLASS;
import java.util.Scanner;
public class testDate {


		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter day");
		int day = input.nextInt();
		System.out.println("Enter month");
		int month = input.nextInt();
		System.out.println("Enter year");
		int year = input.nextInt();
		
		
		
		
		Date d = new Date(year,month,day);
		
		System.out.println("Enter another day");
		int day1 = input.nextInt();
		System.out.println("Enter another month");
		int month1 = input.nextInt();
		System.out.println("Enter another year");
		int year1 = input.nextInt();
		Date d1 = new Date(year1,month1,day1);
		
		System.out.println("Date1: "+d.toString());
		System.out.println("Date2: "+d1.toString());
		
		
		}

	}



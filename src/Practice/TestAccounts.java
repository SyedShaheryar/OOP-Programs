package Practice;

import java.util.Scanner;

public class TestAccounts {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	Accounts a1 = new Accounts(20000);
	System.out.println("Enter amount to deposit");
	int deposit = input.nextInt();
	a1.depositAmount(deposit);
	System.out.println("Enter amount to withdraw");	
	int withdraw = input.nextInt();	
		
	
	a1.WithdrawAmount(withdraw);
//	
//	System.out.println(a1.getBalance());
	}

}

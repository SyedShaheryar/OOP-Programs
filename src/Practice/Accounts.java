package Practice;

public class Accounts {
	
	private int balance;
	
	Accounts(int b){
		balance = b;
	}
	
	void depositAmount(int da){
		
		balance = balance + da;
		
		System.out.println("Rs: "+da+" successfully deposited\nnew balance: " +balance );
		
	}
	
	void WithdrawAmount(int wa){
		if(wa>balance){
		
			System.out.println("You don't have enough amount in your account");
		
		}
		balance = balance-wa;
		
		System.out.println("Rs: "+wa+" operation successfull\nnew balance: " +balance );
		
	}
	

//	int getBalance(){
//		return balance;
//	}
}

package labtask;

public class testBankAccount {

	public static void main(String[] args) {

		BankAccount A1 = new SavingAccount(2000.0, 200.012, 80.021);
		A1.Deposit(15000);
		System.out.println(A1.getAIR());
		
		
		
		
	}

}

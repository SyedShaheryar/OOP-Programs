package labtask;

public class SavingAccount extends BankAccount{
	
	
	
	public SavingAccount(double b, double AIR, double MSC)
	{
		super(b, AIR, MSC);
	}


	public boolean StatusField()
	{
		if (Balance < 25)
			{
			System.out.println("Account is InActive");
		
			}
			
			return true;
	
	}
	
	
	public void Deposit(double AmountOfDeposit)
	{	
		
		
		if(StatusField())
		{
			Balance = Balance + AmountOfDeposit;
			NumOfDeposits++;
			
		}
		
		else
			System.out.println("Account is InActive");
	
	
	}


	public void WithDraw(double AmountOfWithdraw)
	{
		if(StatusField())
		{
		Balance = Balance - AmountOfWithdraw;
		NumOfWithdrawls++;
		}
		else
			
			System.out.println("Your account is InActive");
	
	}


	public void CalcInterest()
	{
		double MonthlyInterestRate = (AnnualInterestRate/12);
		MonthlyInterestRate = Balance * MonthlyInterestRate;
		Balance = Balance + MonthlyInterestRate;
		
	}

	public void MonthlyProcess()
	{
		
		
		if(NumOfWithdrawls > 4 && Balance > 25)
		{
			Balance = Balance - (NumOfWithdrawls - 4);
			NumOfDeposits = 0;
			NumOfWithdrawls = 0;
			MonthlyServiceCharges = 0;
			System.out.println("Balance: " + Balance);
		
		}
		else
			
		System.out.println("Account is InActive");
		
	
	}





}


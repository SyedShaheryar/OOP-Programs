package labtask;

public abstract class BankAccount {
	 
	protected double Balance;
	protected int NumOfDeposits;
	protected int NumOfWithdrawls;
	protected double AnnualInterestRate;
	protected double MonthlyServiceCharges;
	
	
	public BankAccount (double b, double AIR, double MSC)
	{
		Balance = b;
//		NumOfDeposits = numD;
//		NumOfWithdrawls = numW;
		AnnualInterestRate = AIR;
		MonthlyServiceCharges = MSC;
		
	}
	
	public abstract void Deposit(double AmountOfDeposit);
	public abstract void WithDraw(double AmountOfWithdraw);
	public abstract void CalcInterest();
	public abstract void MonthlyProcess();
	
	public void setBalance(double b ){
		Balance = b;
		
	}
	
	public double getBalance()
	{
		return Balance;
	}
	
	public void setNumOfD(int numD ){
		NumOfDeposits = numD;
		
	}
	
	public int getNumOfD()
	{
		return NumOfDeposits;
	}
	

	public void setNumOfW(int numW ){
		NumOfWithdrawls = numW;
		
	}
	
	public int getNumOfW()
	{
		return NumOfWithdrawls;
	}
	
	public void setAIR(double AIR ){
		AnnualInterestRate = AIR;
		
	}
	
	public double getAIR()
	{
		return AnnualInterestRate;
	}
	
	public void setMSC(double MSC ){
		MonthlyServiceCharges = MSC;
		
	}
	
	public double getMSC()
	{
		return MonthlyServiceCharges;
	}
	




	
}




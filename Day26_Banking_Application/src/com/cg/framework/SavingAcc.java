package com.cg.framework;

public abstract class SavingAcc extends BankAcc
{
	private boolean isSalaried;
	@SuppressWarnings("unused")
	private static final float MINBAL=2000f; //minimum balance should be in bank account

	public SavingAcc(int accNo, String accNm, float accBal,boolean isSalaried) 
	{
		super(accNo, accNm, accBal);
		this.isSalaried=isSalaried;
	}
	public void withdraw(float ammount)
	{
		float acc=this.getAccBal();     //accessing the account balance using get method
		acc-=ammount;                  //amount get deducted after withdrawal of money
		this.setAccBal(acc);
		System.out.println("Account no: " +this.getAccNo()+ " Account Holder name: "+this.getAccNm()+" Account Balance:"+ 
				this.getAccBal()+ " Withdraw Ammount:"+ammount); // Printing values
	}

	@Override
	public String toString() 
	{
		return String.format("SavingAcc [isSalary=%s]", isSalaried);
	}
	

}

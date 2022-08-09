package com.cg.framework;

public abstract class CurrentAcc extends BankAcc
{
	private final float creditLimit=10000f;

	public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit) 
	{
		super(accNo, accNm, accBal);
	}
	
	public void withdraw(float ammount)
	{
		float accBal=this.getAccBal();
		if(ammount<=creditLimit)
		{
			if(ammount<accBal)
			{
				accBal-=ammount;
				this.setAccBal(accBal);
				System.out.println("Account No:" +this.getAccNo()+" Account Holder name:"+this.getAccNm()+
						" Withdrawal Ammount:"+ ammount+ " Account Balance:"+accBal);		
			}
			else
			{
				System.out.println("Please enter Ammount Less than or equal to balance...");
			}
		}
		else
		{
			System.out.println("Please enter Ammount Less than or equal to Creditlimit value...");
		}
	}

	@Override
	public String toString() 
	{
		return String.format("CurrentAcc [creditLimit=%s]", creditLimit);
	}


	
}

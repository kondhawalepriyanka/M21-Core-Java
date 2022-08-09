package com.cg.application;

import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class MMBankFactory extends BankFactory
{

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit)
	{
		//MMCurrentAcc m=new MMCurrentAcc( accNo,  accNm,  accBal,  creditLimit);
		return null;
	}
	
	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalaried)
	{
		//MMSavingAcc m=new MMSavingAcc(accNo,accNm,accBal,isSalaried);
		return null;
	}
		
}

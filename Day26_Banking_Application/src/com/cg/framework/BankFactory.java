package com.cg.framework;

public abstract class BankFactory 
{
	abstract public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal,boolean isSalary);
	abstract public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal,float creditLimit);

}

package com.cg.framework;

public abstract class BankAcc
{
	private int accNo;
	private String accNm;
	private float accBal;

	public BankAcc(int accNo, String accNm, float accBal) 
	{
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	
	abstract public void withdraw(float ammount);
	public void deposite(float ammount)
	{
		accBal+=ammount;
		System.out.println("Deposited Ammount:"+ammount+" Account Balance:"+accBal);
		
	}
	
	//getters and setters method included
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}


	@Override
	public String toString() {
		return String.format("BankAcc [toString()=%s]", super.toString());
	}
	
	

}

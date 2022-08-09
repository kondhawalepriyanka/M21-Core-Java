package com.user;

import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class User 
{
	public static void main(String[] args) 
	{
		CurrentAcc c=new MMCurrentAcc(133,"Priyanka Kondhawale", 30000, 200);
		SavingAcc s=new MMSavingAcc(140, "Vaibhav Raut", 800000, true);
		System.out.println("Current Account");
		c.withdraw(400);
		System.out.println("Saving Account");
		s.withdraw(600);
		
	}

}

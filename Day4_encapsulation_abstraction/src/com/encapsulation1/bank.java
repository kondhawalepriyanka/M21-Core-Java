package com.encapsulation1;

import com.encapsulation.pack3.IOB;

public class bank 
{

	public static void main(String[] args) 
	{
		IOB i=new IOB();
		i.setATM_PIN(3307);
		System.out.println("The ATM PIN is:" +i.getATM_PIN());

	}

}

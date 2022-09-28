package com.exceptionhandling;

public class ThrowKeyword
{
	public static void validate (int age) 
	{
		if (age<18 || age>28)
		{
			throw new ArithmeticException("not eligible");
		}
		else
			System.out.println("Eligible to attend Military selection");
	}
	public static void main(String[] args) {
	try
	{
		validate(28); //fun call 
		
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	System.out.println("rest of the code...");

	}
}


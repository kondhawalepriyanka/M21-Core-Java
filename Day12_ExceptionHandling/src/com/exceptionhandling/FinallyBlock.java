package com.exceptionhandling;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		//if any exception will be there in try block
		//that exception will handle by catch block
		try
		{
			int res=x/0;// divide by zero exception 
			System.out.println(res);
		}
		catch(Exception e)
		{
			System.out.println("Number cannot divide by zero");
			
		}	
		finally
		{
			System.out.println("Whether any exception occur or not, finally block is always excuted");
		}
	}
}

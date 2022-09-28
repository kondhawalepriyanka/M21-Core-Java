package com.exceptionhandling;
//Program to handle the exception
import java.util.Scanner;
public class ArithmeticExceptionExample 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		//if any exception will be there in a try block
		//that exception will handle by catch block
		try
		{
			int res=x/0;
			System.out.println(res);
		}
		catch(Exception e)
		{
			System.out.println("Number cannot divide by zero");
		}	
	
		
		System.out.println("First line");
		System.out.println("Second line");
		int[] myIntArray = new int[]{1, 2, 3};
		print(myIntArray);
		System.out.println("Third line");
		s.close();
	} 
	public static void print(int[] arr)
	{
		 try
		 {
		     System.out.println(arr[3]);
		 }
		 catch(Exception e)
		 {
		     System.out.println("Array index out of bound Exception");
		 }   
	}

}


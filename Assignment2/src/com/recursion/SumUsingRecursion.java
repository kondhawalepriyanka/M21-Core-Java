package com.recursion;
import java.util.Scanner;

public class SumUsingRecursion 
{
	static int sum(int n)
	{
			if(n!=0)			
				 return n+sum(n-1);
			else
			   return n;
	}

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int sum=sum(n);
		System.out.println("Sum="+sum);
		s.close();
	}

}

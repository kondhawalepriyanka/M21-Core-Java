package com.oop;

class B
{
	
	B(int n)
	{
		System.out.println(n);

	}
}

public class ParameterisedConstructor 
{
	public static void main(String[] args)
	{
		int n=8;
		B a=new B(n);
		}

}

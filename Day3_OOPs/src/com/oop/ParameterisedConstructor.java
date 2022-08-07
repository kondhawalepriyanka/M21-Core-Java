package com.oop;

class B
{
	
	B(int n,String name)
	{
		System.out.println(n);
		System.out.println(name);
	}
}

public class ParameterisedConstructor 
{
	public static void main(String[] args)
	{
		int n=8;
		String name="ABC";
		new B(n,name);
		}

}

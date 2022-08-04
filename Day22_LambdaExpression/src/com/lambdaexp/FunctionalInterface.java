package com.lambdaexp;

interface A
{
	void show();
}
/*class B implements A
{
	public void show() 
	{
		System.out.println("Program on Lambda expression");
	}
}*/
public class FunctionalInterface 
{

	public static void main(String[] args) 
	{
		A a=()->
		{
			System.out.println("Program on Lambda expression");
		};
		a.show();
	}

}

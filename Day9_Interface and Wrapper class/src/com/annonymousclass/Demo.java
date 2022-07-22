package com.annonymousclass;
abstract class Annonyms
{
	public abstract void method();
	
}
public class Demo 
{
	public static void main(String[] args) 
	{
		Annonyms a=new Annonyms()
		{
			public void method() 
			{
				System.out.println("This is annonyms class");		
			}
			
		};
		a.method();

	}
}

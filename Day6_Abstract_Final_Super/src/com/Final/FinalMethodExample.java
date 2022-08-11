package com.Final;
//Final Method example
class FinalMethod
{
	void accept()
	{
		System.out.println("Accept Method from Final Class");
	}
}
class Child extends FinalMethod
{
	final void accept()
	{
		System.out.println("Hello");
	}
}
public class FinalMethodExample 
{
	public static void main(String[] args) 
	{	
		Child D=new Child();
		D.accept();
	}
}

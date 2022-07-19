package com.abstractkeyword;

abstract class parent
{
	void print()
	{
		System.out.println("Non Abstract Method");
	}
}
class child extends parent
{
	
}
public class NonabstractMethod 
{

	public static void main(String[] args) 
	{
		parent a=new child();
		a.print();
	}

}

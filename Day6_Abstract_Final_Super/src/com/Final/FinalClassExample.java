package com.Final;

final class FinalClass1
{
	final static int i=10;
	void display()
	{
		System.out.print(i);
	}
}
public class FinalClassExample {

	public static void main(String[] args)
	{
		FinalClass1 c=new FinalClass1();
		c.display();

	}

}

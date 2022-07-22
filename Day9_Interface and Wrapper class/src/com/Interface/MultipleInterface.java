package com.Interface;
interface A
{	
	void displayA();	
}
interface B
{
	void displayB();
}
class C implements A,B
{
	@Override
	public void displayA()
	{
		System.out.println("I am From interface A");
	}
	@Override
	public void displayB()
	{
		System.out.println("I am From interface B");
	}
}
public class MultipleInterface 
{
	public static void main(String[] args) {
		C c=new C();
		c.displayA();
		c.displayB();
	}

}
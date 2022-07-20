package com.polymorphism;
//Program on method overriding 
//one class is not enough create two or more cllass which contains inheritance concept
class Multiplication
{
	void accept(int a,int b)
	{
		System.out.println(a*b);
	}
}
class Mul extends Multiplication
{
	void accept(int x,int y)
	{
		System.out.println(x*y);
	}
}
public class MethodOverriding {

	public static void main(String[] args) 
	{	
		Mul m=new Mul();
		m.accept(3,5);
		Multiplication m1=new Multiplication();
		m1.accept(10, 4);
	}

}

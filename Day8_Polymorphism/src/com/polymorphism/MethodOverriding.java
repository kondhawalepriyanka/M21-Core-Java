package com.polymorphism;
//Program on method overriding 
//one class is not enough create two or more class which contains inheritance concept
//Method Overriding means superclass and child class have same method name with same parameters

class Multiplication
{
	void accept(int a,int b)
	{
		System.out.println(a*b);
	}
}
class Mul extends Multiplication
{
	void accept(int a,int b)
	{
		System.out.println(a*b);
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

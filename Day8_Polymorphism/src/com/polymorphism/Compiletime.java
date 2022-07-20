package com.polymorphism;
class A
{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void add(float a,float b)
	{
		System.out.println(a+b);
	}

}
public class Compiletime {

	public static void main(String[] args) 
	{
		A a=new A();
		a.add(10, 20);
		a.add(4f, 5f);

	}

}

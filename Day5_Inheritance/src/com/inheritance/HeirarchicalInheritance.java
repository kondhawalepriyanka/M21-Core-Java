package com.inheritance;

class Fruit
{
	void print()
	{
		System.out.println("I am Fruit class(Parent Class)");
	}
}
class Apple extends Fruit
{
	void Aprint()
	{
		System.out.println("I am Apple class(1st Child Class)");
	}
}
class Orange extends Fruit
{
	void Oprint()
	{
		System.out.println("I am Orange class(2nd Child Class)");
	}
}
class Mango extends Fruit
{
	void Mprint()
	{
		System.out.println("I am Mango class(3rd Child Class)");
	}
}
public class HeirarchicalInheritance {

	public static void main(String[] args) 
	{
		System.out.println("***Hello...This is program for Heirarchical Inheritance***");

		Apple a=new Apple();
		a.print();
		a.Aprint();
		Orange o=new Orange();
		o.Oprint();
		Mango m=new Mango();
		m.Mprint();
		
	}

}

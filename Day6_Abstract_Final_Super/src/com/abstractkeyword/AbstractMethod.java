package com.abstractkeyword;

 abstract class Fruit
{
	abstract void display();
}

class Apple extends Fruit
{
	void display()
	{
		System.out.println("Apple is good for our health");
		System.out.println("This is from Abstract method");

	}
}
public class AbstractMethod {

	public static void main(String[] args) 
	{
		Fruit a=new Apple();
		a.display();

	}

}

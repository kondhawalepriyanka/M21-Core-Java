package com.superkeyword;
//Super keyword is used to invoke parent class constructor
class Flower
{
	Flower()
	{
		System.out.println("Flower");
	}
}

class Rose extends Flower
{
	Rose()
	{	
		super();
		System.out.println("Rose is Red");
	}
}
public class SuperConstructor {

	public static void main(String[] args) {
		new Rose();

	}

}

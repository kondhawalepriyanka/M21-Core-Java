package com.enumeration;
//Enumeration Program....enum used outside the class

enum Car
{
	Mercedes,BMW,Audi;
}
public class Enum_example 
{
	public static void main(String[] args) 
	{
		Car c=Car.BMW;
		System.out.println(c);
		Car c1=Car.Audi;
		System.out.println(c1);

	}

}

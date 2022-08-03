package com.annotations;
//Suppress Warning
class Animal
{
	//Non Parameterized Constructor
	Animal()
	{
		System.out.print("Lion");
	}
}
public class SuppressWarning {

	public static void main(String[] args) 
	{
		@SuppressWarnings("unused") //will remove the compiler warnings
		Animal a=new Animal();
	}

}

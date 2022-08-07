package com.enumeration;
//Enum method using interface
interface Pizza
{
	void display();
}
enum Size implements Pizza
{
	Small,Medium,Large,ExtraLarge;
	public void display()
	{
		System.out.println("Size is:" +this);
	}
}
public class Enum_Example4 
{

	public static void main(String[] args) 
	{
		Size.ExtraLarge.display(); // var_name.enum.method

	}

}

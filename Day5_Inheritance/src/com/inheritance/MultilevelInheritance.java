package com.inheritance;

class college
{
	void PCCOE()
	{
		System.out.println("Pimpri Chinchwad College of Engineering");
	}
}
class department extends college
{
	String branch="Computer";
	void Computer()
	{
		System.out.println("From "+branch+" Branch");
	}
}
class teachers extends department
{
	void physics()
	{
		System.out.println("Subject Physics");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) 
	{
		System.out.println("***Hello...This is program for Multilevel Inheritance***");

		teachers c=new teachers();
		c.physics();
		c.Computer();
		c.PCCOE();
	}

}

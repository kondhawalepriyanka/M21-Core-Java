package com.Interface;

interface inf
{
	void display();
	
}
class Demo implements inf
{
	public void display()
	{
		System.out.println("Interface");
	}

}
public class Main
{
	public static void main(String args[])
	{
		Demo d=new Demo();
		d.display();
	}
}
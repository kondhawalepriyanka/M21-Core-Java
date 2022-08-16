package com.inheritance;

class BaseClass
{
	final void display()
	{
		System.out.println("This is Parent class");
	}
}
class ChildClass extends BaseClass
{
	final void cdisplay()
	{
		System.out.println("This is Child class");
	}
}
public class SinleInheritance 
{
	public static void main(String[] args) 
	{
		ChildClass c=new ChildClass();
		c.display();
		c.cdisplay();
		BaseClass b=new BaseClass();
		b.display();
	}
}

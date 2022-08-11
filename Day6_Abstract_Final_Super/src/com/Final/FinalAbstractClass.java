package com.Final;
//class can be abstract or final not both
abstract class AbstractClass
{
	abstract void display();
}
final class finalclass extends AbstractClass
{
	void display()
	{
		System.out.println("Display method from Final class and Abstracted method from Abstract Class");	
	}
}

public class FinalAbstractClass {

	public static void main(String[] args) 
	{
		finalclass f=new finalclass();
		f.display();

	}

}

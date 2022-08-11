package com.Interface;
interface Vehicle
{
	void speed();
}
//when we use two interface and we are going to use extends keyword here 
interface Car extends Vehicle
{
	void engine();
}
class Bus implements Car
{
	public void engine()
	{
		System.out.println("Engine Method");
	}
	public void speed() 
	{
		System.out.println("Speed Method");

	}
}
public class MainExample {

	public static void main(String[] args) 
	{
		
		 Bus b=new  Bus();
		 b.speed();
		 b.engine();
	}

}

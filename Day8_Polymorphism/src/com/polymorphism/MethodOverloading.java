package com.polymorphism;
//Program on method/function overloading
class Shape
{
	//by changing no of arguments
	int area(int a)
	{
		return a*a;
	}
	int area(int a,int b)
	{
		return a*b;
	}
	
}
public class MethodOverloading {

	public static void main(String[] args) 
	{
		
		Shape s=new Shape();
		
		System.out.println(s.area(6));

		System.out.println(s.area(2, 5));
	}

}

package com.javagenerics;
//Generic class Program

public class GenericClass<T>
{
	T num;
	public void display()
	{
		System.out.print(num.getClass().getName());
	}
	
	public static void main(String[] args) 
	{
		GenericClass<Character>obj=new GenericClass<Character>();
		obj.num='t';
		obj.display();
	}

}

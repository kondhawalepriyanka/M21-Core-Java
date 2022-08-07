package com.enumeration;
//Enum in the class Program
public class Enum_Program
{
	enum Margin
	{
		Top,Bottom,Left,Right;
	}

	public static void main(String[] args) 
	{
		int count=1;
		for(Margin i:Margin.values())
		{
			System.out.printf("Margin:%d=%s\n",count++,i);	
		}

	}

}

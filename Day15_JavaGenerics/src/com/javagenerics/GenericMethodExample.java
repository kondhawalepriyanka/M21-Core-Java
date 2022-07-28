package com.javagenerics;

public class GenericMethodExample
{
	public static void main(String[] args) 
	{
		Integer arr[]= {11,22,33,44,55};
		Character ch[]= {'P','Q','R'};
		
		
		System.out.println("Integer Array:");
		print(arr);
		
		System.out.println("Character Array: ");
		print(ch);
	}
		
	public static <E>void print(E[] elements)	
	{
			for(E elem:elements)
			{
				System.out.println(elem);
			}
			System.out.println();		
	}	
}

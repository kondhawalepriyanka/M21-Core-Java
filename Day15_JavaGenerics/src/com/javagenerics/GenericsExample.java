package com.javagenerics;

import java.util.LinkedList;
import java.util.List;

public class GenericsExample
{

	public static void main(String[] args)
	{
		List<Integer>obj=new LinkedList<Integer>();
		obj.add(10);
		obj.add(11);
		obj.add(45);
		System.out.println(obj);
		//1.Compile time checking
		
		//2.Typecasting is not required in generics
		List<String>obj1=new LinkedList<String>();
		//List obj1=new LinkedList();
		obj1.add("Priyanka");
		obj1.add("Abhishek");
	
		//3.typecasting explicitly if there is not an object type
		//string str1=(string)obj1.get(1);
		String str=obj1.get(1);
		System.out.println(obj1);
	}

}

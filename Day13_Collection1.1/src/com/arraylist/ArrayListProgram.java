package com.arraylist;
import java.util.ArrayList;
import java.util.List;

//Array List Program
public class ArrayListProgram
{
	public static void main(String[] args) 
	{
		List<Integer>obj=new ArrayList<>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		System.out.println("Array List elements are:"+obj);
		System.out.println(obj.contains(1));
		System.out.println(obj.indexOf(3));
	}
}

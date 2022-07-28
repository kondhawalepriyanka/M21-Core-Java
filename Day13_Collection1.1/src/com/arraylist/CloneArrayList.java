package com.arraylist;

import java.util.ArrayList;

public class CloneArrayList {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		ArrayList obj=new ArrayList();
		obj.add("Priyanka");
		obj.add(3);
		obj.add(2.6);
		obj.add("Siddhi");
		System.out.println(obj);
		
		//Shallow copy of ArrayList
		Object clonelist;
		clonelist=obj.clone();
		System.out.println(clonelist);
	}

}

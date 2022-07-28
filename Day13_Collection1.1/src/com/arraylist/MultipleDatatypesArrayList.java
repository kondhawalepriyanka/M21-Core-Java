package com.arraylist;

import java.util.ArrayList;

public class MultipleDatatypesArrayList 
{

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		
		ArrayList obj=new ArrayList();
		obj.add("Priyanka");
		obj.add(10);
		obj.add(15.6);
		System.out.println(obj);
	}

}

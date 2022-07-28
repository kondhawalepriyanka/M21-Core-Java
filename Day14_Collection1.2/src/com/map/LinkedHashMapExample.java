package com.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample 
{
	public static void main(String[] args) 
	{
		Map<Integer,String>obj=new LinkedHashMap<Integer,String>();
		obj.put(6, "Priyanka");
		obj.put(1, "Abhishek");
		obj.put(4, "Siddhi");
		obj.put(2, "Atharva");
		System.out.println(obj);
		System.out.println(obj.get(1));
	}

}

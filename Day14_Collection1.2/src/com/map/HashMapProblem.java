package com.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapProblem {

	public static void main(String[] args) 
	{
		Map<Integer,String>obj=new HashMap<Integer,String>();
		//HashMap is an unordered & LinkedHashMapis an ordered
		obj.put(3, "Abhishek");
		obj.put(1, "Priyanka");
		obj.put(6,"Vaibhav");
		obj.put(5,"Siddhi");
		System.out.println(obj);
		
	}

}

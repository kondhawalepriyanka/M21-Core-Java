package com.sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		
		Set<Object>obj=new LinkedHashSet<Object>();
		obj.add("Abhishek");
		obj.add(2);
		obj.add(9.2);
		System.out.println(obj);
		Object[] arr=obj.toArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}

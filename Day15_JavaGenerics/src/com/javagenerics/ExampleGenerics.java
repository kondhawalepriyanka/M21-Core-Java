package com.javagenerics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExampleGenerics 
{

	public static void main(String[] args) 
	{
		Map<Integer,String>obj=new HashMap<Integer,String>();
		obj.put(1, "Priyanka");
		obj.put(2, "Abhishek");
		System.out.println(obj);
		
		@SuppressWarnings("unused")
		Set<Map.Entry<Integer,String>>itr=obj.entrySet();
		@SuppressWarnings("unused")
		Iterator <Map.Entry<Integer,String>>itr1=itr.iterator();
		while(itr1.hasNext()) 
		{
			//typecasting is not required
			Map.Entry e=itr1.next();
			System.out.println(e.getKey()+"  "+e.getValue());
		}
		
	}

}

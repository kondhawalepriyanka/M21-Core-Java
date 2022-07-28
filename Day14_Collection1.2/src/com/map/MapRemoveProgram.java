package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapRemoveProgram 
{

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) 
	{
		Map<Character,String> map=new HashMap<Character,String>();
		map.put('A', "Priyanka");
		map.put('B', "Abhishek");
		map.put('C', "Siddhi");
		map.put('D', "Vaibhav");
		System.out.println(map);
		map.remove('C');
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}

package com.sets;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) 
	{
		SortedSet<String> s=new TreeSet<String>();
		s.add("Siddhi");
		s.add("Vedant");
		s.add("Abhishek");
		s.add("Priyanka");
		
		System.out.println(s);

	}

}

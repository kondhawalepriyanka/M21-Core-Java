package com.lambdaexp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//Comparable Lambda expression Program
public class ComparableLambda {

	public static void main(String[] args)
	{
		Comparator<String>obj=(s1,s2)->Integer.compare(s1.length(),s2.length());
		String str[]= {"Vaibhav","Priyanka","Abhishek","Dolly","Olly","Siddhi"};//will sort string according to length
		Collections.sort(Arrays.asList(str),obj);
		for(String i:str) 
		{
			System.out.println(i);
		}

	}

}

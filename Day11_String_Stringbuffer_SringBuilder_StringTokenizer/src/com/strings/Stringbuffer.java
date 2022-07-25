package com.strings;

public class Stringbuffer 
{

	public static void main(String[] args) 
	{
		String s="Today";
		StringBuffer str= new StringBuffer(s.length());
		System.out.println(str.capacity());
	}

}

package com.regularexpression;

public class SplitMethod 
{
	public static void main(String[] args) 
	{
		
		String str="Have a -- nice day -- Siddhi";
		String res[]=str.split("--"); //splits the string where -- occurs
		for(String i:res)
		{
			System.out.println(i);
		}
	}
}

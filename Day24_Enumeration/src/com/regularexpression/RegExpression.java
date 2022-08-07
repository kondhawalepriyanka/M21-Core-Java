package com.regularexpression;
//Regular Expression Program matches method

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegExpression 
{
	public static void main(String[] args) 
	{
		String pattern ="Priyanka";
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		boolean result=Pattern.matches(pattern, input);
		System.out.println(result);
		s.close();
	}
}

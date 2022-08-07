package com.regularexpression;
//Program Based on Matcher Method From Regular Expression
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegExpressionExample2 
{

	public static void main(String[] args) 
	{
		Pattern p=Pattern.compile("Regular Expression");
		Matcher m=p.matcher("Matcher Method From Regular Expression Program");
		while(m.find())
		{
			System.out.printf("Pattern Found from: "+m.start()+ " to " +(m.end()-1));
		}
		System.out.println();
		System.out.println("Nothing");
	}

}

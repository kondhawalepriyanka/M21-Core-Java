package com.lambdaexp;

interface Example1
{
	//Two parameterized abstract method
	String print(String str1,String str2);
}

public class TwoParameterizedFunctionalInterface 
{

	public static void main(String[] args) 
	{
		//Lambda expression
		Example1 e1=(String str1,String str2)->
		{
			return str1+" "+str2;
			
		};
		System.out.println(e1.print("String 1","String 2"));

	}

}

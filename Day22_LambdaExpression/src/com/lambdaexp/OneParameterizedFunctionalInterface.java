package com.lambdaexp;

interface example
{
	//One parameterized abstract method
	String print(String str);
}

public class OneParameterizedFunctionalInterface
{

	public static void main(String[] args) 
	{
		//Lambda Expression
		example e=(String str)->
		{
			return str;
		};
		System.out.println(e.print("Lambda Expression"));
	}

}

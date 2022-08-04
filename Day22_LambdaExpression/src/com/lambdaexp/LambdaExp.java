package com.lambdaexp;
interface LExp
{
	int add(int a,int b);
}
public class LambdaExp {

	public static void main(String[] args) 
	{
		LExp obj=(int a,int b)->(a*b);
		System.out.println("Multiplication on A and B:"+obj.add(10, 3));
	}

}

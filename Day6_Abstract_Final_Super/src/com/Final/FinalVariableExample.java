package com.Final;

class FinalVariableProgram
{
	final int i=10;
	void display(int i)
	{
		System.out.println(i);
	}
}
public class FinalVariableExample 
{
	public static void main(String[] args)
	{
		FinalVariableProgram f=new FinalVariableProgram();
		f.display(30);
	}
}

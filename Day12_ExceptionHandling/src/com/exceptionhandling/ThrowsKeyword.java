package com.exceptionhandling;

import java.io.IOException;

public class ThrowsKeyword {
	static void display(int x)throws IOException,ClassNotFoundException
	{
		if(x==5)
		{
			throw new IOException("Input-Output  Exception");
		}
		else
		{
			throw new ClassNotFoundException("Class not found exception");
		}
	}

	public static void main(String[] args) 
	{
		try
		{
			display(10);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}

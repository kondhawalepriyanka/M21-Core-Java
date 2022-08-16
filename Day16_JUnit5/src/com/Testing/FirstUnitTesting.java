package com.Testing;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class FirstUnitTesting 
{
	
	
	
	@AfterAll
	@Test
	static void AfterAllMethod()
	{
		System.out.println("Welcome to AfterAllMethod from First Unit Testing Program");
	}
	
	@Test
	 void Display() 
	{
		int x=3+6;
		System.out.println(x);
	}
	
	@AfterEach
	@Test
	void AfterEachMethod() 
	{
		String s="After Each Method";
		System.out.println(s);
	}
		
	@Test
	void TestMethod() 
	{
		String s1="TestMethod";
		System.out.println(s1);
	}
	

}

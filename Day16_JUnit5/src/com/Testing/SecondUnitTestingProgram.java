package com.Testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SecondUnitTestingProgram 
{
	
	@Test
	void print() 
	{
		System.out.println("Print Method");	
	}

	@BeforeAll   //will executed before all methods 
	@Test
	static void display() 
	{
		System.out.println("BeforeAll-executes once before all the test method in this class");
		
	}
	@BeforeEach   //will executed before each method for all methods
	@Test
	void accept() 
	{
		System.out.println("Accept Method");	
	}
	
}

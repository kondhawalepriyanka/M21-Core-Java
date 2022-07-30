package com.Testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ThirdUnitTestingProgram 
{
	@DisplayName("Test is Successfully implemented")
	@Test
	void print() 
	{
		System.out.println("Print Method from Third Unit Testing Program class");	
	}

	@Test
	@Disabled("Not Implemented")
	void display() 
	{
		System.out.println("Display Method from Third Unit Testing Program class");	
	}


}

package com.Testing;
//Assertion Program
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;


import org.junit.jupiter.api.Test;

public class FourthUnitTestingProgram
{
	@Test
	void AssertEqualsMethod() 
	{
		int arr[]= {1,2,3,4};
		assertAll("arr",()->assertEquals(arr[0],1),//will check the value in zero th index is equal to the index or or not
				()->assertEquals(arr[1],2));
		System.out.println(arr[3]);
	}
	
	@Test
	void AssertTrueMethod() 
	{
		int val1=1,val2=2;
		
		assertAll(()->assertTrue(val1<val2));//will check the value in zero th index is equal to the index or or not
				
	}

	@Test
	void AssertFalseMethod() 
	{
		int val1=1,val2=2;
		assertAll(()->assertFalse(val1>val2));//will check whether the condition is false
	}
	
	@Test
	void AssertNullMethod() 
	{
		String str=null;
		assertAll(()->assertNull(str));//will check the value is null 		
	}
	
	@Test
	void AssertNotNullMethod() 
	{
		String str1="Priyanka";
		assertAll(()->assertNotNull(str1));//will check the value is not null 		
	}
	
	@Test
	void AssertSameMethod() 
	{
		String s1="Abhishek";
		String s2="Abhishek";
		assertAll(()->assertSame(s1,s2));//will check the value is same 		
	}
	
	@Test
	void AssertNotSameMethod() 
	{
		String s1="Priyanka";
		String s2="Abhishek";
		assertAll(()->assertNotSame(s1,s2));//will check the value is not same 		
	}
}

package com.Testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;
import org.junit.jupiter.api.Test;

public class AssumptionProgram 
{
	@Test
	void trueAssumption() 
	{
		System.out.println("True Assumption Method from Assumption Program class");
		assumeTrue(5>1);   //assumeTrue is used to check the assumption is true or not 
		assertEquals(5+2,7); //assumeTrue will make our assumption true
	}
	
	@Test
	void falseAssumption()
	{
		System.out.println("False Assumption method from Assumption Program class");
		assumeFalse(5>7);   //assumeFalse will make our assumption false 
		assertEquals(5+2,7);
	}
	
	@Test
	void AssumeThat()
	{
		System.out.println("AssumeThat method from Assumption Program class");
		String str="Priyanka";
		assumingThat(str.equals("Priyanka"),
				()->assertEquals(10+3,13)); //assumingThat will evaluate the lambda executable only if given assumption is true 
	}
}

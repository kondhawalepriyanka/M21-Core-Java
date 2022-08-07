package com.streamoperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
//Reduce Function Program
public class ReduceOperation 
{
	public static void main(String[] args)
	{
		List<Integer>I=Arrays.asList(new Integer[]{11,8,2,3,14,5});
		Optional<Integer>o=I.stream().filter((i)->i>5).reduce((a,b)->a>b?a:b);
		if(o.isPresent())
		{
			System.out.println("Result: "+o.get());
		}
	}
}

package com.streamoperations;

import java.util.Arrays;
import java.util.List;

public class FilterOperation 
{

	public static void main(String[] args) 
	{
		List<Float>l=Arrays.asList(15.5f,5.6f,3.6f,18.3f);
		System.out.println(l);
		l.stream().filter(i->i>11.9f).forEach(System.out::println);

	}

}

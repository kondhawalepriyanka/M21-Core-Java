package com.streamoperations;

import java.util.Arrays;
import java.util.List;

public class StreamOperation {

	public static void main(String[] args) 
	{
		List<Integer>l=Arrays.asList(12,56,33);
		//distinct:it takes distinct values
		System.out.println(l);
		l.stream().distinct().forEach(System.out::println);
	}

}

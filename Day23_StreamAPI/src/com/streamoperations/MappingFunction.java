package com.streamoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingFunction {

	public static void main(String[] args) {
		List<String>l=Arrays.asList(new String[]{"Siddhi","Vaibhav","Abhishek","Priyanka"});
		System.out.println("Word length for object Strings");
		l.stream().map(String::length).forEach(i->System.out.print(i+" "));
		System.out.println();
		List<Integer>I=Arrays.asList(new Integer[]{1,2,3,4,5});
		List<Integer>obj=I.stream().map(i->i*i).collect(Collectors.toList());
		obj.forEach(i->System.out.print(i+" "));
	}

}

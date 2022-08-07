package com.streamoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStream {

	public static void main(String[] args) {
		//stream can be created with static data
		Stream<String>obj=Stream.of("Priyanka","Vaibhav","Siddhi");
		obj.forEach((i)->System.out.println(i));
		List<String>l=Arrays.asList(new String[]{"Mumbai","Pune","Junnar","Nashik"});
		obj=l.stream();
		//obj.forEach((a)->System.out.print(a));
		obj.forEach(System.out::println);

	}

}

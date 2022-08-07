package com.streamoperations;

import java.util.LinkedList;

public class CollectionLambda {

	public static void main(String[] args) {
		LinkedList<Integer>l=new LinkedList<>();
		l.add(11);
		l.add(12);
		l.add(13);
		System.out.println(l);
		l.forEach(System.out::println);
	}

}

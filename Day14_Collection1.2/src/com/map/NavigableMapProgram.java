package com.map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapProgram {

	public static void main(String[] args) {
		NavigableMap<Integer,String> n=new TreeMap<Integer,String>();
		n.put(11, "Siddhi");
		n.put(12, "Atharva");
		n.put(13, "Vedant");
		n.put(14, "Priyanka");
		System.out.println(n);
		System.out.println(n.firstEntry());
		System.out.println(n.lastEntry());
		System.out.println(n.lastKey());
		System.out.println(n.firstKey());
	}

}

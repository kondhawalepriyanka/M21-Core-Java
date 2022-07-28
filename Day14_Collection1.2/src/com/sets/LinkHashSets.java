package com.sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHashSets {

	public static void main(String[] args) {

		Set<Object>obj=new LinkedHashSet<Object>();
		//Hash set/set is unordered set and linked hash set is order set
		obj.add(10);
		obj.add("Priyanka");
		obj.add(25.8);
		obj.add(18);
		obj.add(null);
		System.out.println(obj);


	}

}

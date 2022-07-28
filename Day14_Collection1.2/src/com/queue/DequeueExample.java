package com.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueExample {

	public static void main(String[] args) {
		Deque<Object>obj=new ArrayDeque<Object>();
		obj.add(11);
		obj.addFirst(13);//adding the element from front side
		obj.addLast(7);//adding the element from rear side
		obj.addLast("Priyanka");
		System.out.println(obj);
		
		obj.removeFirst();
		System.out.println(obj);


	}

}

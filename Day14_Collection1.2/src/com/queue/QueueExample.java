package com.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Object>obj=new ArrayDeque<Object>();
		obj.offer(11);
		obj.add(12);
		obj.add(10);
		System.out.println(obj);
		System.out.println(obj.peek());
		//PriorityQueue will print the element using Priority of the elements
		Queue<Object>o=new PriorityQueue<>();
		o.add(18);
		o.add(22);
		System.out.println(o);
		System.out.println(o.peek());
	}

}

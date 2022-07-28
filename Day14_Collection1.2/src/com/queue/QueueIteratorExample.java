package com.queue;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class QueueIteratorExample {

	public static void main(String[] args) {
		
		Queue<Integer>obj=new ArrayDeque<Integer>();
		for(int i=5;i<10;i++)
		{
			obj.add(i);
		}
		System.out.println(obj);
		obj.add(16);
		boolean isAdded=obj.offer(25);
		System.out.println(obj);
		System.out.println("Is added:"+isAdded);
		//Iterator=to return single-single elements separately
		Iterator<Integer> i=obj.iterator();
		System.out.println("The Elements are: ");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}

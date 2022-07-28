package com.vector;

import java.util.ArrayList;
import java.util.Vector;

public class VectorClass 
{
	public static void main(String[] args) 
	{
		Vector<Object> v=new Vector<Object>();
		
		//v.add(null);
		//v.add(2);
		//v.add('A');
		v.add(0,"Priyanka");
		v.add(1,"Abhishek");
		v.add(2,"Siddhi");
		System.out.println(v);
		
		ArrayList<Object> a=new ArrayList<Object>();
		a.addAll(v);  //coping all elements of vector in array list using add method
		System.out.println(a);
	}

}

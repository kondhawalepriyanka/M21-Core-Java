package com.arraylist;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class ArrayListProgramUsingForLoop {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		List<Integer>obj=new ArrayList<>();
		
		for(int i=0;i<5;i++)
		{
			 i=s.nextInt();	
			 obj.add(i);
		}
		System.out.println(obj);	
			
	}

}

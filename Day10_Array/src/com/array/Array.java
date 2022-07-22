package com.array;

public class Array {

	public static void main(String[] args) {
		int a[]= {11,22,33,44,55};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//enhance for loop
		for(int x:a)
		{
			System.out.print(x+" ");
		}

	}

}

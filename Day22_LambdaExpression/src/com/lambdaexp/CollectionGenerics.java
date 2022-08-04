package com.lambdaexp;
import java.util.LinkedList;
public class CollectionGenerics 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer>obj=new LinkedList<>();
		obj.add(11);
		obj.add(13);
		obj.add(14);
		System.out.println(obj);
		//lambda Expression
		obj.forEach((i)->
		{
			System.out.println(i);
		});
	}
}

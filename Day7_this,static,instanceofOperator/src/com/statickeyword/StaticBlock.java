package com.statickeyword;

public class StaticBlock {

	static int num;
	static String str;
	static  //Static Block
	{
		num=15;
		str="Priyanka";
	}
	StaticBlock()
	{
		num=15;
		str="Abhishek";
	}
	public static void main(String[] args)
	{
		StaticBlock s=new StaticBlock();
		System.out.println(num);
		System.out.println(str);
	}

}

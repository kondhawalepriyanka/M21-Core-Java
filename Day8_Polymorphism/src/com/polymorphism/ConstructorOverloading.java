package com.polymorphism;
// Program on constructor overloading
class Trees
{
	String s="Apple Tree";
	Trees()
	{
		System.out.println("Mango tree");
	}
	Trees(String s)
	{
		this.s=s;
		System.out.println(s);
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		Trees t=new Trees();
		Trees t1=new Trees("Orange");

	}

}

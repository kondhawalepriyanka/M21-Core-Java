package com.thisKeyword;
class A
{
	public int a=5;
	A()
	{
		this.a=a;
	}
}
public class ConstructorWithoutPassingArgument {

	public static void main(String[] args) {
		A a=new A();
		System.out.println("Value is:"+a.a);
	}

}

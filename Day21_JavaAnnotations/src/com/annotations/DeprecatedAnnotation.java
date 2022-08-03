package com.annotations;

class A
{
	//It allows any elements no longer to be used
	@Deprecated
	public void print()
	{
		System.out.print("Deprecated Annotation");
	}
}
public class DeprecatedAnnotation {

	public static void main(String[] args) 
	{
		A a=new A();
		a.print();

	}

}

package com.thisKeyword;
//this keyword can be passes as an argument in method call
class B
{
	void print(B b)
	{
		System.out.println("Function 1 is invoked");
	}

	void display()
	{
		print(this);
	}
}
public class MethodCall {

	public static void main(String[] args) {
		B b=new B();
		b.display();

	}

}

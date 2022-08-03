package com.annotations;
//Custom annotation
//We cannot define method because custom annotation contains abstract method
@interface MyAnnotation
{
	//abstract method
	String print();
}
class B
{
	@MyAnnotation (print="Hello")
	public void display()
	{
		System.out.println("From User defined Annotaion");
	}
}
public class CustomAnnotation 
{
	public static void main(String[] args) 
	{
		B b=new B();
		b.display();
	}

}

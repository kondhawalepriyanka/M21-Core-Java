package com.annotations;

//if we need to inherit an annotation from super class then go with inherited annotation
import java.lang.annotation.*;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)

@Inherited
@interface cust
{
	int print();
}
@cust(print=3)
class CustA
{
	void display()
	{
		System.out.println("Inherited Annotation");
	}
}
class child extends CustA
{
	void display1()
	{
		System.out.println("Child Class Inherited Annotation");
	}
}
public class InheritedAnnotation
{

	public static void main(String[] args) throws NoSuchMethodException, SecurityException
	{
		child c=new child();
		c.display();
		c.display1();
		Method m=c.getClass().getMethod("display1");
		cust obj=m.getAnnotation(cust.class);
		System.out.println(obj.print());

	}

}

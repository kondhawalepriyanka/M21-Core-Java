package com.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented

@interface CustB
{
	int print();	
}

class ChildB
{
	@CustB(print=3)
	public void display1()
	{
		System.out.println("Documented Annotation");
	}
}

public class DocumentedAnnotation 
{
	public static void main(String[] args) throws NoSuchMethodException, SecurityException
	{
		ChildB b=new ChildB();
		b.display1();
		Method m=b.getClass().getMethod("display1");
		CustB obj1=m.getAnnotation(CustB.class);
		System.out.println(obj1.print());

	}

}
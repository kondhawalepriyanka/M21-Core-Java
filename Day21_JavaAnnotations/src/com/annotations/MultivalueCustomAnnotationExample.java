package com.annotations;
import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Custom
{
	//abstract method
	String print()default "Priyanka";
	int speed() default 5;
	float percentage() default 8.4f;
}
class B1
{
	@Custom (print="Hello",speed=50,percentage=9.4f)
	public void display()
	{
		System.out.println("From User defined Annotaion");
	}

	
}
public class MultivalueCustomAnnotationExample
{

	public static void main(String[] args) throws Exception 
	{
		B1 b=new B1();
		b.display();
		Method m1=b.getClass().getMethod("display");
		Custom c=m1.getAnnotation(Custom.class);
		System.out.println(c.print());
		System.out.println(c.speed());
		System.out.println(c.percentage());

	}

}

package com.annotations;
import java.lang.annotation.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

//custom Annotation
@interface MyAnnotation2
{
	//abstract method
	int accept();
	float percentage() default 8.4f;
}
class newClass
{
	@MyAnnotation2(accept=35)
	public void display()
	{
		System.out.println("Hey");
	}
}
public class CustAnnotation {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException 
	{
		newClass n=new newClass();
		Method m=n.getClass().getMethod("display");
		MyAnnotation2 o=m.getAnnotation(MyAnnotation2.class);
		System.out.println(o.accept());
		n.display();
	}

}

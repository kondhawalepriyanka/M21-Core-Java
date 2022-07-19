package com.InstatnceofOperator;

class A
{
	
}
public class ChildInstance extends A{

	public static void main(String[] args) {
		ChildInstance c=new ChildInstance();
		System.out.println(c instanceof A);
		System.out.println(c instanceof ChildInstance);
	}

}

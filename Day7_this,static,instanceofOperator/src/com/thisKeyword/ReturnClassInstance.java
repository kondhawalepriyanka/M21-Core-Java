package com.thisKeyword;

class ClassInstance
{
	int a=10;
	int ret()
	{
		return this.a=a;
	}
}
public class ReturnClassInstance {

	public static void main(String[] args) {
		ClassInstance c=new ClassInstance();
		System.out.print(c.ret());
		}

}

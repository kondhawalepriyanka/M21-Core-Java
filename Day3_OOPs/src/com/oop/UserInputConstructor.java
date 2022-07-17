package com.oop;
import java.util.Scanner;

class C
{
	public
	String name,name1;
	int roll,roll1;
	
	C(String name,int roll)
	{
		 name1=name;
		 roll1=roll;
	}
	void display()
	{
		 System.out.println(name1+"  "+roll1);
	}
}
public class UserInputConstructor {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=s.nextLine();
		System.out.println("Enter Roll No:");
		int roll=s.nextInt();
		C c1 = new C(name,roll);
		c1.display();
		
		s.close();
	}
	

}

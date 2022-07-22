package com.array;

class student
{
	public int Roll;
	public String Name;
	//constructor to initialize the value
	student(int roll,String name)
	{
		Roll=roll;
		Name=name;
	}
}
public class NonPrimitiveArray 
{
	public static void main(String[] args) 
	{
		//declare array of class type
		student a[]=new student[3];
		a[0]=new student(01,"Afreen");
		a[1]=new student(02,"Priyanka");
		a[2]=new student(03,"Sushma");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Student at "+i+" index is "+a[i].Roll+" "+a[i].Name);
		}
	}
}

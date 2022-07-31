package com.multithreading;
class FirstClass
{
	void print(int num)
	{
		synchronized(this) //synchronized block
		{
			for(int i=1;i<4;i++)
			{
				System.out.println(num*i);
				try
				{
					Thread.sleep(3);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
	}
}
class SecondClass extends Thread
{
	FirstClass o;
	SecondClass(FirstClass o)
	{
		this.o=o;
	}
	public void run()
	{
		o.print(30);
	}
	
	
}
public class SynchronizedBlockProgram 
{

	public static void main(String[] args)
	{
		FirstClass f=new FirstClass();
		SecondClass s1=new SecondClass(f);
		SecondClass s2=new SecondClass(f);
		s1.start();
		s2.start();		
	}
}

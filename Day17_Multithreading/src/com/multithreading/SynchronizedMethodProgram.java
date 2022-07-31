package com.multithreading;

class counter
{
	int count;
	public synchronized void increment()
	{
		count++;
	}
}
public class SynchronizedMethodProgram {

	public static void main(String[] args) throws Exception
	{
		counter c=new counter();
		Thread t1=new Thread()
		{
			public void run()
			{
				for(int i=1;i<=1000;i++)
				{
					c.increment();
				}
			}
		};
		Thread t2=new Thread()
		{
			public void run()
			{
				for(int i=1;i<=1000;i++)
				{
					c.increment();
				}
			}
		};
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c.count);
	}
	

}

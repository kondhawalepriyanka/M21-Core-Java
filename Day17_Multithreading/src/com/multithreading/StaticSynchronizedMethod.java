package com.multithreading;

class Testing
{
	public static synchronized void display()
	{
		System.out.println("Current thread " + Thread.currentThread().getName());
		for(int i = 0; i < 5 ; i++)
		{
			System.out.println(Thread.currentThread().getName() + "i - " +i);
			try
			{
				Thread.sleep(50);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

class Valueof implements Runnable
{
	Thread t;
	Testing val;
	
	Valueof(Testing val)
	{
		this.val = val;
		t = new Thread(this);
		t.start();
	}
	public void run()
	{
		val.display();
	}

}

public class StaticSynchronizedMethod
{
	public static void main(String[] args) 
	{
		Testing obj1 = new Testing();
		Testing obj2 = new Testing();
		Valueof t1 = new Valueof(obj1);
		Valueof t2 = new Valueof(obj2);
	}

}

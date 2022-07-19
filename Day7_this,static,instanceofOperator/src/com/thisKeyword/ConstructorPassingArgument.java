package com.thisKeyword;

class Arg
{
		int a,b;
  public void setdata(int a,int b)
  {
			this.a = a;			
			this.b = b;
  }

public void getdata()
{
	System.out.println("Value of A = "+a);
	System.out.println("Value of B = "+b);

}

}

public class ConstructorPassingArgument{

public static void main(String args[])
{
	Arg obj = new Arg();
	obj.setdata(4,9);
	obj.getdata();
}
}
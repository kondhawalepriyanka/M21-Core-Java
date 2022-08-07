package com.enumeration;
enum Bike
{
	Pulser,KTM,R15,R3,Honda;
}
public class EnumerationExample3 
{
	public static void main(String[] args) 
	{
	
		Bike b=Bike.KTM;
	
		switch(b)
		{
			case Pulser:
					System.out.println("You Choose Pulser");
					break;
			case KTM:
					System.out.println("You Choose KTM");
					break;
			case R15:
					System.out.println("You Choose R15");
					break;
					default:
						System.out.println("Invalid Data");
		}
	
	}

}

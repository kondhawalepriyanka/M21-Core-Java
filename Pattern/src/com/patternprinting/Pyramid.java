package com.patternprinting;

public class Pyramid {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<=n;i++)
		{
			System.out.print("   ");
			for(int j=0;j<i;j++)
			{
				
				System.out.print("   ");
				if(i%2==0 || j%i==2)
				{
					
					System.out.print(" ");
				}
				System.out.print("@");

			
					
					
			}
			System.out.println();
		}

				

	}

}

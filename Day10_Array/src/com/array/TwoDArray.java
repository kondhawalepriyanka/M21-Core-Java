package com.array;

import java.util.Scanner;

/*class user
{
	void 
}*/
public class TwoDArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the outside Array:");
		int m=s.nextInt();
		System.out.println("Enter the inside Array:");
		int n=s.nextInt();
		
		int a[][]= new int[m][n];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print("Enter "+i+"  "+j+" value:");
				a[i][j]=s.nextInt();
			}		
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print("  ");
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"  ");
			}		
		}
		
		}

}

package com.operator;

import java.util.Scanner;

public class logicaloperator {

	public static void main(String[] args) {
		
		
			Scanner s=new Scanner(System.in);
			System.out.println("Enter value a:");
			int a=s.nextInt();
			System.out.println("Enter value b:");
			int b=s.nextInt();
			
			//for a<b && b<8?
			System.out.println(a+"<"+b+" AND "+b+"<8");
			boolean res1=a<b && b<8;
			System.out.println(res1);
			
			//for a<b || b<8?
			System.out.println(a+"<"+b+" OR "+b+"<8");
			boolean res2=a<b || b<8;
			System.out.println(res2);
			
			//for !(a<b)?
			System.out.println("!("+a+"<"+b+")");
			boolean res3=!(a<b);
			System.out.println(res3);
			
			s.close();
	}

}

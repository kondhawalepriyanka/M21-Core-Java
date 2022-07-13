package com.operator;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value a:");
		int a=s.nextInt();
		System.out.println("Enter value b:");
		int b=s.nextInt();
		
		//for a=b
		System.out.println(a=b);
		
		//for a+=b
		System.out.println(a+=b);
		
		//for a-=b?
		System.out.println(a-=b);
		
		//for a*=b?
		System.out.println(a*=b);
		
		//for a/=b?
		System.out.println(a/=b);
	
		
		//for a%=b?
		System.out.println(a%=b);
		
		
		s.close();
		

	}

}

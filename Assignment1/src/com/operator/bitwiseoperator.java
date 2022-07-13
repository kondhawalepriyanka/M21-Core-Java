package com.operator;
import java.util.Scanner;

public class bitwiseoperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value a:");
		int a=s.nextInt();
		System.out.println("Enter value b:");
		int b=s.nextInt();
		
		//for a&b
		int res1=a&b;
		System.out.println(res1);
		
		//for a|b
		int res2=a|b;
		System.out.println(res2);
		
		//for a^b
		int res3=a^b;
		System.out.println(res3);
		
		//for a>>b
		int res4=a>>b;
		System.out.println(res4);
		
		//for a<<b
		int res5=a<<b;
		System.out.println(res5);
			
		s.close();
		

	}

}

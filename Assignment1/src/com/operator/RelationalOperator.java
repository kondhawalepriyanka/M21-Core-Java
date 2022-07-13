package com.operator;
import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value a:");
		int a=s.nextInt();
		System.out.println("Enter value b:");
		int b=s.nextInt();
		
		//for a>b?
		System.out.println(a+">"+b+"?");
		boolean res=a>b;
		System.out.println(res);
		
		//for a<b?
		System.out.println(a+"<"+b+"?");
		boolean res1=a<b;
		System.out.println(res1);
		
		//for a>=b?
		System.out.println(a+">="+b+"?");
		boolean res2=a>=b;
		System.out.println(res2);
		
		//for a<=b?
		System.out.println(a+"<="+b+"?");
		boolean res3=a<=b;
		System.out.println(res3);
		
		//for a!=b?
		System.out.println(a+"!="+b+"?");
		boolean res4=a!=b;
		System.out.println(res4);
		
		//for a==b?
		System.out.println(a+"=="+b+"?");
		boolean res5=a==b;
		System.out.println(res5);
		
		s.close();

		
	}

}

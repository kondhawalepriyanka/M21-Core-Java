package com.day2program;

import java.util.Scanner;

public class Day2_program {

	public static void main(String[] args) {
		
		System.out.println("Enter value a:");

		Scanner a1=new Scanner(System.in);
		int a=a1.nextInt();
		System.out.println("Enter value b:");
		
		Scanner b1=new Scanner(System.in);
		int b=b1.nextInt();
		float sum=a+b;
		System.out.println("Sum is:"+sum);
		

	}

}

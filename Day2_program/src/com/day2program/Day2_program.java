package com.day2program;

import java.util.Scanner;

public class Day2_program {

	public static void main(String[] args) {
		
		System.out.println("Enter value a:");

		Scanner s=new Scanner(System.in);
		int a1=s.nextInt();
		System.out.println("Enter value b:");
		
		int b1=s.nextInt();
		float sum=a1+b1;
		System.out.println("Sum is:"+sum);
		s.close();
	

	}

}

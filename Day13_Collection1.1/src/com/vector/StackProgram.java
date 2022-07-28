package com.vector;

import java.util.Stack;

public class StackProgram {

	public static void main(String[] args) 
	{
		Stack<Object> s=new Stack<Object>();
		s.push(11); //Pushing elements in the stack
		s.push(12);
		s.push(13);
		System.out.println(s);
		
		//poping the top element from the stack
		s.pop();
		System.out.println(s);
	}

}

package com.enumeration;

public class Enum_Example5
{
	enum EmpType
	{
		ContractBased,Permanent,Temporary;
	}
	static void print(EmpType e)
	{
		if(e==EmpType.Permanent)
		{
			System.out.println("Permanent Employee");
		}
		else if(e==EmpType.ContractBased)
		{
			System.out.println("Contract-Based Employee");
		}
		else
		{
			System.out.println("Temporary Employee");
		}
	}

	public static void main(String[] args) 
	{
		EmpType e=EmpType.ContractBased;
		print(e);

	}

}

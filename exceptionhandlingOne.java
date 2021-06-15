package com.study.exceptionhandling;

public class exceptionhandlingOne {
	public static void main(String []args)
	{
		int a=10,b=0,c;
		//No exception
		try {//also called as exception statement
			c=a/2;
		}
		catch(ArithmeticException e)//also called as debugging code
		{
			System.out.println("Arithematic exception handled");
		}
		finally {//also called as "clean up code"
			System.out.println("defaultly finally block executes");
		}
		System.out.println("-------------------------------------------------");
		//With exception
		try {
			c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithematic exception handled");
		}
		finally {
			System.out.println("defaultly finally block executes");
		}
	}
}

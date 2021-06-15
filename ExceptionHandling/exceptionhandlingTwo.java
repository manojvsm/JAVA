package com.study.exceptionhandling;

public class exceptionhandlingTwo {
	public static void main(String []args)
	{
		int x,a=7;
		try
		{
			x=10/2;
			System.out.println(x);
			x=8/4;
			System.out.println(x);
			x=6/0;
			System.out.println(x);
			x=6/2;//Donot display on this line because above line has an exception
			System.out.println(x);
		}
		catch(ArithmeticException e){
			System.out.println("Exception handled");
		}
		finally {
			System.out.println("default executes");
		}
		System.out.println("outside of try catch block");
		System.out.println("-----------------------------------");
		try
		{
			x=10/2;
			System.out.println(x);
			x=8/4;
			System.out.println(x);
			x=6/0;
			System.out.println(x);
			x=6/2;//Do not display on this line because above line has an exception
			System.out.println(x);
		}
		catch(NullPointerException e){//catch not match 
			System.out.println("Exception handled");
		}
		finally {//finally default execution
			System.out.println("default executes");
		}
		//abnormal termination
		System.out.println("outside of try catch block");
	}
}

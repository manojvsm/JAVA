package com.study.exceptionhandling;

public class exceptionhandlingThree {
	int ivalue=10;
	void display() {
		System.out.println("dispalay method");
	}
	public static void main(String[] args) {
		System.out.println("main starts");
		int first=10,second=2,result=0;
		exceptionhandlingThree ref=null;//null
		try {
			System.out.println(ref.ivalue);
			ref.display();
			result=first/second;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			String str=e.getMessage();
			System.out.println(str);
			System.out.println("arithmetic exception handled");
		}
		catch(NullPointerException e) {
			e.printStackTrace();
			String str=e.getMessage();
			System.out.println(str);
			System.out.println("NullPointer exception handled");
		}
		System.out.println("Arithmetic result : "+result);
		System.out.println("main ends");
	}
}

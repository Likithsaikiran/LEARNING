package com.kodnest.nif;

public class NestedIf {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		if(b>a)
		{
			System.out.println("b is greater than a");
		
		if(a>0) {
			System.out.println("a is positive");
		}
		else {
			System.out.println("a is negative");
		}
		}
		else
		
		{
			System.out.println("a is greater than b");
		}

	}

}

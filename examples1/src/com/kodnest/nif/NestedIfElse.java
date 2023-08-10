package com.kodnest.nif;

public class NestedIfElse {

	public static void main(String[] args) {
		int a=20;
		int b=10;
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
		if(b<0) {
			System.out.println("b is negative");
		}
		else {
			System.out.println("b is positive");
		}
			
		}



	}

}

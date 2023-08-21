package com.kodnest.methodOverloadingCalculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in); 
System.out.println("enter the first number");
int num1=scan.nextInt();
System.out.println(" enter the second number");
int num2=scan.nextInt();
System.out.println("Enter the operator (+, -, *, /):");
char operator=scan.next().charAt(0);
int result=calculator( num1, num2, operator);
System.out.println("result"+result);


	}
	public static int calculator(int num1,int num2,char operator) {
		int result=0;
		
		switch(operator) {
		case '+':
			   result=num1+num2;
			break;
		
		case '-':
			 result=num1-num2;
			break;
		
		case '*':
			 result=num1*num2;
			break;
		
		case '/':
			if(num2>0) {
			 result=num1/num2;
			}
			 else {
				 System.out.println("error");
			 }
			 break;
		}
		return result;
		
	}

}

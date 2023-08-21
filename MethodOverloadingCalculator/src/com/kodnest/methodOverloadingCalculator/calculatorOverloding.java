package com.kodnest.methodOverloadingCalculator;

import java.util.Scanner;

public class calculatorOverloding {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		System.out.println("enter the first number");
		int num1=scan.nextInt();
		System.out.println(" enter the second number");
		int num2=scan.nextInt();
		System.out.println("Enter the operator (+, -, *, /):");
		char operator=scan.next().charAt(0);
		int result=0;
		switch(operator) {
		case '+':
			result=calculator( num1, num2);
			break;
		case '-':
			result=calculator( num1, num2);
			break;
		case '*':
			result=calculator( num1, num2);
			break;
		case '/':
			result=calculator( num1, num2);
			break;
			default:
				System.out.println(" error");
		}
		System.out.println("result:"+" "+result);
		

	}
	public static int calculator(int num1,int num2){
		return num1+num2;
	}
	public static int calculator(int num1,int num2,char operator){
		return num1-num2;
	}
	public static int calculator(int num1,char operator,int num2){
		return num1*num2;
	}
	public static int calculator(char operator,int num1,int num2){
		if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
	}

}

package com.kodnest.CalculatorDilemma;

import java.util.Scanner;

public class CalculatorDilemma {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" enter two numbers");
		int num1=scan.nextInt();
		 int num2=scan.nextInt();
		 System.out.println(" enter operation");
		 int num=scan.nextInt();
		 
		 switch(num) {

		 case 1:
		 {
			 System.out.println("addition"+" "+(num1+num2));
		      break;
		 }
	case 2:
	{
		 System.out.println("Subtraction"+" "+(num1-num2));
		 break;
		 
	}
	case 3:
	{
		 System.out.println("multiplication"+" "+(num1*num2));
		 break;
	}
	case 4:
	{
		 System.out.println("division qutioent"+" "+(num1/num2));
		 break;
	}
	case 5:
	{
		 System.out.println("division remainder"+" "+(num1%num2));
		 break;
	}
		
		
		
	}
		 
		 
		 
		

	}

}

package com.kodnest.LogicalOperatorValidator;

import java.util.Scanner;

public class LogicalOperatorValidator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" Is input valid (true/false)");
		boolean s1=scan.nextBoolean();
		System.out.println("does input meet a certain condition (true/false)");
		boolean s2=scan.nextBoolean();
		 boolean s=OperatorValidator.isValidInput(s1,s2);
		 System.out.println(s);
		 if(s=true) {
			 System.out.println(" input is valid");
		 }
		 else {
			 System.out.println(" input is invalid");
		 }

	}

}

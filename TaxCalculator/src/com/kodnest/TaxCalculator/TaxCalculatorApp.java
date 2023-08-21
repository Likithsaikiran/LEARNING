package com.kodnest.TaxCalculator;
import java.util.Scanner;

public class TaxCalculatorApp {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println(" enter the purchase amount");
		double p=scan.nextDouble();
		System.out.println(" enter the tax rate (in decimal form)");
		double t=scan.nextDouble();
		System.out.println(" total cost including tax");
	System.out.println(	TaxCalculator.calculateTotalWithTax(p,t));

	}

}

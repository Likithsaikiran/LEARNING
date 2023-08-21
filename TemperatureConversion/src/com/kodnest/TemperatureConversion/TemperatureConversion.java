package com.kodnest.TemperatureConversion;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
System.out.println("Welcome to the Temperature Conversion Tool!");
System.out.println("Select an option:");
System.out.println(" 1.Convert Celsius to Fahrenheit");
System.out.println("2.Convert Fahrenheit to Celsius");
System.out.println(" enter your choice");
 int num=scan.nextInt();
 
 switch(num) {
 case 1:{
	  System.out.println("Enter temperature in celsius");
	  double f=scan.nextDouble();
	  System.out.println(CelsiusToFahrenheit.celsiusToFahrenheit(f));
	  break;
 }
 case 2:{
	  System.out.println(" enter temperature in Fahrenheit");
	  double c=scan.nextDouble();
	  System.out.println(FahrenheitToCelsius.fahrenheitToCelsius(c));
	  break;
 }
 }
   
   

	}

}

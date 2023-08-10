package TemperatureConvertor;

import java.util.Scanner;

public class TemperatureConvertorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println( "convert temperatures from Fahrenheit to Celsius");
		double F=scan.nextDouble();
		 TemperatureConvertor temperatureConverter = new TemperatureConvertor(); 
		double temp =temperatureConverter.convertFahrenheitToCelsius(F);
		System.out.println(temp);

	}

}

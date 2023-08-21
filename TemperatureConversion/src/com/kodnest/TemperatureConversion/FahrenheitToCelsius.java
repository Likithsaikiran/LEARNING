package com.kodnest.TemperatureConversion;

public class FahrenheitToCelsius {
public static double fahrenheitToCelsius(double fahrenheit) {
	double Celsius = (fahrenheit - 32) * 5/9;
	return Celsius;
}
}

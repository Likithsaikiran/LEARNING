package com.kodnest.TaxCalculator;

public class TaxCalculator {
	public static double calculateTotalWithTax(double purchaseamount,double taxrate) {
		 double taxamount=purchaseamount*taxrate;
		 double totalcost=taxamount+purchaseamount;
		return totalcost;
	}

}

package JourneyCalculator;

import java.util.Scanner;

public class JourneyDemo {

	public static void main(String[] args) {
  Scanner scan=new Scanner(System.in);
  System.out.println("enter the speed and time");
  double speed=scan.nextDouble();
  double time=scan.nextDouble();
  JourneyalCulculator s1=new JourneyalCulculator();
    double dis=s1.calculateDistance( speed,  time);
    System.out.println(dis);
   
  
	}
		 
		 
		} 



package examples1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int marks=scan.nextInt();
		System.out.println("welcome to kodnest");
		checkTheEligiblity(marks);
		 
		
		
	}
	public static void checkTheEligiblity(int marks) {
		if(marks>=80)
		{
			System.out.println("welcome to Tech Club");
		}
		
	}

}

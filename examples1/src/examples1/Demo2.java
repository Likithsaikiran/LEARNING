package examples1;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int marks=scan.nextInt();
		MarksApp s1= new MarksApp();
		 s1.Marks(marks);
		

	}

}

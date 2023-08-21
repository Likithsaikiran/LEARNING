package com.kodnest.cc;

import java.util.Scanner;

public class Main {
	public static void identifyPolygon(int sides)
	{ 
		switch(sides)
		{
		case 1:{
			System.out.println("Line");
			break;
		}
		case 2:{
			System.out.println("Lines");
			break;
		}
		case 3:{
			System.out.println("triangle");
			break;
		}
		case 4:{
			System.out.println("Quadrilateral");
			break;
		}
		case 5:{
			System.out.println("pentagon");
			break;
		}
		case 6:{
			System.out.println("Hexagon");
			break;
		}
		default:
		System.out.println("polygon");
			
		
		}
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int sides=scan.nextInt();
		identifyPolygon( sides);
		
		

	}

}

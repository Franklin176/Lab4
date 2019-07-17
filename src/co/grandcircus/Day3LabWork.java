package co.grandcircus;

import java.util.Scanner;

public class Day3LabWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		
		String run = "yes";
		
		while (run.equalsIgnoreCase("yes")) {
		System.out.println("Hi, enter a whole number between 1 and 10");
		int input = scan.nextInt();
		
		System.out.println();
		System.out.println("Numbers 1 through " + input + " Squared and Cubed");
		for (int i = 1; i <= input; i++) {
			System.out.print(i +" ");
			System.out.print(i*i +" ");
			System.out.println(i*i*i);
		}
		System.out.println();
		
//		System.out.println("Numbers 1 through " + input + " Squared!");
//		for (int i = 1; i <= input; i++) {
//			
//			System.out.println(i*i);
//		}
//		
//		System.out.println();
//		System.out.println("Numbers 1 through " + input + " Cubed!");
//		for (int i = 1; i <= input; i++) {
//			
//			System.out.println(i*i*i);
//		}
		
		
		System.out.println("Would you like to keep going, Yes or No");
		run = scan.next();
		
		
		}
		System.out.println("Thanks for participating!");
		scan.close();
		}
	}
	
	


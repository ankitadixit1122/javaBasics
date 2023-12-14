package com.returnship.training;

import java.util.Scanner;

public class LuckyNumber {
	public static void main(String[] args) {
		int luckyNumber =4;
	
		System.out.println("Welcome to Number Guessing Game");
		
				for (int i = 2 ; i >= 0; i--) {
					System.out.println("Enter a number :");
					Scanner sc =new Scanner(System.in);

					int guessedNumber = sc.nextInt();

					if (guessedNumber == luckyNumber) {
						System.out.println("CONGRATULATIONS!!! YOU GUESSED IT RIGHT !!! ");
						break;
					}
					else {
						System.out.println( i + " more turns");
						
						if (i==0) {
							System.out.println("Try Again Later!!!");
						}						
					}
			}
		}
}

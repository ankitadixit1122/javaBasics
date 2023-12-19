package com.returnship.training.exception;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter 5 integer: ");
            int[] number = new int[10];
            
            for(int i=0;i<5;i++){
				number[i] = scanner.nextInt();
					if (number[i] <= 0) {
						throw new InvalidInputException("Invalid input. Please enter a positive integer.");
				}
            } 
			System.out.println("You enter all positive numbers");

        }catch (InvalidInputException e) {     
        System.out.println("Error: " + e.getMessage());
        
             // Catch any other exception and display a generic error message
        }catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

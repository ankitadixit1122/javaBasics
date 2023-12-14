package com.returnship.training;
import java.util.Scanner;

public class ClassCourse {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Course 3 courses");
		String [] userCourse = new String[3];
		String [] courseAvailable = {"ABC","EFG","HIJ"};
		
		
		for(int i =0; i<3;i++) {
		

		userCourse[i]= sc.next();
		
		}
		
		if (courseAvailable.equals(userCourse)) {
			System.out.println("Availabe course");
		}
		else {
			System.out.println("Not Available");
		}
		
	}
	
}
	

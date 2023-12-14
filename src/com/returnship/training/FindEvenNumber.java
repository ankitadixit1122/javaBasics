package com.returnship.training;

import java.util.Scanner;

public class FindEvenNumber {
	public static void main(String[] args)   
	{  
		//ENTER SIZE OF ARRAY
		int n;
		Scanner sc=new Scanner(System.in);  
		System.out.print("ENTER THE SIZE OF ARRAY: ");  
		n=sc.nextInt();  
		int[] array = new int[n];  
		
		//ENTER ELEMENTS OF ARRAY
		System.out.println("ENTER ELEMENTS OF ARRAY: ");  
		for(int i=1; i<n; i++){  
			array[i]=sc.nextInt();  
		}  
		
		//VALIDATION FOR EVEN
	    for (int i = 0; i <n; i++) {
	    	
	        if (array[i] % 2 == 0) {
	        	System.out.println("EVEN NUMBER FOUND"+array[i]); 
	        }	          
	        else {
	        	System.out.println("EVEN NUMBER NOT FOUND");
	        }
	    }
	    
	}

}

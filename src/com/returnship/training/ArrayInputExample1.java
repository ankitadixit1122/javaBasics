package com.returnship.training;
import java.util.Scanner;


public class ArrayInputExample1 {
	public static void main(String[] args)   
	{  
		int n;
		int j=0;
		//int countLength =0;
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		 
		n=sc.nextInt();  
		
		int[] array = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		  
			array[i]=sc.nextInt();  
		}  
		
		int[] filArray = new int[n]; 
		
	    for (int i = 0; i < array.length; i++) {
	    	
	        if (array[i] % 2 == 0) {
	            filArray[j] = array[i];
	            j++;
	        }	          
	    }

	    System.out.println("Array elements are: ");
	    for (int i=0; i<filArray.length; i++)   
	    {  
	    System.out.println(filArray[i]);  
	    }  

		
	}
}


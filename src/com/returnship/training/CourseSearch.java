package com.returnship.training;

import java.util.Scanner;

public class CourseSearch {
	public static void main(String args[]) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Please enter 5 courses");

		  String[] Courses = new String[5];
		  
		  //ADD 5 COURSES IN ARRAY
		  for(int i=0;i<5;i++)
		  {
			  Courses[i] =  sc.next();
		  }
		  System.out.println("Enter a Course Name");
		  String courseSearch = sc.next();
		  
		  //CHECK IF COURSE EXISTS
		  int counter =0;
		  for(int i=0; i<5; i++) {
			  if(courseSearch.equals((Courses[i])))
			  { 
				 counter++;
			  }
		  }
				 if(counter ==1)
				 System.out.println(courseSearch + " IS FOUND");
				 else
					 System.out.println(courseSearch + " IS NOT FOUND"); 
				 }

}

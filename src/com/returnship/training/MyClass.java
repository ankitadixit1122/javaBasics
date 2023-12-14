package com.returnship.training;

import java.util.Scanner;

public class MyClass {
	

	public static void main(String args[]) {
		System.out.println("Hello World from JAVA!!");
		
		Scanner sc =new Scanner(System.in);
		int value = sc.nextInt();
		
		System.out.println("Input value is: " +value);
		
		
		Employee emp1 = new Employee(101,"ankita",32);
		emp1.setEmpId(101);
		//emp1.empName = "Jacob";
		//emp1.age=32;
		
//		Employee.companyName ="Mars";
//		
//		Employee emp2 = new Employee();
//		emp2.empId =101;
//		emp2.empName = "Jacob";
//		emp2.age=32;
//		
//		emp2 =null;
//		
		System.out.println(emp1.getEmpDetails());
		
	}
	
}


//JDK - JAVA DEVELOPMENT KIT
//JRE - JAVA RUNTIME ENVIRONMENT
//JVM - JAVA VIRTUAL MACHINE
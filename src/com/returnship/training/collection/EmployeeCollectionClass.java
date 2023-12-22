package com.returnship.training.collection;

import java.util.HashSet;
import java.util.Set;

public class EmployeeCollectionClass {
	public static void main(String [] args) {
		
		Set <Employee> employee = new HashSet<>();
		
		employee.add(new Employee("addy", "2018-01-23", 3400,"Developer", 1));
		employee.add(new Employee("John", "2022-01-08", 3000,"Tester", 2));
		employee.add(new Employee("mike", "2018-08-23", 2800,"HR", 23));
		employee.add(new Employee("micheal", "2022-01-08", 3000,"Developer", 4));
		employee.add(new Employee("jess", "2018-06-23", 5000,"Developer", 7));
		employee.add(new Employee("kelly", "2015-01-08", 3000,"HR", 4));
		employee.add(new Employee("ethan", "2018-05-23", 4300,"Tester", 8));
		employee.add(new Employee("moora", "2015-04-08", 6000,"Developer", 5));
		employee.add(new Employee("greg", "2022-01-08", 4300,"HR", 17));
		
		
		for(Employee emp: employee) {
			String department = emp.getDesignation();
			if(department == "Developer") {
				
				Set<Employee> developer = new HashSet<>();
				developer.add(emp);
				System.out.println("Developer  :"+ developer);
			}
			else if(department == "HR") {
				
				Set<Employee> HR = new HashSet<>();
				HR.add(emp);
				System.out.println("HR  :"+ HR);
				
			}
			else if(department == "Tester") {
				Set<Employee> tester = new HashSet<>();
				tester.add(emp);
				System.out.println("Tester  :"+ tester);
			}
			
		}	
		
	}
}

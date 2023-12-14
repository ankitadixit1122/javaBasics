package com.returnship.training;

public class Employee {

	//instance Variables
	private int empId;            //ATTRIBUTRE
	private String empName;
	private int age;
	static String companyName;
	
	public Employee(int empId,String empName ,int age) {
		this.empId = empId;
		this.empName = empName;
		this.age =age;
		
	}
	
	public int getEmpId() {
		return this.empId;
		
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmpDetails(){
		return "Emp-Name: "+empName+" empId: "+empId +" age: "+age;
		
	}
	
	
}

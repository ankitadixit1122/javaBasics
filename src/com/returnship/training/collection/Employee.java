package com.returnship.training.collection;

public class Employee {
	
	private String empName;
	private String joiningDate;
	private int salary;
	private String designation;
	private int deptId;
	
	
	public Employee(String empName, String joiningDate, int salary,String designation, int deptId) {
		super();
		this.empName = empName;
		this.joiningDate = joiningDate;
		this.designation = designation;
		this.salary = salary;
		this.deptId = deptId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getJoiningDate() {
		return joiningDate;
	}


	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getDeptId() {
		return deptId;
	}


	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}


	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", joiningDate=" + joiningDate + ", designation=" + designation
				+ ", salary=" + salary + ", deptId=" + deptId + "]";
	}
	
	

}

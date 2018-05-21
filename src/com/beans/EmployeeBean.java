package com.beans;

public class EmployeeBean {
	
	private int empId;
	private String empName;
	private int salary;
	
	public EmployeeBean() {
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeBean(int empId, String empName, int salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;		
	}
	
	public int getEmpId() {
		return empId;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeBean [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	

} 

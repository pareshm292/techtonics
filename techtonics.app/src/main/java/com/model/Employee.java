package com.model;

public class Employee {

	private String empEmail,empName,password;

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Employee(String empEmail, String empName, String password) {
		super();
		this.empEmail = empEmail;
		this.empName = empName;
		this.password = password;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [empEmail=" + empEmail + ", empName=" + empName + ", password=" + password + "]";
	}
	
	
	
}

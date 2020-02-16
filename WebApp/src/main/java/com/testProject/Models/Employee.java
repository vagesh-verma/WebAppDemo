package com.testProject.Models;

public class Employee {
	private Integer id;
	private String firstName;
	private String lastName;
	private Double salary;
	private String emailID;
	
	public Employee() {
	}
	
	public Employee(Integer id, String firstName, String lastName, Double salary, String emailID) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.emailID = emailID;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
	@Override
	public String toString()
	{
		return "ID : " + id.toString() + " " +
			   "FirstName : " + firstName + " " +
			   "LastName : " + lastName + " " +
			   "Salary : " + salary.toString() + " " +
			   "EmailID : " + emailID ;
	}
}

package com.testProject.Models;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRegister {
	private ArrayList<Employee> employeeList;
	
	public EmployeeRegister()
	{
		this.employeeList = new ArrayList<>();
	}
	
	public Boolean addEmployee(Employee employee)
	{
		Integer id = getEmployeeListSize() + 1;
		employee.setId(id);
		
		this.employeeList.add(employee);
		
		return Boolean.TRUE;
	}
	
	public Employee getEmployeeById( Integer id )
	{
		for(Employee employee: employeeList)
		{
			if(employee.getId().equals(id))
				return employee;
		}
		return new Employee();
	}
	
	public Integer getEmployeeListSize()
	{
		return this.employeeList.size();
	}
	
	public ArrayList<Employee> getAllEmployees()
	{
		return this.employeeList;
	}
}

package com.testProject.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.testProject.Models.Employee;
import com.testProject.Models.EmployeeRegister;

@RestController
@RequestMapping("/employees")
public class WebController {
	
	@Autowired
	private EmployeeRegister employeeRegister; 
	
	@GetMapping("/hi")
	public String index()
	{
		return "Hello,Employee!";
	}
	
	@RequestMapping( path = "/add", method = RequestMethod.POST, consumes = "application/json" )
	public String addEmployee(@RequestBody Employee employee)
	{
		if( employeeRegister.addEmployee(employee) ) {
			return employee.toString() + " added successfully" ;
		}
		else{
			return "Couldn't add record to registry"; 
		}
	}
	
	@RequestMapping( path = "/get/{id}", method = RequestMethod.GET, 
			consumes = "application/json", produces = "application/json" )
	public Employee getEmployeeByID(@PathVariable Integer id)
	{
		return employeeRegister.getEmployeeById(id);
	}
	
	@RequestMapping( path = "/getAll", method = RequestMethod.GET, 
			consumes = "application/json", produces = "application/json" )
	public ArrayList<Employee> getAllEmployees()
	{
		return employeeRegister.getAllEmployees();
	}	
}	

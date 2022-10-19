package com.example.employeeapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeapi.models.Employee;
import com.example.employeeapi.services.EmployeeService;

@RestController
public class EmployeeController {
	EmployeeService employeeService;
	
	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService=employeeService;
	}
	
	@GetMapping("/employees")
	public List<Employee> get() {
		System.out.println("Getting From DB");
		return employeeService.get();
	}
	@CrossOrigin
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee emp) {
		System.out.println("Add Employee");
		return employeeService.addEmployee(emp);
	}
	@PostMapping("/add")
	public List<Employee> add(@RequestBody List<Employee> emp) {
		return employeeService.add(emp);
	}
	@CrossOrigin
	@DeleteMapping("/deleteById")
	public ResponseEntity<Object> deleteById(@RequestParam("userId") String user_id) {
		return ResponseEntity.ok(employeeService.deleteById(user_id));
	}
}

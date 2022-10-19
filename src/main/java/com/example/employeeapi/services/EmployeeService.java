package com.example.employeeapi.services;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreatorFactory;
import org.springframework.stereotype.Service;

import com.example.employeeapi.daos.EmployeeRepository;
import com.example.employeeapi.models.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Object getEmployees() throws Exception {
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		
		FileReader reader=new FileReader("D:\\JsonData\\employee-JSON-data.json");
		JSONParser parser= new JSONParser(reader);
		return parser.parse();
	}
	public List<Employee> get() {
		return employeeRepository.findAll();
	}
	public Employee addEmployee(Employee emp) {
		return employeeRepository.save(emp);
	}
	public List<Employee> add(List<Employee> emps) {
		return employeeRepository.saveAll(emps);
	}
	public String deleteById(String id) {
		if(employeeRepository.existsById(id)) {
			employeeRepository.deleteById(id);
			return "Employee deleted successfully";
		}
		return "Employee not found";
	}
}

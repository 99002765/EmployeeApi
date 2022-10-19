package com.example.employeeapi.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeeapi.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String>{

}

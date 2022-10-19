package com.example.employeeapi.controllers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.employeeapi.models.Employee;
import com.example.employeeapi.services.EmployeeService;

class EmployeeControllerTest {
	EmployeeService employeeService;
	EmployeeController employeeController;
	MockMvc mockMvc;
	@BeforeEach
	void setUp() throws Exception {
		employeeService=Mockito.mock(EmployeeService.class);
		employeeController= new EmployeeController(employeeService);
		mockMvc= MockMvcBuilders.standaloneSetup(employeeController).build();
	}

	@Test
	void testGetEmployees() throws Exception {
		MvcResult res=mockMvc.perform(get("/getFromDB")).andExpect(status().isOk()).andReturn();
		System.out.println("Books: "+res.getResponse().getContentAsString());
		JSONParser parser=new JSONParser(res.getResponse().getContentAsString());
		List<Object> emps=parser.parseArray();
		assertEquals(11,emps.size());
	}

//	@Test
//	void testGet() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testAddEmployee() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testAdd() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testDeleteById() {
//		fail("Not yet implemented");
//	}

}

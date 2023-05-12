package com.angular.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.angular.demo.model.Employee;

@RequestMapping("employee")
@CrossOrigin(origins = { "*" })
public interface User {
	
	@PostMapping("/add")
	ResponseEntity<String> regisUser(@RequestBody Employee employee);
	
	@GetMapping("/get")
	ResponseEntity<List<Employee>> getUsers();
		


}

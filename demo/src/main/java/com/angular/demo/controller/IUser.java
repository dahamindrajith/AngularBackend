package com.angular.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.angular.demo.model.Employee;
import com.angular.demo.service.UserService;

@RestController
public class IUser implements User{
	
	@Autowired UserService userService;
	
	
	@Override
	public ResponseEntity<String> regisUser(Employee employee){
		return new ResponseEntity<>(userService.regisUser(employee),HttpStatus.OK);
	}
	@Override
	public ResponseEntity<List<Employee>> getUsers(){
		return new ResponseEntity<>(userService.getUsers(),HttpStatus.OK);
		
	}

}

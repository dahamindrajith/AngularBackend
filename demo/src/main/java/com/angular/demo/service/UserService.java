package com.angular.demo.service;

import java.util.List;

import com.angular.demo.model.Employee;

public interface UserService {

	String regisUser(Employee employee);

	List<Employee> getUsers();
	
	

}

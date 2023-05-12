package com.angular.demo.dao;

import java.util.List;

import com.angular.demo.model.Employee;

public interface UserDao {

	String regisUser(Employee employee);
	
	List<Employee> getUsers();

}

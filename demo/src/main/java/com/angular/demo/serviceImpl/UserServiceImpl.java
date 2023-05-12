package com.angular.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angular.demo.dao.UserDao;
import com.angular.demo.model.Employee;
import com.angular.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired UserDao userDao;
	
	
	public String regisUser(Employee employee) {
		return userDao.regisUser(employee);
	}
	
	public List<Employee> getUsers(){
		return userDao.getUsers();
	}

}

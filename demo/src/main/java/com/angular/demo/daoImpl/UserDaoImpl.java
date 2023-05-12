package com.angular.demo.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.angular.demo.connection.DBConnection;
import com.angular.demo.dao.UserDao;
import com.angular.demo.model.Employee;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	String rtn = "Faill";

	public String regisUser(Employee employee) {

		try {

			String sql = "INSERT INTO employees(name, email, password, status) VALUES (?,?,?,?)";
			int result = jdbcTemplate.update(sql, employee.getName(), employee.getEmail(), employee.getPassword(), "A");

			System.out.println("No");

			if (result > 0) {

				System.out.println("Inserted");
				rtn = "Success";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return rtn;
	}

	public List<Employee> getUsers() {

		DBConnection conn = new DBConnection();
		Connection connection = conn.getConnection();

		System.out.println("Done");
		List<Employee> userList = new ArrayList();

		try {

			ResultSet rs =connection.createStatement().executeQuery("SELECT name, email FROM employees WHERE status='A'");


			while (rs.next()) {

				Employee employee = new Employee();

				employee.setName(rs.getString(1));
				employee.setEmail(rs.getString(2));
				
				userList.add(employee);

			}


		} catch (Exception e) {
			e.printStackTrace();
		}

		return userList;
	}

}

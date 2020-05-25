package com.example.demo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setEmployeeId(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setAge(rs.getInt(3));
		emp.setSalary(rs.getInt(4));
		return emp;
	}



}

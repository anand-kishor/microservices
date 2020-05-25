package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Employee;

@Repository
public class EmployeeRepository {
	@Autowired
	private JdbcTemplate template;
	@Transactional(readOnly=true)
	public List<Employee> getAllEmployee()
	{
		return template.query("select * from employee", new EmployeeRowMapper());
	}

}

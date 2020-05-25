package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
 class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return repo.getAllEmployee() ;
	}

}

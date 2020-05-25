package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private MessageChannel output;
	@PostMapping
	public Employee getEmployee(@RequestBody Employee emp)
	{
		output.send(MessageBuilder.withPayload(emp).build());
		return emp;
	}

}

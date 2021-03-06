package com.example.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	@Value("${my.greeting: default value}")
	private String message;
	@Value("this is static values")
	private String staticMessage;
	@Value("${my.list.value}")
	private List<String> listString;
	@Value("#{${dbValues}}")
	private Map<String,String> dbValues;
	@RequestMapping(value="/greeting",method=RequestMethod.GET)
	public String getMessage()
	{
		return message+" "+staticMessage+" "+listString+" "+dbValues;
	}

}

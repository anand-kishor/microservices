package com.example.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.configurationproperties.DbSettings;

@RestController
public class GreetingController {
	@Autowired
	private DbSettings setting;
	@Value("${my.greeting: default value}")
	private String message;
	@Value("this is static values")
	private String staticMessage;
	@Value("${my.list.value}")
	private List<String> listString;
	@Autowired
	private Environment env;

	/*
	 * @Value("#{${dbValues}}") private Map<String,String> dbValues;
	 */
	@RequestMapping(value="/greeting",method=RequestMethod.GET)
	public String getMessage()
	{
		return message+" "+staticMessage+" "+listString+" "+" "+setting.getConnection()+" "
				
				+setting.getHost()+" "+setting.getPort();
	}
	@RequestMapping(value="/env",method=RequestMethod.GET)
	public String getEnvDetails()
	{
		return env.toString();
	}

}

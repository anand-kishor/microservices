package com.example.client.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	@Value("${name}")
	 String name;
	@Value("${home}")
	  String home;
	@Value("${city}")
	  String city;
	@RequestMapping(value="/myapp",method=RequestMethod.GET)
	public String getMessage()
	{
		
		Map<String,String> map=new HashMap<>();
		map.put("name", name);
		map.put("home", home);
		map.put("city", city);
		return map.toString();
	}
	/*
	 * @Value("${username}") String username;
	 * 
	 * @Value("${password}") String password;
	 * 
	 * @Value("${url}") String url;
	 * 
	 * @RequestMapping(value="/application",method=RequestMethod.GET) public String
	 * getMessage() {
	 * 
	 * Map<String,String> map=new HashMap<>(); map.put("username", username);
	 * map.put("password", password); map.put("url", url); return map.toString(); }
	 */

}

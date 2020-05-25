package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.User;

@Controller
public class UserController {
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	@RequestMapping(value="/saveUser",method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute User user)
	{
		System.out.println("user from ui  "+user);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("register");
		modelAndView.addObject("user",user);
		return modelAndView;
		
		
	}
	

}

package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
@Controller
public class EmployeeServiceController {
	@Autowired
	private EmployeeService emmployeeServive;
	@RequestMapping(value="/employee",method=RequestMethod.GET)
	public ModelAndView getAllEmploye()
	{
		ModelAndView model=new ModelAndView();
		List<Employee> employeeList=emmployeeServive.getEmployees();
		model.addObject("employeeList", employeeList);
		model.setViewName("employee");
		return model;
	}
	

}

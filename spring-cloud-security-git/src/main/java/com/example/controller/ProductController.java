package com.example.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Product;

@RestController
@EnableOAuth2Sso
public class ProductController extends WebSecurityConfigurerAdapter {
	
	Map<Integer,Product> map=new HashMap<Integer,Product>();
	
	@RequestMapping(value="/product",method=RequestMethod.GET)
	public Collection<Product> getProduct()
	{
		if(ObjectUtils.isEmpty(map))
		{
			map.put(1001, new Product(10,"mobile","costly","SAMSUNG",8000));
			map.put(1002, new Product(11,"laptop","medium price","HCL",32000));
			map.put(1003, new Product(12,"cloth","high price","ALLEN SOLLEY",4000));
			map.put(1004, new Product(13,"TV","very low","MICROMAX",50000));
		}
		return map.values();
	}

	
}

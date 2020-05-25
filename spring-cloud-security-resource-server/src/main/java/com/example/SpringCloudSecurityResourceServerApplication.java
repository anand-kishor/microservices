package com.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Account;

@SpringBootApplication
@EnableResourceServer
@RestController
public class SpringCloudSecurityResourceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudSecurityResourceServerApplication.class, args);
	}
	Map<Integer,Account> accountMap=new HashMap<Integer,Account>();
	@RequestMapping("/account")
	public Collection<Account> getAccount()
	{
		if(ObjectUtils.isEmpty(accountMap))
		{
			accountMap.put(1001,new Account(123456,"saving","anand","ICICI"));
			accountMap.put(1002,new Account(452456,"current","anjana","HDFC"));
			accountMap.put(1003,new Account(345456,"business","saurav","SBI"));
			accountMap.put(1004,new Account(473456,"saving","kishor","RBS"));
		}
		return accountMap.values();
	}

}

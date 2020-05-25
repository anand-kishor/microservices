package com.example.demo;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@EnableOAuth2Sso
@SpringBootApplication
public class SpringSecurityBootSsoApplication {
	@GetMapping("/")
	public String getPrincipalName(Principal principal)
	{
		return "Hi "+principal.getName()+" welcome to octa server";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityBootSsoApplication.class, args);
	}

}

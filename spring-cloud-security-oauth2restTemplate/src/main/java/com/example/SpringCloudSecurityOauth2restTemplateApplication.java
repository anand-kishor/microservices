package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;
import org.springframework.security.oauth2.common.AuthenticationScheme;

@SpringBootApplication
public class SpringCloudSecurityOauth2restTemplateApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudSecurityOauth2restTemplateApplication.class, args);
	}
	@Bean
	public SpringBatch batch()
	{
		return new SpringBatch();
	}

	class SpringBatch implements CommandLineRunner{
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ResourceOwnerPasswordResourceDetails resource=new ResourceOwnerPasswordResourceDetails();
		resource.setAccessTokenUri("http://localhost:8085/token");
		resource.setClientId("anandkishorejava");
		resource.setClientSecret("kishor");
		resource.setUsername("pass");
		resource.setPassword("pass");
		resource.setClientAuthenticationScheme(AuthenticationScheme.header);
		OAuth2RestTemplate template=new OAuth2RestTemplate(resource);
		String results=template.getForObject("http://localhost:8084/account", String.class);
		System.out.println("results :"+results);
	}
	}

}

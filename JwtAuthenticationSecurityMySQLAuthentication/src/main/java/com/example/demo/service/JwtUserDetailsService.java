package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.model.DAOUser;
import com.example.demo.model.UserDTO;
@Service
public class JwtUserDetailsService implements UserDetailsService {
	@Autowired(required=true)
	private UserDao userDao;
	@Autowired(required=true)
	private BCryptPasswordEncoder encoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("javainuse".equals(username)) {
			return new User("javainuse", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",
					new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
}
	@Bean
	public boolean save(UserDTO user)
	{
		DAOUser newUser=new DAOUser();
		newUser.setUsername(user.getPassword());
		newUser.setPassword(encoder.encode(user.getPassword()));
		return UserDetails.class.equals(newUser);
	}

}

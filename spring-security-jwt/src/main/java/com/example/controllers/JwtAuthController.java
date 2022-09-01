package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.JwtUser;
import com.example.service.JwtUserServiceImpl;

@RestController
public class JwtAuthController {
	
	@Autowired
	private  PasswordEncoder passwordEncoder;
	
	@Autowired
	private JwtUserServiceImpl jwtUserServiceImpl;
	
	// to add the user
	@PostMapping("/register")
	public void addUser(@RequestBody JwtUser JwtUser) {
		String username=JwtUser.getUsername();
		String password=JwtUser.getPassword();
		String encodedPassword=passwordEncoder.encode(password);
		//create a user
		JwtUser newuser=new JwtUser(username, encodedPassword);
		//add the user
		jwtUserServiceImpl.addUser(newuser);
	}
}

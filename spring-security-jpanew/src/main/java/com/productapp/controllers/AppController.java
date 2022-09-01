package com.productapp.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.productapp.model.AppUser;
import com.productapp.service.AppUserServiceImpl;

@RestController
public class AppController {

	@Autowired
	AppUserServiceImpl appUserServiceImpl;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@PostMapping("/")
	public String addUser(@RequestBody AppUser appUser) {
		String password = appUser.getPassword();
		String newpassword = passwordEncoder.encode(password);
		appUser.setPassword(newpassword);
		appUserServiceImpl.addUser(appUser);
		return "added";
	}
	
	
	
	@GetMapping("/")
	public String welcome() {
		return "welcome to online store";
	}
	
	@GetMapping("/products")
	public List<String> show() {
		return Arrays.asList("laptop", "mobile");
	}
	
	@GetMapping("/admin/add-product")
	public String adproduct() {
		return "product added";
	}

	@GetMapping("/admin/delete-product")
	public String deleteproduct() {
		return "product deleted";
	}
	
	@GetMapping("/products/{type}")
	public List<String> showByType(@PathVariable("type") String type) {
		if(type.equals("sports")){
			return Arrays.asList("Bat","ball");
		}
		return Arrays.asList("laptop", "mobile");
	}

}

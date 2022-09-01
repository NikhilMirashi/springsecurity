package com.example.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

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

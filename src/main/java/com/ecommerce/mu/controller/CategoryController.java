package com.ecommerce.mu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.mu.model.Category;
import com.ecommerce.mu.service.CategoryService;

@RestController
@RequestMapping("category")
public class CategoryController {
	
	@Autowired
	private final CategoryService service;
	final String ENCODED = "application/json;charset=UTF-8";
	
	public CategoryController(CategoryService service) {
		this.service = service;
	}
	
	@GetMapping(produces = ENCODED)
	private ResponseEntity<?> findAll(){
		Map<String, Object> response = new HashMap<>();
		List<Category> categories = this.service.findAll();
		
		if(categories.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		
		response.put("Quantity of categories", categories.size());
		response.put("Categories", categories);
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
}

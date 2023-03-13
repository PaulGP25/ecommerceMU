package com.ecommerce.mu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.mu.model.Category;
import com.ecommerce.mu.repository.CategoryRepo;

@Service
public class CategoryService {
	
	private final CategoryRepo repo;

	@Autowired
	public CategoryService(CategoryRepo repo) {
		this.repo = repo;
	}
	
	@Transactional(readOnly = true)
	public List<Category> findAll(){
		return this.repo.findAll();
	}
	
	@Transactional(readOnly = true)
	public Optional<Category> findById(Integer categoryId){
		return this.repo.findById(categoryId);
	}
	
	@Transactional(rollbackFor = Exception.class)
	public Category addCategory(Category category) {
		return this.repo.save(category);
	}
	
	@Transactional(rollbackFor = Exception.class)
	public Category updateCategory(Category category) {
		return this.repo.save(category);
	}
	
	@Transactional(rollbackFor = Exception.class)
	public void deleteCategory(Integer categoryId) {
		this.repo.deleteById(categoryId);
	}
	
	
	
}

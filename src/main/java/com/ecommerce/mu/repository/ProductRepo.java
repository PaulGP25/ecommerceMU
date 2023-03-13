package com.ecommerce.mu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.mu.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}

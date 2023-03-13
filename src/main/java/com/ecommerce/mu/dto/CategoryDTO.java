package com.ecommerce.mu.dto;

import lombok.Data;

@Data
public class CategoryDTO {
	
	private Integer categoryId;
	private String description;
	private String categoryName;
	private String imageUrl;
}

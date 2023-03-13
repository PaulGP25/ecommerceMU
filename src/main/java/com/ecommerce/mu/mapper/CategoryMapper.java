package com.ecommerce.mu.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.ecommerce.mu.dto.CategoryDTO;
import com.ecommerce.mu.model.Category;

@Mapper
public interface CategoryMapper {
	
	CategoryDTO toCategoryDTO(Category category);
	
	Category toCategory(CategoryDTO categoryDTO);
	
	List<CategoryDTO> toCategoryDTOs(List<Category> categories);
}

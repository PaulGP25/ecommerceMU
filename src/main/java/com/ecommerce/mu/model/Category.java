package com.ecommerce.mu.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "categories")
public class Category implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="category_id")
	private Integer categoryId;
	
	@Column(name="description", nullable = false)
	private String description;
	@Column(name="category_name", nullable = false)
	private String categoryName;
	@Column(name="image_url", nullable = false)
	private String imageUrl;
	
	@JsonIgnore
	@OneToMany(mappedBy ="category")
	List<ProductCategory> productCategory;
	
}

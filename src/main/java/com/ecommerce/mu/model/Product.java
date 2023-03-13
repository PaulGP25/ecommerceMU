package com.ecommerce.mu.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="products")
public class Product implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Integer productId;
	
	@Column(name = "product_name", nullable = false)
	private String productName;
	
	@Column(name = "price", nullable = false)
	private Double price;
	
	@Column(name = "description", nullable = false)
	private String description;
	
	@Column(name = "state", nullable = false)
	private Boolean state;
	
	@Column(name = "image_url", nullable = false)
	private String imageUrl;
	
	@JsonIgnore
	@OneToMany(mappedBy = "product")
	List<ProductCategory> productCategory;
	
}

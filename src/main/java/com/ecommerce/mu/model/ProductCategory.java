package com.ecommerce.mu.model;

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
@Table(name ="Product_Categories")
public class ProductCategory {

	@EmbeddedId
	ProductCategoryKey id;
	
	@JsonIgnore
	@ManyToOne
	@MapsId("productId")
	@JoinColumn(name="product_id")
	Product product;
	
	@JsonIgnore
	@ManyToOne
	@MapsId("categoryId")
	@JoinColumn(name="category_id")
	Category category;
}

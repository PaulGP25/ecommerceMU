package com.ecommerce.mu.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Embeddable
public class ProductCategoryKey implements Serializable {
	
	@Column(name ="product_id")
	Integer productId;
	
	@Column(name ="category_id")
	Integer categoryId;
	
}

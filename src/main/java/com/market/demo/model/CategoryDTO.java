package com.market.demo.model;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryDTO {
	
	@NotNull(message = "Category Name cannot be null")
	private String categoryName;
	
	@NotNull(message = "Cost of Category cannot be null")
	private String cost;
}

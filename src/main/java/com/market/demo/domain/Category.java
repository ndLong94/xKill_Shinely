package com.market.demo.domain;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.market.demo.dto.CategoryDTO;

@Entity(name = "category")
@Getter
@Setter
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "categoryid")
    private Long categoryId;

    @Column(name = "categoryname")
    private String categoryName;

    @Column(name = "cost")
    private String cost;

	public Category(CategoryDTO category, Long id) {
		super();
		this.categoryId = id;
		this.categoryName = category.getCategoryName();
		this.cost = category.getCost();
	}

	public Category(CategoryDTO category) {
		super();
		this.categoryName = category.getCategoryName();
		this.cost = category.getCost();
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	private Set<Product> products = new HashSet<Product>(0);
	
	public Category(CategoryDTO category, Set<Product> products ) {
		super();
		this.categoryName = category.getCategoryName();
		this.cost = category.getCost();
		this.products = products;
	}
}

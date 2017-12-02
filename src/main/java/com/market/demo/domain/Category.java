package com.market.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.market.demo.model.CategoryDTO;

@Entity
@Table(name = "category")
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "categoryid")
    private Long categoryId;


    @Column(name = "categoryname")
    private String categoryName;

    @Column(name = "cost")
    private String cost;

	public Category() {
		super();
	}

	public Category(CategoryDTO category) {
		super();
		this.categoryName = category.getCategoryName();
		this.cost = category.getCost();
	}

}

package com.market.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.market.demo.model.CategoryForm;

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

	public Category(CategoryForm categoryForm) {
		super();
		this.categoryName = categoryForm.getCategoryName();
		this.cost = categoryForm.getCost();
	}

}

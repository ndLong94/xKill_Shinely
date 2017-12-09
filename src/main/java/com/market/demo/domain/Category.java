package com.market.demo.domain;

import lombok.*;

import javax.persistence.*;

import com.market.demo.dto.CategoryDTO;

@Entity
@Table(name = "category")
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

}

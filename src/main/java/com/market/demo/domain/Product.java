package com.market.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.market.demo.model.ProductForm;

@Entity
@Table(name = "product")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "productid", nullable = false)
    private Long productId;

    @Column(name = "ownerid")
    private Long ownerId;

    @Column(name = "categoryid")
    private Long categoryId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "quantity")
    private String quantity;

    @Column(name = "postdate")
    private String postDate;

    @Column(name = "expireDate")
    private String expireDate;

    @Column(name = "villageid")
    private Long villageId;

	public Product(ProductForm productForm) {
		super();
		this.ownerId = productForm.getOwnerId();
		this.categoryId = productForm.getCategoryId();
		this.title = productForm.getTitle();
		this.description = productForm.getDescription();
		this.quantity = productForm.getQuantity();
		this.postDate = productForm.getPostDate();
		this.expireDate = productForm.getExpireDate();
		this.villageId = productForm.getVillageId();
	}

	public Product() {
		super();
	}
	

}

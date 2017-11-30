package com.market.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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

	public Product(Long ownerId, Long categoryId, String title, String description, String quantity, String postDate,
			String expireDate, Long villageId) {
		super();
		this.ownerId = ownerId;
		this.categoryId = categoryId;
		this.title = title;
		this.description = description;
		this.quantity = quantity;
		this.postDate = postDate;
		this.expireDate = expireDate;
		this.villageId = villageId;
	}

	public Product() {
		super();
	}
	

}

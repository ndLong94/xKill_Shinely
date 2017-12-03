package com.market.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.market.demo.model.ProductDTO;

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
    
    @Column(name = "fileupload")
    private byte[] fileUpload;
    
	public Product(ProductDTO product) {
		super();
		this.ownerId = product.getOwnerId();
		this.categoryId = product.getCategoryId();
		this.title = product.getTitle();
		this.description = product.getDescription();
		this.quantity = product.getQuantity();
		this.postDate = product.getPostDate();
		this.expireDate = product.getExpireDate();
		this.villageId = product.getVillageId();
		this.fileUpload = product.getFileDB();
	}

	public Product() {
		super();
	}
	

}

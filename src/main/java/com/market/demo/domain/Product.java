package com.market.demo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.market.demo.dto.ProductDTO;

@Entity(name = "product")
@Getter
@Setter
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "productid", nullable = false)
    private Long productId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ownerid", nullable=false)
    private User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="categoryId", nullable=false)
	private Category category;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name="producttypeid", nullable=false)
//    private ProductType productType;

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

	@Column(name = "used")
	private boolean used;
    
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
	private Set<ProductType> productTypes = new HashSet<ProductType>(0);
	
	
	public Product(ProductDTO product) {
		super();
		this.user.setUserId(product.getOwnerId());
		this.category.setCategoryId(product.getCategoryId());
		this.title = product.getTitle();
		this.description = product.getDescription();
		this.quantity = product.getQuantity();
		this.postDate = product.getPostDate();
		this.expireDate = product.getExpireDate();
		this.villageId = product.getVillageId();
		this.fileUpload = product.getFileDB();
	}
	
	public Product(ProductDTO product, Set<ProductType> productTypes) {
		super();
		this.user.setUserId(product.getOwnerId());
		this.category.setCategoryId(product.getCategoryId());
		this.title = product.getTitle();
		this.description = product.getDescription();
		this.quantity = product.getQuantity();
		this.postDate = product.getPostDate();
		this.expireDate = product.getExpireDate();
		this.villageId = product.getVillageId();
		this.fileUpload = product.getFileDB();
		this.productTypes = productTypes;
	}

}

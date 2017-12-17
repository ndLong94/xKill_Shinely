package com.market.demo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    private Long ownerId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="producttypeid", nullable=false)
    private Long productTypeId;

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
    
	public Product(ProductDTO product) {
		super();
		this.ownerId = product.getOwnerId();
		this.productTypeId = product.getCategoryId();
		this.title = product.getTitle();
		this.description = product.getDescription();
		this.quantity = product.getQuantity();
		this.postDate = product.getPostDate();
		this.expireDate = product.getExpireDate();
		this.villageId = product.getVillageId();
		this.fileUpload = product.getFileDB();
	}

}

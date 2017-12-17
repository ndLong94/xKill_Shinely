package com.market.demo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "producttype")
@Getter
@Setter
@NoArgsConstructor
public class ProductType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "producttypeid", nullable = false)
	private Long productTypeId;

	@Column(name = "typename")
	private String typeName;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="categoryid", nullable=false)
	private Category category;

}

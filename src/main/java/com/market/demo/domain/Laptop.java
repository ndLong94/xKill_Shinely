package com.market.demo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "laptop")
@Getter
@Setter
@NoArgsConstructor
public class Laptop {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "laptopid", nullable = false)
	private Long laptopId;

	@Column(name="producttypeid", nullable=false)
	private Long producttypeId;

	@Column(name = "brand")
	private String brand;

	@Column(name = "version")
	private String version;

	@Column(name = "memory")
	private String memory;

	@Column(name = "ssd")
	private boolean ssd;
}

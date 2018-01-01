package com.market.demo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "phone")
@Getter
@Setter
@NoArgsConstructor
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "phoneid", nullable = false)
	private Long phoneId;

	@Column(name="producttypeId", nullable=false)
	private Long producttypeId;

	@Column(name = "brand")
	private String brand;

	@Column(name = "version")
	private String version;

	@Column(name = "memory")
	private String memory;
}

package com.market.demo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Entity(name = "address")
@Getter
@Setter
@NoArgsConstructor
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "addressid", nullable = false)
	private Long addressId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="districtid", nullable=false)
	private District district;


}

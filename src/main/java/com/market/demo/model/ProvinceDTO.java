package com.market.demo.model;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProvinceDTO {

	@NotNull(message = "Province Name cannot be null")
	private String provinceName;
	
}

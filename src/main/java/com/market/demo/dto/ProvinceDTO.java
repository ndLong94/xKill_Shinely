package com.market.demo.dto;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProvinceDTO {

	@NotNull(message = "Province Name cannot be null")
	private String provinceName;
	
}

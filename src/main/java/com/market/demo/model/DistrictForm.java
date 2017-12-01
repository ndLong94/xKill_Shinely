package com.market.demo.model;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DistrictForm {
	
	@NotNull(message = "Province Id cannot be null")
	private Long provinceId;
	
	@NotNull(message = "District Name cannot be null")
	private String districtName;

}

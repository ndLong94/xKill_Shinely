package com.market.demo.model;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VillageForm {
	
	@NotNull(message = "District Id cannot be null")
	private Long districtId;
	
	@NotNull(message = "Village Name cannot be null")
	private String villageName;
}

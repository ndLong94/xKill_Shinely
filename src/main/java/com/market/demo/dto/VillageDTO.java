package com.market.demo.dto;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VillageDTO {
	
	@NotNull(message = "District Id cannot be null")
	private Long districtId;
	
	@NotNull(message = "Village Name cannot be null")
	private String villageName;
}

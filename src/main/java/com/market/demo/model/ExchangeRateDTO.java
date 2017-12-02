package com.market.demo.model;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExchangeRateDTO {
	
	@NotNull(message = "Type cannot be null")
	private String type;
	
	@NotNull(message = "Rate cannot be null")
	private String rate;
}

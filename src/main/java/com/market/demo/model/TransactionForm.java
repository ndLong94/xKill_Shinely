package com.market.demo.model;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionForm {
	
	@NotNull(message = "User Id cannot be null")
	private Long userId;
	
	@NotNull(message = "Exchange Rate cannot be null")
	private Long exchangerateId;

	private String dayOfCharge;
}

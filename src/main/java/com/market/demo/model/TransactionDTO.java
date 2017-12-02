package com.market.demo.model;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionDTO {
	
	@NotNull(message = "Transaction Id cannot be null")
	private Long transactionId;
	
	@NotNull(message = "Exchange Rate cannot be null")
	private Long exchangerateId;

	private String dayOfCharge;
}

package com.market.demo.model;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HistoryForm {
	
	@NotNull(message = "User cannot be null")
    private Long userId;
	
	@NotNull(message = "Deduct Coin cannot be null")
    private String deductCoin;
	
	@NotNull(message = "Note cannot be null")
    private String note;
}

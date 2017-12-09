/*
 *-------------------------------------------------------------------
 * Copyright (c)2017 Jeppesen
 * All Rights Reserved.
 * THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE.
 * -------------------------------------------------------------------
*/
package com.market.demo.config.common;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel
@Getter @Setter
public class ErrorDetail implements Serializable {

	private static final long serialVersionUID = 9222719503031129217L;

	@ApiModelProperty(value = "Error type of the response")
	private String errType;
	
	@ApiModelProperty(value = "User friendly error message")
	private String userMessage;
	
	@ApiModelProperty(value = "Intenal error message")
	private String internalMessage;

	public ErrorDetail() {
	}
	
	public ErrorDetail(HttpStatus errCode) {
		this.errType = errCode.toString();
	}
	
	public ErrorDetail(String sMsg) {
		this.userMessage = internalMessage = sMsg;
	}
	
	public void setMessages(String sMsg) {
		this.userMessage = internalMessage = sMsg;
	}
	
	public ErrorDetail(HttpStatus errCode, String sMsg) {
		this.errType = errCode.toString();
		this.userMessage = internalMessage = sMsg;
	}
}

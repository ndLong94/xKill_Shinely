/*
 *-------------------------------------------------------------------
 * Copyright (c)2017 Jeppesen
 * All Rights Reserved.
 * THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE.
 * -------------------------------------------------------------------
*/
package com.market.demo.config.Security;

import java.util.Collection;

import com.market.demo.config.common.ErrorDetail;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;


import lombok.Getter;
import lombok.Setter;

public class CustomUsernamePasswordAuthenticationToken extends UsernamePasswordAuthenticationToken {

	private static final long serialVersionUID = 1L;
	
	@Getter
	private ErrorDetail error;
	
	@Getter @Setter
	private String corpId;

	public CustomUsernamePasswordAuthenticationToken(Object principal, Object credentials) {
		super(principal, credentials);
	}
	
	public CustomUsernamePasswordAuthenticationToken(ErrorDetail error) {
		super(null, null);
		this.error = error;
	}
	
	public CustomUsernamePasswordAuthenticationToken(Object principal, Object credentials, String corpId) {
		super(principal, credentials);
		this.error = null;
		this.corpId = corpId;
	}

	public CustomUsernamePasswordAuthenticationToken(Object principal, Object credentials,
			Collection<? extends GrantedAuthority> authorities) {
		super(principal, credentials, authorities);
		this.error = null;
	}
}

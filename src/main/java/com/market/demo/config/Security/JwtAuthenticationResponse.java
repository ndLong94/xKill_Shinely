/*
 *-------------------------------------------------------------------
 * Copyright (c)2017 Jeppesen
 * All Rights Reserved.
 * THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE.
 * -------------------------------------------------------------------
*/
package com.market.demo.config.Security;

import java.io.Serializable;

import lombok.Data;

@Data
public class JwtAuthenticationResponse implements Serializable {

    private static final long serialVersionUID = 1250166508152483573L;

    private String token;
    private JwtUserConfiguration userConfiguration;
	public JwtAuthenticationResponse(String token, JwtUserConfiguration userConfiguration) {
		this.token = token;
		this.userConfiguration = userConfiguration;
	}

}

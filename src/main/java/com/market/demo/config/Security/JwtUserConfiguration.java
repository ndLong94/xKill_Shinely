/*
 *-------------------------------------------------------------------
 * Copyright (c)2017 Jeppesen
 * All Rights Reserved.
 * THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE.
 * -------------------------------------------------------------------
*/
package com.market.demo.config.Security;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;


import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

@Data
public class JwtUserConfiguration implements Serializable {

    private static final long serialVersionUID = 1250166508152483573L;

    private String userId;
    private String corpId;
    private Collection<? extends GrantedAuthority> authorities;

	public JwtUserConfiguration(String userId, String corpId, Collection<? extends GrantedAuthority> authorities) {
      this.userId = userId;
      this.corpId = corpId;
      this.authorities = authorities;
  }

}

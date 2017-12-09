/*
 *-------------------------------------------------------------------
 * Copyright (c)2017 Jeppesen
 * All Rights Reserved.
 * THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE.
 * -------------------------------------------------------------------
*/
package com.market.demo.config.Security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {

	@Autowired
	private JwtTokenUtility jwtTokenUtility;

//	@Value("${jwt.header}")
	private String tokenHeader = "content-type";

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {

		String authToken = request.getHeader(this.tokenHeader);

		if (authToken != null 
				&& SecurityContextHolder.getContext().getAuthentication() == null) {

				String username = jwtTokenUtility.getUsernameFromToken(authToken);
				String password = jwtTokenUtility.getPasswordFromToken(authToken);

				UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
						username,
						password, 
						jwtTokenUtility.getRolesFromToken(authToken));
				
				authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				SecurityContextHolder.getContext().setAuthentication(authentication);
		}

		chain.doFilter(request, response);
	}
}
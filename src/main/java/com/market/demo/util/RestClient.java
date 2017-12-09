/*
 *-------------------------------------------------------------------
 * Copyright (c)2017 Jeppesen
 * All Rights Reserved.
 * THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE.
 * -------------------------------------------------------------------
*/
package com.market.demo.util;

import java.net.URI;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class RestClient {

	private final RestTemplate restTemplate;
	
    public RestClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }
    
	public String getData(String url, MultiValueMap<String, String> queryArgs) {
		
		URI targetUrl= UriComponentsBuilder.fromUriString(url)
    		    .queryParams(queryArgs)
    		    .build()
    		    .encode()
    		    .toUri(); 
    	
    		return this.restTemplate.getForObject(targetUrl, String.class);
	}
	
	public Object getData(String url, MultiValueMap<String, String> queryArgs, Class clazz ) {
		URI targetUrl= UriComponentsBuilder.fromUriString(url)
    		    .queryParams(queryArgs)
    		    .build()
    		    .encode()
    		    .toUri(); 
    	return this.restTemplate.getForObject(targetUrl, clazz);
	}
	
}

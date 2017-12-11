package com.market.demo.controller.Authentication;

import com.market.demo.config.Controller.ControllerUtils;
import com.market.demo.config.Security.*;
import com.market.demo.config.common.ErrorDetail;
import com.market.demo.controller.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mobile.device.Device;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthenticationController {
	@Autowired
	UserService userService;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtTokenUtility jwtTokenUtility;

	@PostMapping("/login")
	public ResponseEntity<Object> createAuthenticationToken(@RequestBody JwtAuthenticationRequest authenticationRequest,
	                                                                                           Device device) {

		Authentication userToken = new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(),
				authenticationRequest.getPassword());
		CustomUsernamePasswordAuthenticationToken authentication = (CustomUsernamePasswordAuthenticationToken)
				this.authenticationManager.authenticate(userToken);

		ErrorDetail error = authentication.getError();
		if (error != null) {
			if (HttpStatus.UNAUTHORIZED.toString().equals(error.getErrType())) {
				return ControllerUtils.createSuccessResponseEntity(error, HttpStatus.UNAUTHORIZED);
			} else if (HttpStatus.NOT_FOUND.toString().equals(error.getErrType())) {
				return ControllerUtils.createSuccessResponseEntity(error, HttpStatus.NOT_FOUND);
			}
			return ControllerUtils.createSuccessResponseEntity(error, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		SecurityContextHolder.getContext().setAuthentication(authentication);

		JwtUser userDetails = new JwtUser(authenticationRequest.getUsername(),
				authenticationRequest.getPassword(), authentication.getCorpId(), authentication.getAuthorities());

		String token = this.jwtTokenUtility.generateToken(userDetails, device);


		JwtUserConfiguration userConfiguration = new JwtUserConfiguration(authenticationRequest.getUsername(), authentication.getCorpId(),
				 authentication.getAuthorities());
		JwtAuthenticationResponse response = new JwtAuthenticationResponse(token, userConfiguration);

		return ControllerUtils.createSuccessResponseEntity(response, HttpStatus.OK);
	}



}

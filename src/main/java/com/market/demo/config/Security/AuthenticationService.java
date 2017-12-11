package com.market.demo.config.Security;

import java.rmi.RemoteException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.stream.Collectors;


import com.market.demo.config.common.ErrorDetail;
import com.market.demo.constants.Constants;
import com.market.demo.controller.UserRole.UserRoleService;
import com.market.demo.util.Encoder;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.ResourceAccessException;

import lombok.extern.slf4j.Slf4j;

@RefreshScope
@Service
@Slf4j
public class AuthenticationService implements AuthenticationProvider {


	@Autowired
	UserRoleService userRoleService;

//	@Autowired
//	private RolePermissionRepository rolePermissionRepository;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		Authentication authToken = null;
		String userName = authentication.getName();
		String password = Constants.STR_EMPTY;

		if (authentication.getCredentials() != null) {
			password = authentication.getCredentials().toString();
		}

		try {
			if (this.isLoginValid(userName, password)) {
				authToken = this.createAuthenticationToken(userName, password);
			} else {
				ErrorDetail err = new ErrorDetail(HttpStatus.INTERNAL_SERVER_ERROR, Constants.LOGIN_ERR_MSG_1);
				authToken = new CustomUsernamePasswordAuthenticationToken(err);
			}
		} catch (ResourceAccessException ex) {
			log.error("ResourceAccessException: " + ex.getMessage());
			ErrorDetail err = new ErrorDetail(HttpStatus.NOT_FOUND, Constants.LOGIN_ERR_MSG_2);
			authToken = new CustomUsernamePasswordAuthenticationToken(err);
		}  catch (HttpServerErrorException ex) {
			log.error("HttpServerErrorException: " + ex.getMessage());
			ErrorDetail err = new ErrorDetail(HttpStatus.INTERNAL_SERVER_ERROR, Constants.LOGIN_ERR_MSG_1);
			authToken = new CustomUsernamePasswordAuthenticationToken(err);
		} catch (NoSuchAlgorithmException | RemoteException | ServiceException ex) {
			log.error("Errorr: " + ex.getMessage());
		}
		return authToken;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

	//---------------------------------------PRIVATE VATE------------------------------------------------------------

	/**
	 * To generate authentication token base on logged-in user
	 *
	 * @param userName
	 * @return boolean
	 */
	private Authentication createAuthenticationToken(String userName, String password)
			throws  RemoteException, ServiceException {
		Authentication authToken = null;
		List<String> roles = this.userRoleService.findByUserName(userName);
		if (roles.isEmpty()) {
			ErrorDetail err = new ErrorDetail(HttpStatus.INTERNAL_SERVER_ERROR, Constants.LOGIN_ERR_MSG_1);
			authToken = new CustomUsernamePasswordAuthenticationToken(err);
		} else {
			List<GrantedAuthority> grantedAuthorities = roles.stream().map(role -> new SimpleGrantedAuthority(role.trim())).collect(Collectors.toList());
				authToken = new CustomUsernamePasswordAuthenticationToken(userName, password, grantedAuthorities);
		}
		return authToken;
	}

	/**
	 * Call e-link REST service to check log in
	 *
	 * @param userName
	 * @return boolean
	 */
	private boolean isLoginValid(String userName, String password) throws NoSuchAlgorithmException {
		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("username", userName);
		map.add("password", Encoder.encodePassword(password));
		List<String> rolesStrs = this.userRoleService.findByUserName(userName);
		return !rolesStrs.isEmpty();
	}

	/**
	 * Call SOAP service to get User Privileges
	 *
	 * @param userId
	 * @return user privileges
	 */
//	private List<String> getPrivilegesOfUser(String userId)  RemoteException, ServiceException {
//		Object[] userPrivileges = chartViewerDataLocator.getChartViewerDataPort().getPrivilegesOfUser(userId);
//		List<String> privileges = new ArrayList<>();
//		for (Object userPrivilege: userPrivileges) {
//			privileges.add((String) userPrivilege);
//		}
//		return privileges;
//		return new ArrayList<>();
	}




//	private String getUserCustomer(String userId) throws  RemoteException, ServiceException {
//		log.info("Retrieving corpId for user " + userId + "...");
//		String corpId = chartViewerDataLocator.getChartViewerDataPort().getUserCustomer(userId);
//		log.info("Retrieved corpId for user " + userId + ": " + corpId);
//		return corpId;
//	}



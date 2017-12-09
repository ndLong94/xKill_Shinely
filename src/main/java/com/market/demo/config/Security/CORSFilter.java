package com.market.demo.config.Security;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class CORSFilter implements Filter {

	private final String SWAGGER_PATH = "/swagger-ui.html";

	/**
	 * @param req   ServletRequest
	 * @param res   ServletResponse
	 * @param chain FilterChain
	 * @throws IOException      IOException
	 * @throws ServletException ServletException
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;

		//modification_旧正月まで no22
		response.setHeader(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
		response.setHeader(HttpHeaders.ACCESS_CONTROL_ALLOW_CREDENTIALS, "true");
		response.setHeader(HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS, "POST, PUT, GET, DELETE");
		response.setHeader(HttpHeaders.ACCESS_CONTROL_ALLOW_HEADERS,
				"Content-Type, Accept");
		response.setHeader(HttpHeaders.ACCESS_CONTROL_MAX_AGE, "0");

		//Modification: 155
		response.setHeader("X-Content-Type-Options", "nosniff");

		//Modification 158
		response.setHeader("Cache-Control", "private,no-store,no-cache,must-revalidate");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Expires", "-1");

		response.setHeader("X-Frame-Options", "deny");

		response.setHeader("X-XSS-Protection", "1; mode=block");

		if (!request.getRequestURI().equals(SWAGGER_PATH)) {
			response.setHeader("Content-Security-Policy", "default-src: 'none'");
		}
		response.setHeader("X-Content-Security-Policy",  "default-src 'none'");
		response.setHeader("X-WebKit-CSP", "default-src 'none'");

		chain.doFilter(req, res);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void destroy() {
	}
}

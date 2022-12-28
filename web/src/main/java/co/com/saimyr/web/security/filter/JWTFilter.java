package co.com.saimyr.web.security.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.com.saimyr.web.security.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class JWTFilter extends OncePerRequestFilter {
	private final JWTUtil jwtUtil;

	@Autowired
	public JWTFilter(JWTUtil jwtUtil) {
		this.jwtUtil = jwtUtil;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws ServletException, IOException {
	    if(HttpMethod.OPTIONS.toString().equals(req.getMethod())) {
	    	res.setStatus(HttpStatus.OK.value());
	    	chain.doFilter(req, res);
	    } else {
			final String authHeader = req.getHeader(HttpHeaders.AUTHORIZATION);

			if (authHeader != null) {
				final String token = authHeader.substring(7).trim();

				if (jwtUtil.isValid(token)) {
					chain.doFilter(req, res);
				} else {
					res.setStatus(HttpStatus.UNAUTHORIZED.value());
				}
			} else {
				res.setStatus(HttpStatus.FORBIDDEN.value());
			}

	    }
	}
}

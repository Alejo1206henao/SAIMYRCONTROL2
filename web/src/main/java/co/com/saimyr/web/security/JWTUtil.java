package co.com.saimyr.web.security;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class JWTUtil {
	private static final String URL_API = "http://saimyrjwt-env.hbepv873cs.us-east-2.elasticbeanstalk.com";
	private WebClient webClient;
	
	public JWTUtil() {
		webClient = WebClient.create(URL_API);
	}
	
	public boolean isValid(String token) {
		return Boolean.valueOf(webClient.get()
				.uri("/api/jwt/esValido/" + token)
				.retrieve()
				.bodyToMono(String.class)
				.block());
	}
}

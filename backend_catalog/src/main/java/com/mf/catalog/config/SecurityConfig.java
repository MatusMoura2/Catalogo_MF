package com.mf.catalog.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig{

	private final Environment environment;

	public SecurityConfig(Environment environment) {
		this.environment = environment;
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception{
		if (Arrays.asList(environment.getActiveProfiles()).contains("test")) {
			httpSecurity.headers(headers -> headers.frameOptions(frame -> frame.disable()));
		}
		httpSecurity.cors(cors -> {})
		.csrf(csfr -> csfr.disable())
		.sessionManagement(session ->
		session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		)
		.authorizeHttpRequests(auth -> 
		auth.anyRequest().permitAll()
		);
		
	return httpSecurity.build();
	}
	
	@Bean
	public CorsConfigurationSource configurationSource() {
		CorsConfiguration configuration = new CorsConfiguration().applyPermitDefaultValues();
		configuration.setAllowedMethods(Arrays.asList("POST", "GET", "PUT","DELETE", "OPTIONS"));
		
		UrlBasedCorsConfigurationSource basedCorsConfigurationSource  = new UrlBasedCorsConfigurationSource();
		basedCorsConfigurationSource.registerCorsConfiguration("/**", configuration);
		
		return basedCorsConfigurationSource;
	}
	
}

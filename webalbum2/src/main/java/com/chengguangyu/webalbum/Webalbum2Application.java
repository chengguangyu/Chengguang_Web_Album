package com.chengguangyu.webalbum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.chengguangyu.webalbum.config.JwtFilter;


@SpringBootApplication
public class Webalbum2Application {
	

	
	@Bean
	public FilterRegistrationBean jwtFilter() {
		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter(new JwtFilter());
		registrationBean.addUrlPatterns("/api/*");

		return registrationBean;
	}
	

	public static void main(String[] args) {
		SpringApplication.run(Webalbum2Application.class, args);
	}
}

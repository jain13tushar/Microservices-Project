package com.microservice.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	// @Bean annotation tells that a method produces a bean to be managed by the Spring container.
	// It is a method-level annotation. During Java configuration (@Configuration),
	// the method is executed and its return value is registered as a bean within a BeanFactory.
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}

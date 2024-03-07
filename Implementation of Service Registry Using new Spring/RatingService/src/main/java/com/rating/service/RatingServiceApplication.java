package com.rating.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.rating.service.repository.RatingRepository;

@SpringBootApplication
@EnableDiscoveryClient
@EnableMongoRepositories(basePackageClasses = {RatingRepository.class})
public class RatingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingServiceApplication.class, args);
	}

}

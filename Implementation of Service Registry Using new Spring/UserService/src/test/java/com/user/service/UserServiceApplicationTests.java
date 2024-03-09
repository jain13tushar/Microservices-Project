package com.user.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.user.service.entities.Rating;
import com.user.service.external.service.RatingService;

@SpringBootTest
class UserServiceApplicationTests {

	@Autowired
	private RatingService ratingService;

	@Test
	void contextLoads() {
	}

	@Test
	void createRating() {
		Rating rating = Rating.builder().rating(10).userId("").hotelId("")
				.feedback("This is created using feign client").build();
		Rating savedRating = ratingService.createRating(rating).getBody();
		System.out.println("New Rating Created" + savedRating);
	}

}

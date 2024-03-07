package com.rating.service.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.service.entities.Rating;
import com.rating.service.services.RatingService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/ratings")
@AllArgsConstructor
public class RatingController {

	private RatingService ratingService;

	@PostMapping
	public ResponseEntity<Rating> create(@RequestBody Rating rating) {
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
	}

	@GetMapping
	public ResponseEntity<List<Rating>> getRatings() {
		return ResponseEntity.ok(ratingService.getRatings());
	}

	@GetMapping("/users/{userId}")
	public ResponseEntity<List<Rating>> getRatingsByUserId(@PathVariable String userId) {
		return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
	}

	@GetMapping("/hotels/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingsByHotelId(@PathVariable String hotelId) {
		return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
	}

}

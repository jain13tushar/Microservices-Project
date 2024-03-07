package com.rating.service.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.rating.service.entities.Rating;
import com.rating.service.repository.RatingRepository;
import com.rating.service.services.RatingService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RatingServiceImpl implements RatingService {

	private RatingRepository ratingRepository;

	@Override
	public Rating create(Rating rating) {
		String ratingId = UUID.randomUUID().toString();
		rating.setRatingId(ratingId);
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getRatings() {
		return ratingRepository.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		return ratingRepository.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		return ratingRepository.findByHotelId(hotelId);
	}

}

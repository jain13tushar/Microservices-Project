package com.rating.service.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rating.service.entities.Rating;

public interface RatingRepository extends MongoRepository<Rating, String> {

	
	List<Rating> findByUserId(String userId);

	List<Rating> findByHotelId(String hotelId);

}

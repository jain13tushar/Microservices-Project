package com.user.service.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Rating {

	private String ratingId;

	private String userId;

	private String hotelId;

	private Integer rating;

	private String feedback;

	private Hotel hotel;

}

package com.user.service.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Rating {

	private String ratingId;

	private String userId;

	private String hotelId;

	private Integer rating;

	private String remark;
	
	private String feedback;

}

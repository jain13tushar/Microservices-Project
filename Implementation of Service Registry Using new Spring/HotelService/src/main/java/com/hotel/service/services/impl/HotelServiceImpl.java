package com.hotel.service.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.hotel.service.entities.Hotel;
import com.hotel.service.exceptions.ResourceNotFoundException;
import com.hotel.service.repositories.HotelRepository;
import com.hotel.service.services.HotelService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class HotelServiceImpl implements HotelService {

	private HotelRepository hotelRepository;

	@Override
	public Hotel create(Hotel hotel) {
		String hotelId = UUID.randomUUID().toString();
		hotel.setId(hotelId);
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		return hotelRepository.findAll();
	}

	@Override
	public Hotel get(String hotelId) {
		return hotelRepository.findById(hotelId).orElseThrow(
				() -> new ResourceNotFoundException("Hotel with given Id is not found on server !! : " + hotelId));
	}

}

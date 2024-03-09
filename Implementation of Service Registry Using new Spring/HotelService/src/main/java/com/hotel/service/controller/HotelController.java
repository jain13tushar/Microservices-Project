package com.hotel.service.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.service.entities.Hotel;
import com.hotel.service.services.HotelService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/hotels")
@AllArgsConstructor
public class HotelController {

	private HotelService hotelService;

	@PostMapping
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
		return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));
	}

	@GetMapping("/{HotelId}")
	public ResponseEntity<Hotel> getSingleHotel(@PathVariable String HotelId) {
		Hotel Hotel = hotelService.get(HotelId);
		return ResponseEntity.status(HttpStatus.OK).body(Hotel);
	}

	@GetMapping
	public ResponseEntity<List<Hotel>> getAll() {
		List<Hotel> allHotel = hotelService.getAll();
		return ResponseEntity.ok(allHotel);
	}

}

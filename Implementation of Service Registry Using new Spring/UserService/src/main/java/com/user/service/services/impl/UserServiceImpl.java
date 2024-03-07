package com.user.service.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.user.service.entities.User;
import com.user.service.exceptions.ResourceNotFoundException;
import com.user.service.repositories.UserRepository;
import com.user.service.services.UserService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		String randonUserId = UUID.randomUUID().toString();
		user.setUserId(randonUserId);
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {
		return userRepository.findById(userId).orElseThrow(
				() -> new ResourceNotFoundException("User with given Id is not found on server !! : " + userId));
	}

}

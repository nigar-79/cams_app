package com.ns.cams.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ns.cams.base.entity.User;
import com.ns.cams.repositories.UserRepositoy;

@Service
public class UserService {

	private UserRepositoy userRepository;

	public String createUser(User user) {

		// call validation method and include validation method in utils

		User resultant = new User();
		resultant = userRepository.save(user);

		String responseMessage = null;
		if (resultant != null) {
			responseMessage = "Sign up successful";
		}

		return responseMessage;
	}

	public List<User> getUserDtls() {

		List<User> userDtls = userRepository.findAll();

		return userDtls; // handle null condition
	}

	public User getUserDtlById(Integer userId) {

		User user = null;
		Optional<User> userDtl = userRepository.findById(userId);

		if (userDtl != null && !userDtl.isEmpty()) {
			user = userRepository.getById(userId); // cross check this
		}

		return user; // handle null condition
	}
}

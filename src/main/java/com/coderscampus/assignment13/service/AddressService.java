package com.coderscampus.assignment13.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.assignment13.domain.Address;
import com.coderscampus.assignment13.domain.User;
import com.coderscampus.assignment13.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepo;

	public Address updateAddress(User user) {

		user.getAddress().setUser(user);
		user.getAddress().setUserId(user.getUserId());
		return addressRepo.save(user.getAddress());

	}

}

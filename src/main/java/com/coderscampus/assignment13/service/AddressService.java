package com.coderscampus.assignment13.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.assignment13.domain.Address;
import com.coderscampus.assignment13.domain.User;
import com.coderscampus.assignment13.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepo;

	public Optional<Address> findAddressById(Long userId) {

		return addressRepo.findById(userId);
	}


	public Address addressCreateOrUpdate(User user) {
	
		if (user.getUserId() == null) {

			Address createdAddress = new Address();

			createdAddress.setUser(user);
			user.setAddress(createdAddress);
			return addressRepo.save(createdAddress);
		} else {
			user.getAddress().setUser(user);
			user.getAddress().setUserId(user.getUserId());
			return addressRepo.save(user.getAddress());
		}
	}
	
}


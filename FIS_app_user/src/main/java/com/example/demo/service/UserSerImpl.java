package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;

@Service
public class UserSerImpl implements UserService {
	
	@Autowired
	UserRepo repo;

	@Override
	public List<User> findalluserdata() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public User addAirlinedata(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	

}

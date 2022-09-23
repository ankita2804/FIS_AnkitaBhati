package com.example.demo.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.UserModel;

@FeignClient(name="userservice")

public interface FeignProxy {
	
	@GetMapping("/user/display")
	public List<UserModel> displayAllUser();

}

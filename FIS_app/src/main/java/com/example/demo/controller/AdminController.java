package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AdminModel;
import com.example.demo.model.UserModel;
import com.example.demo.service.AdminService;

@RestController
@RequestMapping("/admin")

public class AdminController {
	
	@Autowired
	AdminService service;
	
	@GetMapping("/display")
	public List<AdminModel> getAllFlightdata()
	{
		return service.findallflightdata();
	}
	@PostMapping("/add")
	public AdminModel addflightdata(@RequestBody AdminModel model)
	{
		return service.addAirlinedata(model);
	}
	@DeleteMapping("/delete/{fid}")
	public String deleteDataflight(@PathVariable("fid") int fid)
	{
		return service.deleteAirData(fid);
	}
	@PutMapping("/update")
	public AdminModel updateFlightdata(AdminModel model)
	{
		return service.updateflightdata(model);
	}
	
	@GetMapping("/user/display")
	public List<UserModel> getUserData()
	{
		return service.displayAllUser();
	}
}

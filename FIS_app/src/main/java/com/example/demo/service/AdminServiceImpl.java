package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AdminModel;
import com.example.demo.model.UserModel;
import com.example.demo.repo.AdminRepo;
@Service
public class AdminServiceImpl implements AdminService {
	
	
	@Autowired
	AdminRepo repo;
	
	@Autowired
	FeignProxy proxy;
	
	@Override
	public List<AdminModel> findallflightdata() {
		
		// TODO Auto-generated method stub
		return repo.findAll() ;
	}

	@Override
	public AdminModel addAirlinedata(AdminModel model) {
		// TODO Auto-generated method stub
		return repo.save(model);
	}

	@Override
	public String deleteAirData(int f_id) {
		// TODO Auto-generated method stub
		repo.deleteById(f_id);
		return "Record deleted";
	}

	@Override
	public AdminModel updateflightdata(AdminModel model) {
		// TODO Auto-generated method stub
		return repo.save(model);
	}

	@Override
	public List<UserModel> displayAllUser() {
		// TODO Auto-generated method stub
		return proxy.displayAllUser();
	}
	
	

	

}

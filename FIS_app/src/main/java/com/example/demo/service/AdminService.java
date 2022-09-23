package com.example.demo.service;

import java.util.List;

import com.example.demo.model.AdminModel;
import com.example.demo.model.UserModel;

public interface AdminService {
	public List<AdminModel> findallflightdata();
	public AdminModel addAirlinedata(AdminModel model);
	public String deleteAirData(int f_id);
	public AdminModel updateflightdata(AdminModel model);
	public List<UserModel> displayAllUser();

}

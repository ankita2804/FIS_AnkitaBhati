package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")

public class AdminModel {
	
	@Id
	int f_id;
	
	@Column
	int air_id;
	
	@Column
	String air_name;
	
	@Column
	String from_loc;
	
	@Column
	 String to_loc;
	
	@Column
	String dept_time;
	
	@Column
	String arr_time;
	
	@Column
	String duration;
	
	@Column
	String tot_seats;
	
	AdminModel(){
		
	}

	public AdminModel(int f_id, int air_id, String air_name, String from_loc, String to_loc, String dept_time,
			String arr_time, String duration, String tot_seats) {
		super();
		this.f_id = f_id;
		this.air_id = air_id;
		this.air_name = air_name;
		this.from_loc = from_loc;
		this.to_loc = to_loc;
		this.dept_time = dept_time;
		this.arr_time = arr_time;
		this.duration = duration;
		this.tot_seats = tot_seats;
	}

	public int getF_id() {
		return f_id;
	}

	public void setF_id(int f_id) {
		this.f_id = f_id;
	}

	public int getAir_id() {
		return air_id;
	}

	public void setAir_id(int air_id) {
		this.air_id = air_id;
	}

	public String getAir_name() {
		return air_name;
	}

	public void setAir_name(String air_name) {
		this.air_name = air_name;
	}

	public String getFrom_loc() {
		return from_loc;
	}

	public void setFrom_loc(String from_loc) {
		this.from_loc = from_loc;
	}

	public String getTo_loc() {
		return to_loc;
	}

	public void setTo_loc(String to_loc) {
		this.to_loc = to_loc;
	}

	public String getDept_time() {
		return dept_time;
	}

	public void setDept_time(String dept_time) {
		this.dept_time = dept_time;
	}

	public String getArr_time() {
		return arr_time;
	}

	public void setArr_time(String arr_time) {
		this.arr_time = arr_time;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getTot_seats() {
		return tot_seats;
	}

	public void setTot_seats(String tot_seats) {
		this.tot_seats = tot_seats;
	}
	

}
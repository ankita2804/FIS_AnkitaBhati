package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")

public class User {
	@Id
	int prof_id;
	
	@Column
	String password;
	
	@Column
	String fname;
	
	@Column
	String lname;
	
	@Column
	String address;
	
	@Column
	String mno;
	
	@Column
	String email;
	User(){
		
	}
	public int getProf_id() {
		return prof_id;
	}
	public void setProf_id(int prof_id) {
		this.prof_id = prof_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMno() {
		return mno;
	}
	public void setMno(String mno) {
		this.mno = mno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User(int prof_id, String password, String fname, String lname, String address, String mno, String email) {
		super();
		this.prof_id = prof_id;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.mno = mno;
		this.email = email;
	}
	

}

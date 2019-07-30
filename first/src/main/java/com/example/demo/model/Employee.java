package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Employee {

	@Id
	private int uid;
	private String password;
	private String name;
	private String email;
	private String des;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	@Override
	public String toString() {
		return "Employee [uid=" + uid + ", password=" + password + ", name=" + name + ", email=" + email + ", des="
				+ des + "]";
	}
	
	
	
}

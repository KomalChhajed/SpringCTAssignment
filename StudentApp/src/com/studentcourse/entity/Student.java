package com.studentcourse.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	String name;
	String email;
	Long phone;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, String email, Long phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	@Column
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Id
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	
}

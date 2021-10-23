package com.studentcourse.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

	String name;
	String profname;
	String description;
	Course()
	{
		
	}
	public Course(String name, String profname, String description) {
		super();
		this.name = name;
		this.profname = profname;
		this.description = description;
	}
	@Id
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column
	public String getProfname() {
		return profname;
	}
	public void setProfname(String profname) {
		this.profname = profname;
	}
	@Column
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", profname=" + profname + ", description=" + description + "]";
	}
	
}

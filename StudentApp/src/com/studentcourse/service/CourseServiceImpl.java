package com.studentcourse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentcourse.dao.CourseDAO;
import com.studentcourse.entity.Course;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	CourseDAO coursedao;
	
	
	public CourseDAO getCoursedao() {
		return coursedao;
	}


	public void setCoursedao(CourseDAO coursedao) {
		this.coursedao = coursedao;
	}


	@Override
	public void addCourse(Course course) {
		coursedao.addCourse(course);
		
	}


	@Override
	public int deleteCourse(String name) {
		
		return coursedao.deletecourse(name);
	}

}

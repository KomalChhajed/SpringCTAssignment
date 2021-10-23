package com.studentcourse.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.studentcourse.entity.Course;

@Repository
public class CourseDAOImpl implements CourseDAO{

	@PersistenceContext
	EntityManager entityManager;
	@Override
	public void addCourse(Course course) {
		
		entityManager.persist(course);
	}
	@Override
	public int deletecourse(String name) {
		Course course =(Course)entityManager.find(Course.class, name);
		if(course!=null)
		{	entityManager.remove(course);
		return 1;
	}
		else
		return 0;
	}

}

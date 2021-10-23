package com.studentcourse.service;

import com.studentcourse.entity.Course;

public interface CourseService {

	public void addCourse(Course course);

	public int deleteCourse(String name);

}

package com.studentcourse.service;

import java.util.List;

import com.studentcourse.entity.Student;

public interface StudentService {

	void addStudent(Student student);

	List<Student> listStudents();

}

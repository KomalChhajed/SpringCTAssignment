package com.studentcourse.dao;

import java.util.List;

import com.studentcourse.entity.Student;

public interface StudentDAO {

	public void addStudent(Student student);

	public List<Student> listStudents();

}

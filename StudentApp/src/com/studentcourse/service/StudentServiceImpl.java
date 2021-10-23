package com.studentcourse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentcourse.dao.StudentDAO;
import com.studentcourse.entity.Student;



@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDAO studentdao;
	
	public StudentDAO getStudentdao() {
		return studentdao;
	}

	public void setStudentdao(StudentDAO studentdao) {
		this.studentdao = studentdao;
	}

	@Override
	public void addStudent(Student student) {
		studentdao.addStudent(student);
		
	}

	@Override
	public List<Student> listStudents() {
		// TODO Auto-generated method stub
		return studentdao.listStudents();
	}

	


}

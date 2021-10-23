package com.studentcourse.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.studentcourse.entity.Student;

@Repository
@Transactional
public class StudentDAOImpl implements StudentDAO{

	@PersistenceContext
	EntityManager entitymanager;
	
	@Override
	public void addStudent(Student student) {
		
		entitymanager.persist(student);
		
	}

	@Override
	public List<Student> listStudents() {
List<Student> studentlist = null;
		
		try {
			studentlist=new ArrayList<Student>();
			
			@SuppressWarnings("unchecked")
			List<Student> listEmployeeEntity= (List<Student>) entitymanager.createQuery("from Student").getResultList();

		
			

		} catch (Exception exception) {

			throw exception;
		}
		
		//return employeeEntityBean2;
		return (studentlist);
	}
	}



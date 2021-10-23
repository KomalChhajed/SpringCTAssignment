package com.studentcourse.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.studentcourse.entity.Course;
import com.studentcourse.entity.Student;
import com.studentcourse.service.StudentService;

@Transactional
@EnableWebMvc
@Controller
public class StudentController {

	@Autowired 
	StudentService studentservice;

	public StudentService getStudentservice() {
		return studentservice;
	}

	public void setStudentservice(StudentService studentservice) {
		this.studentservice = studentservice;
	}
	@RequestMapping(value="/addstudentobj",method=RequestMethod.POST)
	public ModelAndView addStudent(@ModelAttribute("studentobj")Student student)
	{
		studentservice.addStudent(student);
		ModelAndView model=new ModelAndView();
		model.setViewName("studentsuccess");
		model.addObject("msg", "StudentAddedSuucessfully");
		return model;
	}
	
	@RequestMapping(value="/liststudents",method=RequestMethod.POST)
	public ModelAndView addStudent()
	{
		List<Student> studentlist=studentservice.listStudents();
		ModelAndView model=new ModelAndView();
		model.setViewName("getstudentlist");
		model.addObject("studentlist", studentlist);
		return model;
	}
}

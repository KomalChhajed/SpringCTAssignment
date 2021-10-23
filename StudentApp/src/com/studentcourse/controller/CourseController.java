package com.studentcourse.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.studentcourse.entity.Course;
import com.studentcourse.service.CourseService;
@Transactional
@EnableWebMvc
@Controller
public class CourseController {

	@Autowired
	CourseService courseservice;
	
	
	public CourseService getCourseservice() {
		return courseservice;
	}


	public void setCourseservice(CourseService courseservice) {
		this.courseservice = courseservice;
	}


	@RequestMapping(value="/addcourseobj",method=RequestMethod.POST)
	public ModelAndView addCourse(@ModelAttribute("courseobj")Course course)
	{
		courseservice.addCourse(course);
		ModelAndView model=new ModelAndView();
		model.setViewName("coursesuccess");
		model.addObject("msg", "CourseAddedSuucessfully");
		return model;
	}
	
	@RequestMapping(value="/deletecourseobj",method=RequestMethod.POST)
	public ModelAndView deleteCourse(@RequestParam(value = "name") String name)
	{ModelAndView model=new ModelAndView();
		int i=courseservice.deleteCourse(name);
		if(i==1)
		{
		model.setViewName("coursedeleted");
		model.addObject("msg", "CourseDeletedSuucessfully");
		return model;}
		else
		{
			model.setViewName("deletecourse");
			model.addObject("msg", "No Such Course Found");
			return model;
		}
	}
}

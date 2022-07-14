package com.java.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.CoursesDao;
import com.java.entity.Course;

@Service
public class CourseServiceImpl implements CourseSevice {
	
	@Autowired
	public CoursesDao coursesDao;

//	List<Course> list;
	public CourseServiceImpl() {
//		list = new ArrayList<Course>();
//		list.add(new Course(1,"java","these java course"));
//		list.add(new Course(2, "php", "these is php course"));
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return coursesDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Course getCourse(int courseId) {
		// TODO Auto-generated method stub
		return coursesDao.findById(courseId).get() ;
	}

	@Override
	public Course addCourse(Course course) {
		coursesDao.save(course);
		return course;
	}
	
	

}

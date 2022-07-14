package com.java.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.entity.Course;

@Service
public interface CourseSevice {
	
	public List<Course> getCourses();
	public Course getCourse(int courseId);
	public Course addCourse(Course course);

}

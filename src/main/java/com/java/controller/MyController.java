package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.entity.Course;
import com.java.service.CourseSevice;

@RestController
public class MyController {
	
	@Autowired
	private CourseSevice courseService;
	
	@GetMapping("/home")
 public String home() {
	 return "hello java";
 }
	
	//creating get courses method
	
	@GetMapping("/course")
	public List<Course> getCourses(){
		return this.courseService.getCourses();
		
	}
	//getting records based on id
	
	  @GetMapping("/courses/{courseId}")
	  public Course getCourse(@PathVariable String courseId) { 
		  return this.courseService.getCourse(Integer.parseInt(courseId));
	  
	  }
	  @GetMapping("/api/employees/{id}")
	  //@ResponseBody
	  public String getEmployeesById(@PathVariable String id) {
	      return "ID: " + id;
	  }
	  //inserting records
	  @PostMapping("/courses")
	  public Course addCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
		  
	  }
	 }

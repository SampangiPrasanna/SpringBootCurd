package com.java.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.entity.Course;

public interface CoursesDao extends JpaRepository<Course, Integer>{

}

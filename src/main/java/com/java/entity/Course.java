package com.java.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Course {
	@Id
	private int Id ;
	private String title;
	private String description;
	

	public Course(int id, String title, String description) {
		super();
		Id = id;
		this.title = title;
		this.description = description;
	}
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Course [Id=" + Id + ", title=" + title + ", description=" + description + "]";
	}


}

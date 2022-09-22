package com.employeeapp.service;

import java.util.List;

import com.employeeapp.model.Course;


public interface ICourseService {
	Course addCourse(Course course);
	void updateCourse(Course course);
	void deleteCourse(int courseId);
	List<Course>getAll();
	Course getById(int courseID);
	//derived query
	List<Course>getByCategory(String category);
	///custom query
	List<Course>getByEmployee(String name);
	List<Course>getByCity(String city);
	
	

}

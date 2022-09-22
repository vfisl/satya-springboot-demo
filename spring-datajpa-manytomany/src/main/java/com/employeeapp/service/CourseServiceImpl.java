package com.employeeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeapp.model.Course;
import com.employeeapp.repository.ICourseRepository;
@Service
public class CourseServiceImpl implements ICourseService {

	ICourseRepository iCourseRepository;
	@Autowired
	public void setiCourseRepository(ICourseRepository iCourseRepository) {
		this.iCourseRepository = iCourseRepository;
	}

	@Override
	public Course addCourse(Course course) {
		return iCourseRepository.save(course);
		
	}

	@Override
	public void updateCourse(Course course) {
		// TODO Auto-generated method stub
        iCourseRepository.save(course);
	}

	@Override
	public void deleteCourse(int courseId) {
	  iCourseRepository.deleteById(courseId);

	}

	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return iCourseRepository.findAll();
	}

	@Override
	public Course getById(int courseID) {
		// TODO Auto-generated method stub
		return iCourseRepository.findById(courseID).get();
	}

	@Override
	public List<Course> getByCategory(String category) {
		// TODO Auto-generated method stub
		return iCourseRepository.findByCategory(category);
	}

	@Override
	public List<Course> getByEmployee(String name) {
		// TODO Auto-generated method stub
		return iCourseRepository.findByEmployee(name);
	}

	@Override
	public List<Course> getByCity(String city) {
		// TODO Auto-generated method stub
		return iCourseRepository.findByCity(city);
	}

}

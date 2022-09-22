package com.employeeapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Course {
	@Id
	@GeneratedValue(generator = "course_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name="course_gen", sequenceName = "course_sequence",initialValue = 10,allocationSize = 1)
	@Column(name="courseid")
	private Integer courseId;
	@Column(name="coursename", length=20)
	private String courseName;
	@Column(length=20)
	private String  category;
	private double duration;
	@ManyToMany(fetch=FetchType.EAGER,mappedBy = "courses")
	private Set<Employee>employees;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String courseName, double duration, String category) {
		super();
		this.courseName = courseName;
		this.duration = duration;
		this.category = category;
		
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", category=" + category + ", duration="
				+ duration + ", employees=" + employees + "]";
	}
	
}

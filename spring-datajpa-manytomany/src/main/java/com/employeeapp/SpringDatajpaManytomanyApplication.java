package com.employeeapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employeeapp.model.Course;
import com.employeeapp.model.Employee;
import com.employeeapp.service.ICourseService;
import com.employeeapp.service.IEmployeeService;

@SpringBootApplication
public class SpringDatajpaManytomanyApplication implements CommandLineRunner{

	public static void main(String[] args)  {
		SpringApplication.run(SpringDatajpaManytomanyApplication.class, args);
	}
	@Autowired
  IEmployeeService iEmployeeService;
	@Autowired
	ICourseService iCourseService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Employee employee1=new Employee("Bishal", "Andhra", "QA");
		
		
		
		
		Course jcourse=iCourseService.getById(10);
		Course acourse=iCourseService.getById(11);
		Set<Course> courses=new HashSet<>(Arrays.asList(jcourse,acourse));
		employee1.setCourses(courses);
		//iEmployeeService.addEmployee(employee1);
		//iEmployeeService.deleteEmployee(0);
		//iCourseService.getByEmployee("sadik").forEach(System.out::println);
		
		
		
	}
	
	

}

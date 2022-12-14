package com.employeeapp.service;

import java.util.List;

import com.employeeapp.model.Employee;

public interface IEmployeeService {
	Employee addEmployee(Employee employee);
	void updateEmployee(Employee employee);
	void deleteEmployee(int employeeId);
	List<Employee>getAll();
	Employee getById(int employeeID);
	//derived query
	List<Employee>getByCity(String city);
	///custom query
	List<Employee>getByCourseName(String courseName);
	List<Employee>getByCourseCategory(String category);
	
	

}

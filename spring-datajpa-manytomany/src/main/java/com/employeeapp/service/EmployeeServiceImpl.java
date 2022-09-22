package com.employeeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeapp.model.Employee;
import com.employeeapp.repository.IEmployeeRepository;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
	IEmployeeRepository iEmployeeRepository;
	
    @Autowired
	public void setiEmployeeRepository(IEmployeeRepository iEmployeeRepository) {
		this.iEmployeeRepository = iEmployeeRepository;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return iEmployeeRepository.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		 iEmployeeRepository.save(employee);
		
	}

	@Override
	public void deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		iEmployeeRepository.deleteById(employeeId);
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return iEmployeeRepository.findAll();
	}

	@Override
	public Employee getById(int employeeID) {
		// TODO Auto-generated method stub
		return iEmployeeRepository.findById(employeeID).get();
	}

	@Override
	public List<Employee> getByCity(String city) {
		// TODO Auto-generated method stub
		return iEmployeeRepository.findByCity(city);
	}

	@Override
	public List<Employee> getByCourseName(String courseName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getByCourseCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

}

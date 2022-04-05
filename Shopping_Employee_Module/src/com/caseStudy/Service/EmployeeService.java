package com.caseStudy.Service;

import com.caseStudy.Entities.Employee;

public interface EmployeeService {
	
	
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public Employee searchEmployee(int id);
	public boolean deleteEmployee(int id);

}

package com.caseStudy.Service;

import com.caseStudy.Entities.Employee;
import com.caseStudy.Repository.EmployeeRepository;
import com.caseStudy.Repository.EmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	
	private EmployeeRepository dao;
	

	public EmployeeServiceImpl() {
		dao = new EmployeeRepositoryImpl();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		
		dao.beginTransaction();
		dao.addEmployee(employee);
		dao.commitTransaction();
		// TODO Auto-generated method stub
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		dao.beginTransaction();
		dao.updateEmployee(employee);
		dao.commitTransaction();
		// TODO Auto-generated method stub
		return employee;
	}

	@Override
	public Employee searchEmployee(int id) {
		Employee employee = dao.searchEmployee(id);
		// TODO Auto-generated method stub
		return employee;
	}

	@Override
	public boolean deleteEmployee(int id) {
		dao.beginTransaction();
		dao.deleteEmployee(id);
		dao.commitTransaction();
		// TODO Auto-generated method stub
		return false;
	}

}

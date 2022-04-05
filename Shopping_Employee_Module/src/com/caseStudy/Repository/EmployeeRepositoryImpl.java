package com.caseStudy.Repository;

import javax.persistence.EntityManager;

import com.caseStudy.Entities.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository{
	
	
	//Starting JPA Life Cycle
	private EntityManager entityManager;
	
	
	public EmployeeRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		
		entityManager.persist(employee);
		// TODO Auto-generated method stub
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		entityManager.merge(employee);
		// TODO Auto-generated method stub
		return employee;
	}

	@Override
	public Employee searchEmployee(int id) {
		Employee employee =entityManager.find(Employee.class, id);
		// TODO Auto-generated method stub
		return employee;
	}

	@Override
	public boolean deleteEmployee(int id) {
		Employee employee =entityManager.find(Employee.class, id);
		entityManager.remove(employee);
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void beginTransaction() {
		
		entityManager.getTransaction().begin();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commitTransaction() {
		
		entityManager.getTransaction().commit();
		// TODO Auto-generated method stub
		
	}

}

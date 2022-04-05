package com.caseStudy.client;

import com.caseStudy.Entities.Employee;
import com.caseStudy.Service.EmployeeService;
import com.caseStudy.Service.EmployeeServiceImpl;

public class client {
	



	public static void main(String[] args) {
		
		
		
		Employee emp = new Employee();
		
		EmployeeService Serv = new EmployeeServiceImpl();
		
		//Add data
		emp.setId(5);
		emp.setName("usaid");
		emp.setDob("2021-02-20");
		emp.setSalary(1280);
		emp.setAddress("delh");
		emp.setDesignation("mumbai");
		emp.setShop_id(23);
		
		Serv.addEmployee(emp);
		
		
		
		
		// retrieve
		
		emp=Serv.searchEmployee(1);
		System.out.println("ID is "+emp.getId());
		System.out.println("NAME is "+emp.getName());
		System.out.println("NAME is "+emp.getShop_id());
		
		
		
		// update
		
		emp=Serv.searchEmployee(1);
		emp.setShop_id(21);
		Serv.updateEmployee(emp);
		
		// delete
		
		Serv.deleteEmployee(3);
		
		
		
		
		
	}
	
}

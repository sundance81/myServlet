package com.academysmart.repository;

import java.util.ArrayList;
import java.util.List;

import com.academysmart.exception.IncorrectEmailException;
import com.academysmart.exception.ServletException;
import com.academysmart.model.Employee;

public class EmployeeRepositorySingleton {
	private static EmployeeRepositorySingleton repository;
	List<Employee> list = new ArrayList<Employee>();
	public static EmployeeRepositorySingleton getRepository() {
		// TODO implement method that returns repository instance
		if (repository == null) {
			repository = new EmployeeRepositorySingleton();
		}
		return repository;
	}

	public int addEmployee(String name, String sirname, String email)
			throws ServletException {
		// TODO implement method that adds an employee to repository
		// This method should check that email is not used by other employees
		
		Employee empl = new Employee();
		
		for (Employee emp : list) {
			if (email.equals(emp.getEmail())) {
				throw new IncorrectEmailException("This email exists already");
			}
		}
		empl.setEmail(email);

		if (name == null || name.equals("") || sirname == null
				|| sirname.equals("") || email.equals("")) {
			throw new ServletException("Fill all fields");
		}
		empl.setName(name);
		empl.setSirname(sirname);
		empl.setId(Employee.getCount());
		list.add(empl);

		return 0;
	}

	

	public List<Employee> getAllEmployees() {
		// TODO implement method that returns list of all employees
		return list;
	}
}

package com.academysmart.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.academysmart.repository.EmployeeRepositorySingleton;

@WebServlet("/index.html")
public class EmployeesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeRepositorySingleton emp = new EmployeeRepositorySingleton();

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		// TODO implement logic to process GET requests
		response.setContentType("text/html");
		request.setAttribute("employees", emp.getAllEmployees());
		getServletContext().getRequestDispatcher("/employee.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		// TODO implement logic to process data that client sent to server with
		// POST method.
		// It could include adding employee to repository,
		// validating email, redirecting client to a page where employee list is
		// displayed etc.
		
			try {
				emp.addEmployee(request.getParameter("name"),
						request.getParameter("sirname"),
						request.getParameter("email"));
			} catch (com.academysmart.exception.ServletException e) {
				request.setAttribute("errMsg", e);
			} 
	
		this.doGet(request, response);

	}
}

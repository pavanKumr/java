package com.as.samples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Name extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String middleName = request.getParameter("middlename");
		String gender = request.getParameter("gender");

		System.out.println("firstname: " + firstName);
		System.out.println("lastname: " + lastName);
		System.out.println("middlename: " + middleName);
		System.out.println("gender: " + gender);

		request.getSession().setAttribute("firstname", firstName);
		request.getSession().setAttribute("lastname", lastName);
		request.getSession().setAttribute("middlename", middleName);
		request.getSession().setAttribute("gender", gender);

		response.sendRedirect("html/address.html");
	}

}

package com.as.samples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class address extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String address=request.getParameter("address");
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		String country=request.getParameter("country");
		String phone=request.getParameter("phone");
		
		System.out.println("address: " +address);
		System.out.println("City: " +city);
		System.out.println("State: " +state);
		System.out.println("Country: " +country);
		System.out.println("phone: " +phone);
		
		
		request.getSession().setAttribute("address", address);
		request.getSession().setAttribute("City", city);
		request.getSession().setAttribute("State", state);
		request.getSession().setAttribute("Country", country);
		request.getSession().setAttribute("phone", phone);
		
		response.sendRedirect("html/BankInformation.html");
	}

}

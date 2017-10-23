package com.as.samples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BankInformation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String BankName=request.getParameter("bankname");
		String AccountNumber=request.getParameter("account");
		String SSN=request.getParameter("ssn");
		
		System.out.println("bankname: " +BankName);
		System.out.println("account: " +AccountNumber);
		System.out.println("ssn: " +SSN);
		
		
		
		request.getSession().setAttribute("bankname", BankName);
		request.getSession().setAttribute("account", AccountNumber);
		request.getSession().setAttribute("ssn", SSN);
		
		response.sendRedirect("jsp/Information.jsp");
	}

}

package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginservlet
 */
@WebServlet("/path")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String UserId,Password;
		UserId=request.getParameter("UserId");
		Password=request.getParameter("Password");
		LogInService loginservice=new LogInService();
		boolean result=loginservice.authenticate(UserId,Password);
		if(result) {
			response.sendRedirect("success.jsp");
			return;
		}
		else
		{
			response.sendRedirect("login.jsp");
			return;
		}
		
		
	}
	
}
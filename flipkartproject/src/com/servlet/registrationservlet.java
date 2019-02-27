package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/registrationservlet")
public class registrationservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String UserId,Password,EmailId,MobileNumber;
		UserId=request.getParameter("UserId");
		Password=request.getParameter("Password");
		EmailId=request.getParameter("EmailId");
		MobileNumber=request.getParameter("MobileNumber");
		 boolean status=false;
		 registration r=new registration();
		 PrintWriter out = response.getWriter();
		 out.println("registration successful");
		
		 try {
			 status= r.register(UserId, Password,EmailId,MobileNumber);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 if(status==true)
		 {
			 response.sendRedirect("login.jsp");
		 }
	}

	}



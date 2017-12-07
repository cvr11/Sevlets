package com.myfirstservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistationServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String gender = req.getParameter("gender");
		String city = req.getParameter("city");
		String hobbies = req.getParameter("hobbies");
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(gender);
		System.out.println(city);
		System.out.println(hobbies);
		
		if( firstName.length() >0 && gender.length()>0 && city.length()>0){
			
			req.setAttribute("USERNAME", lastName+" "+firstName);
			
			RequestDispatcher dispacher = req.getRequestDispatcher("conformation.jsp");
			dispacher.forward(req, resp);
		}else {
			// am assuming the registration is not successful...
			System.out.println("Please Enter Your Full Details...");
			
			req.setAttribute("ERRORMESSAGE", "PLEASE ENTER YOUR FIRSTNAME, GENDER, CITY. THOSE ARE MANDATORY FOR REGISTRATION..");
			
			RequestDispatcher dispacher = req.getRequestDispatcher("registation.jsp");
			dispacher.forward(req, resp);
			
		}
	}
}

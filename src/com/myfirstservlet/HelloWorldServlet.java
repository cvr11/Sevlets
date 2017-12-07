package com.myfirstservlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {

		System.out.println("Initializing Venkat servelet..");
	}

	/*
	 * @Override protected void service(HttpServletRequest arg0,
	 * HttpServletResponse arg1) throws ServletException, IOException {
	 * System.out.println("In Service..."); }
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//System.out.println("Serving the request using servlet..");
		
		//resp.setContentType("text/plain");
		resp.getWriter().println("Serving the request using venkat servlet..");
	}
	
	@Override
	public void destroy() {
		System.out.println("Destroying servlet...");
	}

}

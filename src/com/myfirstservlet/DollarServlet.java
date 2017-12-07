package com.myfirstservlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DollarServlet extends HttpServlet  {
	
	@Override
	public void init() throws ServletException {

		System.out.println("Initializing servelet..");
	}

	/*
	 * @Override protected void service(HttpServletRequest arg0,
	 * HttpServletResponse arg1) throws ServletException, IOException {
	 * System.out.println("In Service..."); }
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//System.out.println("Serving the request using servlet..");
		
		String maxLimitStr = req.getParameter("maxLimit");
		
		Integer maxLimitInt = 0;
		
		if( null != maxLimitStr)
		{
			maxLimitInt = Integer.parseInt(maxLimitStr);
		}
		
		resp.setContentType("text/html");
		
		resp.getWriter().println("<h1>Dollar Chart for Rupee @ 68</h1>");

		resp.getWriter().println("Convertion from Dollar to Rupee");
		resp.getWriter().println("<br>");
		
		for(int i =1; i<= maxLimitInt; i++)
		{
			resp.getWriter().println(i+" * 68 ="+(i * 68));	
			resp.getWriter().println("<br/>");
		}		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
	@Override
	public void destroy() {
		System.out.println("Destroying servlet...");
	}


}

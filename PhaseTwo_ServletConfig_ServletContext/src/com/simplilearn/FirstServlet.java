package com.simplilearn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
     
	public FirstServlet() {
        super();
       
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter writer = response.getWriter();
		writer.println("Service method of First Sevlet");
		
		ServletContext context = getServletContext();
		writer.println("<br />URL : " + context.getInitParameter("URL"));
		
		ServletConfig config = getServletConfig(); 
		writer.println("<br /><h3>Message value : </h3>" + config.getInitParameter("Message"));
		writer.println("<br /><h3>Command value : </h3>" + config.getInitParameter("Command"));
	}

}

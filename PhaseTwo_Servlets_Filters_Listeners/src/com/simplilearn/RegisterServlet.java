package com.simplilearn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
    public RegisterServlet() {
    
    }
    
     protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	PrintWriter writer = response.getWriter();
       	String pan = request.getParameter("pan");
    	writer.println("Your PAN number is : " + pan);
    	// PAN number 
    }
}
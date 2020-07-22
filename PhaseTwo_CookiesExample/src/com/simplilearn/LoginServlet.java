package com.simplilearn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter writer = response.getWriter();
		String name = request.getParameter("username");
		//String pass = request.getParameter("userpass");
	
		// Create Cookies 
		Cookie c1 = new Cookie("username",name);
		//c1.setMaxAge(60);

		// Add the cookies to response 
		response.addCookie(c1);
		writer.println("<a href='TestServlet'>View Details</a>");
	}
}
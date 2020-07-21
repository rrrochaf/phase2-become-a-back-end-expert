package com.simplilearn;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
       

    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	LocalDate date = LocalDate.now();
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    	
    	PrintWriter printWriter = resp.getWriter();
    	printWriter.println("<h3>You are logged in Successfully in " +formatter.format(date)+"</h3>");
    	printWriter.println("Welcome "+req.getParameter("username"));
    	
    	
    }

}

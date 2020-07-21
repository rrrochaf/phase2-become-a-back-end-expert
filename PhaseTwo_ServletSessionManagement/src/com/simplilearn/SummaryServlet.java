package com.simplilearn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.simplilearn.models.User;

public class SummaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SummaryServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter writer = response.getWriter();
		
		HttpSession session = request.getSession();
		
		if(session != null) {
			
			User user = (User)session.getAttribute("userDetail");
			user.setContact(request.getParameter("contact"));
			user.setCity(request.getParameter("city"));
			
			writer.println("<br/><br/>Welcome " + user.getFirstName()+"!!!");
			writer.println("<br/><br/>Session ID" + session.getId());	
			writer.println("<br/><br/>Session Creation Time " + session.getCreationTime());
			
			writer.println("<br/><br/>"+user);
			
		}else {
			writer.println("There is no session");
		}
		
	}

}

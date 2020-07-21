package com.simplilearn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher rd = null;
		PrintWriter writer = response.getWriter();
		
		String name = request.getParameter("username");
		String pass = request.getParameter("userpass");

		if (name.equals("admin") && pass.equals("admin")) {
		
			HttpSession session = request.getSession();
			session.setAttribute("username", name);
			request.getRequestDispatcher("dashboard.html").include(request, response);

		} else {
			request.getRequestDispatcher("login.html").include(request, response);
			writer.println("Invalid Credentials");
		}
	}

}

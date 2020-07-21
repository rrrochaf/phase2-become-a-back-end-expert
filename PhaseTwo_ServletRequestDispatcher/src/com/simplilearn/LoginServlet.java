package com.simplilearn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public LoginServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		String username = request.getParameter("username");
		String userpass = request.getParameter("userpass");

		RequestDispatcher rd = null;

		if (username.equals("ricardo") && userpass.equals("1234")) {
			rd = request.getRequestDispatcher("WelcomeServlet");
			rd.forward(request, response);
		} else {
			rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
			printWriter.println("Invalid Credentials");
		}
	}
}
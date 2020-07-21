package com.simplilearn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LogoutServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter writer = response.getWriter();
		HttpSession session = request.getSession();

		if (session != null) {

			// writer.println("Session exists");
			session.invalidate();
			request.getRequestDispatcher("login.html").include(request, response);
			writer.println("You are succesfully logged out");

		} else {
			writer.println("Session does not exists");
		}
	}
}

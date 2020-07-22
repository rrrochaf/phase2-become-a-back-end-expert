package com.simplilearn.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class ValidateFilter implements Filter {

    public ValidateFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		String pan = request.getParameter("pan");
		
		if(pan == null || !pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			PrintWriter writer = response.getWriter();
			request.getRequestDispatcher("index.html").include(request, response);
			writer.println("Invalid PAN number");
		}else {
			request.setAttribute("pan", pan);
			chain.doFilter(request, response);
		}
		
		//pan QWERT2143D
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

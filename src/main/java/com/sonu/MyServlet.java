package com.sonu;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	// ServletConfig and ServletContext -> give some initial value to servlet
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter outPrintWriter = resp.getWriter();
		outPrintWriter.print("Hi ");

//		ServletContext servletContext = getServletContext();
//		String name = servletContext.getInitParameter("name");
		// servlet context share value to all servlet
		// servletConfig for each servlet different value
		ServletConfig servletConfig = getServletConfig();
		String name = servletConfig.getInitParameter("name");
		outPrintWriter.println(name);
	}
}

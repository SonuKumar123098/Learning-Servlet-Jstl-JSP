package com.sonu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/sq")
public class SquareServlet extends HttpServlet {
//	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        int i = Integer.parseInt(request.getParameter("num1"));
//        int j = Integer.parseInt(request.getParameter("num2"));
//        int k = i + j;
//        response.getWriter().println("result is: " + k);
//    }
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        int i = Integer.parseInt(request.getParameter("num1"));
//        int j = Integer.parseInt(request.getParameter("num2"));
//		int k = (int) request.getAttribute("k");
		// redirect starting
//		int k= Integer.parseInt(request.getParameter("k")); //working while url reWritting
		// using HttpSession we will get redirected data
//		HttpSession session = request.getSession();
//		session.removeAttribute("k"); // we can remove the attribute from session, then this attribute will not accessible
//		int k = (int) session.getAttribute("k");
		//instead of session we can use Cookie
		int k=0;
		Cookie[] cookies= request.getCookies();
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("k")) {
				k= Integer.parseInt(cookie.getValue());
			}
		}
		k*=k;
		PrintWriter outPrintWriter = response.getWriter();
		outPrintWriter.println(" hello square");
		outPrintWriter.println("result is: " + k);
	}

}

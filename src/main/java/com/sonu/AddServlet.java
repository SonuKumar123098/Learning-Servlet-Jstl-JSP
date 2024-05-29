package com.sonu;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/add")
public class AddServlet extends HttpServlet{
//	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        int i = Integer.parseInt(request.getParameter("num1"));
//        int j = Integer.parseInt(request.getParameter("num2"));
//        int k = i + j;
//        response.getWriter().println("result is: " + k);
//    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int i = Integer.parseInt(request.getParameter("num1"));
        int j = Integer.parseInt(request.getParameter("num2"));
        int k = i + j;
        k=k*k;
        //request Dispatcher and redirect -> to call another servlet
        //Session Management -> to send the data to another servlet
//        request.setAttribute("k", k);
//        RequestDispatcher requestDispatcher= request.getRequestDispatcher("sq");
//        requestDispatcher.forward(request, response);
        //redirect started
//        response.sendRedirect("sq?k="+k); // url reWritting
        // another way to redirect data by using HttpSesssion
//        HttpSession session=request.getSession();
//        session.setAttribute("k", k);
        //Instead of session we can use Cookie
        Cookie cookie=new Cookie("k", ""+k);
        response.addCookie(cookie);
        response.sendRedirect("sq");
    }
}

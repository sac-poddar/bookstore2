package com.bs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/hello")
public class Hello extends HttpServlet {

    @Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		out.println("<h2>Hello there</h2>");
		// then write the data of the response
//		String username = request.getParameter("username");
//		if (username != null && username.length() > 0) {
//			out.println("<h2>Hello, " + username + "!</h2>");
//		}
    }
}

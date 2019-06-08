package com.ibm.assignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginpage")
public class LoginPage extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");

		if (request.getParameter("uname").equals("bhavana") && request.getParameter("password").equals("bhavana")) {
			pw.println("Login Success");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/login.html");

			dispatcher.include(request, response);
		} else {
			pw.println("Login Failure");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/login.html");

			dispatcher.include(request, response);

		}
	}

}

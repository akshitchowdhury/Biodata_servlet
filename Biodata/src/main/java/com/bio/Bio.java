package com.bio;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Bio
 */
public class Bio extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Bio() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw = response.getWriter();
		
		String name = request.getParameter("name");
		
		String email = request.getParameter("email");
		
		Long phone = Long.parseLong(request.getParameter("phone"));
		
		
	
		pw.println("<table>");
		pw.println("<tr>");
		pw.println("<td>");
		pw.println("<h1>");
		
		pw.println("Your name is : "+ name);
		pw.println("</td>");
		pw.println("</tr>");
		pw.println("</h1>");
		
		
		pw.println("<tr>");
		pw.println("<td>");
		pw.println("<i>");
		pw.println("<b>");
		pw.println("Your email id is : "+ email);
		pw.println("</td>");
		pw.println("</tr>");
		
		pw.println("<tr>");
		pw.println("<td>");
		pw.println("Your contct number is : "+ phone);
		
		pw.println("</td>");
		pw.println("</tr>");
		
		
		
	}

}

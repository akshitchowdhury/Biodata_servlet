package com.bio;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;



public class Bio2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Bio2() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pt = response.getWriter();
		
		pt.println("<h1>This is Bio 2");
		pt.println("</h1>");
		pt.println("<br>");
		
		Cookie[] cookies = request.getCookies();
		
		boolean f = false;
		String n = " ";
		
		if(cookies==null) {
			
			pt.println("<h1>You are new user</h1>");
			return;
		}
		
		else {
			
			for(Cookie c: cookies) {
				
				String tname = c.getName();
				if(tname.equals ("name")){
					f = true;
					n = c.getValue();
				}
			}
		}
		
		
		if(f==true) {
			
			
			pt.println("Hello"+" "+n+" "+ "Welcom back</h1>");
		}
		else {
			pt.println("<h1>LOL</h1>");
		}
				
				
				
		
	}

}

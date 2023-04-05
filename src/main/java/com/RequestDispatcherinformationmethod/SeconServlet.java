package com.RequestDispatcherinformationmethod;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sec")
public class SeconServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		String a=(String) req.getAttribute("user");
		String b=(String) req.getAttribute("pass");
		
		if(a.equals("")|| b.equals("")) {
			res.getWriter().print("invalid user name and password");
			
			
		}
		else {
			res.getWriter().print("Login successful!");
			res.getWriter().print("Hi"+a+ "your password is"+b);
		}
		
		
		
	}

}

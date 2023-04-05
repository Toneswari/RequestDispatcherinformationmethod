package com.RequestDispatcherinformationmethod;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gpt")
public class CredentialServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		String value1=req.getParameter("user");
		String value2=req.getParameter("pass");
		
		
		req.setAttribute("user",value1 );
		req.setAttribute("pass", value2);
		RequestDispatcher rq=req.getRequestDispatcher("sec");
		rq.forward(req, res);
		
	}

}

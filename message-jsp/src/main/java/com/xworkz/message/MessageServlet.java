package com.xworkz.message;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 1, urlPatterns = "/msg")
public class MessageServlet extends HttpServlet {
	
	public MessageServlet() {
		
		System.out.println("created :"+this.getClass().getSimpleName());
	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		System.out.println("Running doPost for MessageServlet....");
		
	     String fName=req.getParameter("fName");
	     String lName=req.getParameter("lName");
	     String gender=req.getParameter("gender");
	     String reason=req.getParameter("reason");
	     String address=req.getParameter("address");
	     
	     
	     System.out.println("fName :"+fName);
	     System.out.println("lName :"+lName);
	     System.out.println("gender :"+gender);
	     System.out.println("reason :"+reason);
	     System.out.println("address :"+address);
	     
	     
	  RequestDispatcher dispatcher=  req.getRequestDispatcher("display.jsp");
	  req.setAttribute("fName", fName);
	  req.setAttribute("lName", lName);
	  req.setAttribute("gender",gender);
	  req.setAttribute("reason", reason);
	  req.setAttribute("address",address);
	  
	  dispatcher.forward(req, resp);
	  
	  
	}
}

package com.xworkz.application;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup=3, urlPatterns="/bus")
public class BusServlet extends HttpServlet {
	
	public BusServlet() {
		
		System.out.println("created : "+ this.getClass().getSimpleName());
	}
	
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) 
			throws ServletException,IOException
			{
		  
		System.out.println("running do get method for bus Servlet.....");
			}

}

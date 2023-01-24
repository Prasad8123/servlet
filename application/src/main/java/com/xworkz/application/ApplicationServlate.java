package com.xworkz.application;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/app")
public class ApplicationServlate extends HttpServlet {
	
	 public ApplicationServlate() {
		 
		 System.out.println("created : " +this.getClass().getSimpleName()); 
	} 
		
		
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		System.out.println("running doGet method in servlate......");
		
	}

}

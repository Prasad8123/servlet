package com.xworkz.application;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(loadOnStartup = 4, urlPatterns = "/train")
public class TrainServlet extends HttpServlet {
	
	public TrainServlet() {
		
		System.out.println("created : " +this.getClass().getSimpleName());
	}

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		System.out.println("running doget method for train servlet......");

	}
}

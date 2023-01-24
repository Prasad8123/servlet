package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/app")
public class ApplicationServlet extends HttpServlet {

	public ApplicationServlet() {

		System.out.println("created : " + this.getClass().getSimpleName());
	}

	@Override
	public void init(ServletConfig config) throws ServletException {

		System.out.println("running init method for application servlet");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("running doGet method for applicationServlet.....");
		String s1="doGet method for application servlet";
		  PrintWriter writer=resp.getWriter();
		  writer.print(s1);
		  resp.setContentType("text/plain");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("running doPost method for applicaionServlet.......");
		
		String s2="doPost method for application servlet";
	  PrintWriter writer=resp.getWriter();
	  writer.print(s2);
	  resp.setContentType("text/plain");
	 
	
	
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("runnng doPut method for applicationServlet......");
		String s3="doPut method for application servlet";
		  PrintWriter writer=resp.getWriter();
		  writer.print(s3);
		  resp.setContentType("text/plain");
		

	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("running doDelete method for applicationServlet....");
		String s4="doDelete method for application servlet";
		  PrintWriter writer=resp.getWriter();
		  writer.print(s4);
		  resp.setContentType("text/plain");
	}

	@Override
	protected void doOptions(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {

		System.out.println("runnng doOptions method for application servlet....");
		String s5="doOptions method for application servlet";
		  PrintWriter writer=arg1.getWriter();
		  writer.print(s5);
		  arg1.setContentType("text/plain");

	}

	@Override
	protected void doTrace(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {

		System.out.println("running trace method for application servlet....");
		String s6="doTrace method for application servlet";
		  PrintWriter writer=arg1.getWriter();
		  writer.print(s6);
		  arg1.setContentType("text/plain");
	}

}

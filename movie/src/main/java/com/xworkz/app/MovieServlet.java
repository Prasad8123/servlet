package com.xworkz.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/movie")
public class MovieServlet extends HttpServlet {

	public MovieServlet() {

		System.out.println("created : " + this.getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("running doGet for movie servlet.....");

		String movieName = req.getParameter("movieName");
		int budget = Integer.parseInt(req.getParameter("budget"));
		LocalDate reliaseDate = LocalDate.parse(req.getParameter("date"));
		int collection = Integer.parseInt(req.getParameter("collection"));
		int noOfActors = Integer.parseInt(req.getParameter("noOfActors"));
		String heroName = req.getParameter("heroName");
		String heroineName = req.getParameter("heroineName");

		String appName = req.getParameter("applicationName");
		String type = req.getParameter("type");
		boolean free = Boolean.parseBoolean(req.getParameter("free"));
		String version = req.getParameter("version");
		LocalDate date = LocalDate.parse(req.getParameter("date"));

		String engineerName = req.getParameter("name");
		double salary = Double.parseDouble(req.getParameter("salary"));
		String jobType = req.getParameter("jobType");
		int experince = Integer.parseInt(req.getParameter("experince"));
		LocalDate dob = LocalDate.parse(req.getParameter("date"));
		String email = req.getParameter("email");

		System.out.println();

		System.out.println("movie name : " + movieName);
		System.out.println("budget : " + budget);
		System.out.println("reliase date : " + reliaseDate);
		System.out.println("total collection : " + collection);
		System.out.println("no of actors : " + noOfActors);
		System.out.println("hero name :" + heroName);
		System.out.println("heroine Name :" + heroineName);

		System.out.println();

		System.out.println("Application name : " + appName);
		System.out.println("Application type : " + type);
		System.out.println("is free : " + free);
		System.out.println("version :" + version);
		System.out.println("lunched date : " + date);

		System.out.println();

		System.out.println("Software engineering name :" + engineerName);
		System.out.println("salary : " + salary);
		System.out.println("job type : " + jobType);
		System.out.println("experince : " + experince);
		System.out.println("dob :" + dob);
		System.out.println("email id :" + email);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1 style='color:orange'>");
		writer.println("movie details are registered successfully.....");
		writer.print("</h1>");
		writer.print("<h1 style='color:orange'>");
		writer.print("Application details are registered successfully....");
		writer.print("</h1>");
		writer.print("<h1 style='color:orange'>");
		writer.println("Engineer details are registered sucessfully....");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");

		resp.setContentType("text/html");

	}
}

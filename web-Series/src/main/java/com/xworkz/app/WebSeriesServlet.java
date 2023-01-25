package com.xworkz.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 1 , urlPatterns = "/series")
public class WebSeriesServlet extends HttpServlet {
	
	public WebSeriesServlet() {
		
		System.out.println("created : "+ this.getClass().getSimpleName());
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {

    System.out.println("running init for web series servlet.....");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
		System.out.println("running doGet for web series servlet......");
		
		  String name=req.getParameter("name");
		  String language=req.getParameter("language");
		  String platform=req.getParameter("platform name");
		  
		int episodes=Integer.parseInt(req.getParameter("episodes"));
		 
		int budget=Integer.parseInt(req.getParameter("budget"));
		  
		    System.out.println("Web series name : "+name);
		    System.out.println("language : " +language);
		    System.out.println("ott platform : " +platform);
		    System.out.println("episodes : " + episodes);
		    System.out.println("budget : "+budget);
		    
		    
		   PrintWriter writer= resp.getWriter();
		   writer.print("<html>");
		   writer.print("<head>");
		   writer.print("<body style='background-color:yellow'>");
		   writer.print("<h1 style='color:red'>");
           
		   writer.print(name + " web series is registered successsflly...");
		   writer.print("</h1>");
		   writer.print("</body>");
		   writer.print("</head>");
		   writer.print("</html>");
		   resp.setContentType("text/html");
		   

	}

}

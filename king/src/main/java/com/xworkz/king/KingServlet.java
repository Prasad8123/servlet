package com.xworkz.king;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 1,urlPatterns = "/king")
public class KingServlet extends HttpServlet {
	
	
	public KingServlet() {
		
		System.out.println("created : "+this.getClass().getSimpleName());
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {

       System.out.println("running init for King servlet......");
	}

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("running doGet for King Servlet.....");
        String name=req.getParameter("name");
        String region =req.getParameter("region");
        
        int noOfQueens=Integer.parseInt(req.getParameter("noOfQueens"));
        
        LocalDate dob=LocalDate.parse(req.getParameter("date"));
        
        LocalDate dod=LocalDate.parse(req.getParameter("date"));
        
        System.out.println("king name : "+name);
        System.out.println("region :"+region);
        System.out.println("no of queens : "+noOfQueens);
        System.out.println("dob : "+dob);
        System.out.println("dod : "+dod);
        
         PrintWriter writer=resp.getWriter();
         writer.print("<html>");
         writer.print("<body style='background-color:green'>");
         writer.print("<h1 style='color:red'>");
         writer.print(name + " his details are registered succesfully....");
         writer.print("</h1>");
         writer.print("</body>");
         writer.print("</html>");
         
         resp.setContentType("text/html");
         
	}
}

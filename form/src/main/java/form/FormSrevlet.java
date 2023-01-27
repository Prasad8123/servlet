package form;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 1,urlPatterns = "/form")
public class FormSrevlet extends HttpServlet {
	
	public FormSrevlet() {
		
		System.out.println("created : "+this.getClass().getSimpleName());
	}

	
	@Override
	public void init(ServletConfig config) throws ServletException {

      System.out.println("Running init for form servlet.....");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

   
		System.out.println("Running doPost for form servlet.....");
	
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String startingPoint=req.getParameter("startingPoint");
		String destination=req.getParameter("destination");
	    String gender=req.getParameter("gender");
	    
	  
	    
	    
	    System.out.println("name : "+name);
	    System.out.println("email id :"+email);
	    System.out.println("starting point :" +startingPoint);
	    System.out.println("destination : "+ destination);
	    System.out.println("gender :" +gender);
	    
	    
	   PrintWriter writer= resp.getWriter();
	   writer.print("<html>");
	   writer.print("<body style='background-color:cyan'>");
	   if(name.length() <3 || startingPoint.length() <3 || destination.length() <3)
	   {
		  writer.print("<h1 style='color:red'>Characters should be min 3</h1>"); 
	   }
	   else if(!email.contains("@gmail.com"))
	   {
		   writer.print("<h1 style='color:red'>");
		   writer.print("Email id format is worng :" +email);
		   writer.print("</h1>");
	   }
	   else
	   {
		   writer.print("<h1 style='color:orange'>");
		   writer.print("location is registered successfully...");
		   writer.print("</h1>");
	   }
	   writer.println("<a href='index.html'>HOME</a>");
	   writer.print("&nbsp;");
	   writer.println("<a href='contact.html'>CONTACT </a>");
	   writer.print("&nbsp;");
	   writer.println("<a href='location.html'>LOCATION</a>");
	   writer.print("</body>");
	   writer.print("</html>");
	   
	   resp.setContentType("text/html");
	}
}

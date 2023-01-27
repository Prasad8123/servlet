package form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 2, urlPatterns = "/contact")
public class ContactServlet extends HttpServlet {
	
	public ContactServlet() {
		
		System.out.println("created :"+this.getClass().getSimpleName());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

   
		System.out.println("Running doPost for contact servlet....");
		    
		    String userName=req.getParameter("name");
		    String emailId=req.getParameter("email");
		    Long mobile=Long.decode(req.getParameter("mobile"));
		    String comment=req.getParameter("comment");
		    
		    System.out.println("userName :"+userName);
		    System.out.println("emailId :"+emailId);
		    System.out.println("mobile no :"+mobile);
		    System.out.println("comment : " +comment);
		    
	             PrintWriter writer= resp.getWriter();
			   writer.print("<html>");
			   writer.print("<body style='background-color:cyan'>");
			   
			   if(userName.length() <3 || comment.length() <5)
			   {
				   writer.print("<h1 style='color:red'>Characters should be min 3</h1>");
			   }
			   else if(!emailId.contains("@gmail.com"))
			   {
				   writer.print("<h1 style='color:red'>");
				   writer.print("Email id format is worng :" +emailId);
				   writer.print("</h1>");   
			   }
			   else if(mobile.intValue() >9)
			   {
				   writer.print("<h1 style='color:red'>");
				   writer.print("Mobile number should be 10 digit : "+mobile);
				   writer.print("</h1>");
			   }
			   else
			   {
				   writer.print("<h1 style='color:orange'>");
				   writer.print("contact is registered successfully...");
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

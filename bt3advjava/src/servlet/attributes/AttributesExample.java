package servlet.attributes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AttributesExample extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
				
		
		String loginId = request.getParameter("username");
		String psd = request.getParameter("password");
		
		
		PrintWriter out = response.getWriter();		 
		response.setContentType("text/html");
		 
	    
		RequestDispatcher reqDis;
		 
		if(loginId.equalsIgnoreCase("adithya") && psd.equalsIgnoreCase("1234")){
			
				
			ServletContext context=getServletContext();  
			
			User user = new User("adithya", 25, "TechiGuy");
			context.setAttribute("logedInUser", user);
			
			response.sendRedirect("http://localhost:8080/bt3advjava/html/dashboard");
			
		}else{
			
			 out.println("Given credentials doesn't match please try again");
			 reqDis =request.getRequestDispatcher("/html/login.html");
			reqDis.include(request, response);
			 out.println("Only 3 attempts will be allowed");
		}
		
	}

}

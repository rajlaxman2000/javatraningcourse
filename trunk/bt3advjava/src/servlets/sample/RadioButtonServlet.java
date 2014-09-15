package servlets.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RadioButtonServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		String name = request.getParameter("Gender");
		String dropDownValue = request.getParameter("occupation");
		/*
		String[] parmVals = request.getParameterValues(name);
			String reqValue = parmVals[0];
		*/	
			 PrintWriter out = response.getWriter();
		 
			 response.setContentType("text/html");
			 
		    out.print("<html><body>");
			 out.println("Select gender is ::"+name);
			 out.println("Occupation is ::"+dropDownValue);
			 
			 out.print("</body></html>");
			 
			 
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		doGet(request,response );
	}

	
}

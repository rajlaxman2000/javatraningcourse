package servlets.errorhandler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorTest extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		String throwError = request.getParameter("throwError");
		
		Boolean isError = new Boolean(throwError);
		
		if(throwError.equalsIgnoreCase("true") && isError==true){
			//response.sendError(404,"This is my personal error lets see how can u handle it");
			throw new IOException("This exception is created by me dude");
		}
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
		doGet(request,response);
	}

}

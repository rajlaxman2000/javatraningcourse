package servlets.requestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletRedirect  extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		String url = "http://google.co.in";
		//url ="login.html"
		//url ="header"
		response.sendRedirect(url);
	}
}

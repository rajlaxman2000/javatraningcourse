package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckBoxRead extends HttpServlet {

	private static final long serialVersionUID = 1L;

	// Method to handle GET method request.
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set response content type
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		String title = "Reading Checkbox Data";
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n";
		out.println(docType + "<html>\n" + "<head><title>" + title
				+ "</title></head>\n" + "<body bgcolor=\"#f0f0f0\">\n"
				+ "<h1 align=\"center\">" + title + "</h1>\n" + "<ul>\n");
				if(request.getParameter("maths")!=null && request.getParameter("maths").equalsIgnoreCase("on")){	
					out.println(" <li><b>Maths Flag : </b>: "+ request.getParameter("maths") + "\n");
				}
				if(request.getParameter("physics")!=null && request.getParameter("physics").equalsIgnoreCase("on")){
					out.println("  <li><b>Physics Flag: </b>: "+ request.getParameter("physics") + "\n");
				}
				if(request.getParameter("chemistry")!=null && request.getParameter("chemistry").equalsIgnoreCase("on")){
					out.println("  <li><b>Chemistry Flag: </b>: "+ request.getParameter("chemistry") + "\n" + "</ul>\n");
				}
				out.println("</body></html>");
	}

	// Method to handle POST method request.
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
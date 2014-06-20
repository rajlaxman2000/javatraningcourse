package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestObjDetails
 */
public class RequestObjDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Set response content type
	      response.setContentType("text/html");
	      
		PrintWriter out = response.getWriter();
		  String title = "HTTP Header Request Example";
	      String docType =
	      "<!doctype html public \"-//w3c//dtd html 4.0 " +
	      "transitional//en\">\n";
	      out.println(docType +
	        "<html>\n" +
	        "<head><title>" + title + "</title></head>\n"+
	        "<body bgcolor=\"#f0f0f0\">\n" +
	        "<h1 align=\"center\">" + title + "</h1>\n" +
	        "<table width=\"100%\" border=\"1\" align=\"center\">\n" +
	        "<tr bgcolor=\"#949494\">\n" +
	        "<th>Header Name</th><th>Header Value(s)</th>\n"+
	        "</tr>\n");
		
		Enumeration headerNames = request.getHeaderNames();
		
		 while(headerNames.hasMoreElements()) {
	         String paramName = (String)headerNames.nextElement();
	         out.print("<tr><td>" + paramName + "</td>\n");
	         String paramValue = request.getHeader(paramName);
	         out.println("<td> " + paramValue + "</td></tr>\n");
	         
	         
	      }
		 
	      out.println("</table>\n");
	      // One can get any further values from this request object.	      
	      out.println(request.getRemoteAddr()+"\n");
	      out.println(request.getLocalAddr()+"\n");
	      out.println(request.getMethod()+"\n");
	      out.println("\n"+request.getRequestURI()+"\n");
	      
	      out.println("</body></html>");
	      response.setIntHeader("Refresh", 5);
	      
	      //String redirectUrl = response.encodeRedirectURL("http://localhost:8080/Advancedjava/");
	      //String redirectUrl = response.encodeRedirectURL("/Advancedjava");
	      /*String redirectUrl = response.encodeRedirectURL("/Advancedjava/html/ReadParams");
	      response.sendRedirect(redirectUrl);*/
	      //TODO:  In debug mode check the response->response->writer->out->outoutChunk
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

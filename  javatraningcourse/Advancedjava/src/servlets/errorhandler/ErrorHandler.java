package servlets.errorhandler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorHandler extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		// Analyze the servlet exception       
	      /*
	       * javax.servlet.error.status_code :: 
	       * 			This attribute give status code which can be stored and analyzed after storing in a java.lang.Integer data type.	       * 
	       * javax.servlet.error.message	::
	       * 			This attribute gives information exact error message which can be stored and analyzed after storing in a java.lang.String data type.
	       * javax.servlet.error.request_uri ::
	       * 			This attribute gives information about URL calling the servlet and it can be stored and analyzed after storing in a java.lang.String data
	       * 			 type.
	       * javax.servlet.error.exception	::
	       * 			This attribute gives information the exception raised which can be stored and analyzed after storing in a java.lang.Throwable data type.
	       * javax.servlet.error.exception_type ::
	       * 			This attribute gives information about exception type which can be stored and analyzed after storing in a java.lang.Class data type.
	       * javax.servlet.error.servlet_name ::
	       * 			This attribute gives servlet name which can be stored and analyzed after storing in a java.lang.String data type.
	       */
		  Throwable throwable = (Throwable)request.getAttribute("javax.servlet.error.exception");
	      Integer statusCode = (Integer)request.getAttribute("javax.servlet.error.status_code");
	      String servletName = (String)request.getAttribute("javax.servlet.error.servlet_name");
	      String requestUri = (String)request.getAttribute("javax.servlet.error.request_uri");
	      String errMsg = (String)request.getAttribute("javax.servlet.error.message");
	      
	      if (servletName == null){
	         servletName = "Unknown";
	      }
	      
	      if (requestUri == null){
	         requestUri = "Unknown";
	      }
	   // Set response content type
	      response.setContentType("text/html");
	 
	      PrintWriter out = response.getWriter();
		  String title = "Error/Exception Information";
	      String docType ="<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n";
	      out.println(docType +"<html>\n" +"<head><title>" + title + "</title></head>\n" +
	        					"<body bgcolor=\"#f0f0f0\">\n");
	      if (throwable == null && statusCode == null){
	         out.println("<h2>Error information is missing</h2>");
	         out.println("Please return to the <a href=\"" + response.encodeURL("http://localhost:8080/") +"\">Home Page</a>.");
	      }else if (statusCode != null){
	         out.println("The status code : " + statusCode+"; Error Msg: "+errMsg);
	      }else{
	         out.println("<h2>Error information</h2>");
	         out.println("Servlet Name : " + servletName +"</br></br>");
	         out.println("Exception Type : " + throwable.getClass( ).getName( ) +"</br></br>");
	         out.println("The request URI: " + requestUri + "<br><br>");
	         out.println("The exception message: " + throwable.getMessage( ));
	      }
	      out.println("</body>");
	      out.println("</html>");
	}
	
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		doGet(request,response);
	}

}

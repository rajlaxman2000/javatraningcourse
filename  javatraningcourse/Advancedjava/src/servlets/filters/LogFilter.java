package servlets.filters;

import java.io.IOException;
import java.util.Date;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class LogFilter
 */
public class LogFilter implements Filter {  
	
	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		 // Get init parameter 
	      String testParam = fConfig.getInitParameter("test-param"); 

	      //Print the init parameter 
	      System.out.println("Test Param: " + testParam); 
	}	

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		  // Get the IP address of client machine.   
	      String ipAddress = request.getRemoteAddr();

	      // Log the IP address and current time stamp.
	      System.out.println("IP "+ ipAddress + ", Time "+ new Date().toString());

	      // Pass request back down the filter chain
	      chain.doFilter(request,response);		
	      
	      
	}
	
	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		/* Called before the Filter instance is removed 
	      from service by the web container */
		System.out.println("Destroy method is called");
	}

	

}

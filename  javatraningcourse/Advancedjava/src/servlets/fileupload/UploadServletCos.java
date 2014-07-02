package servlets.fileupload;

//Import required java libraries
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import com.oreilly.servlet.MultipartRequest;

//import org.apache.commons.io.output.*;

public class UploadServletCos extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private boolean isMultipart;
	private String filePath;
	private int maxFileSize = 50 * 1024;
	private int maxMemSize = 4 * 1024;
	private File file;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("I am here");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String path = new String("D:\\new");
		File dir = new File(path);

		if (dir.isDirectory()) {

			MultipartRequest m = new MultipartRequest(request, path);
			out.print("successfully uploaded");
		} else {
			System.out.println("Provide the correct path");
		}
	}

}

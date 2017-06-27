
package com.carbuilder.china;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Car Builder Web Application
 * @author Bánszki András <andras.banszki@gmail.com>
 */
public class CarBuilderServlet extends HttpServlet{
    
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
                throws ServletException, IOException {
            
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter(); 
                HtmlBuilder htmlBuilder = new HtmlBuilder();
                
		try {
			
			out.println("<!DOCTYPE html>"); 
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Car Builder web application</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<br /><p><h2>Chineese Car Builder web application</h2>");
                        out.println("<br />" + htmlBuilder.createCarsTable());
			out.println("<br /><br /><a href=\"index.html\">Previous Page</a>");
			out.println("</body>");
			out.println("</html>");
		} 
		finally 
		{ 
		out.close(); 
		}
	}

}

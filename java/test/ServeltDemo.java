package test;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServeltDemo extends HttpServlet{
	
//	public void init() throws ServletException{
//		System.out.println("Program Start");
//		
//	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		PrintWriter out=response.getWriter();
		out.println("<h2> Hello Java Programming</h2>");
		
	}
	

}

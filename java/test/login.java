package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class login extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		HttpSession session = request.getSession(true);
		
		session.setAttribute("username", request.getParameter("username"));
		
		PrintWriter out=response.getWriter();
		out.println("Login Success");
		
		
		String username=request.getParameter("username"); 
		Cookie cookie=new Cookie("username", username);          
		cookie.setMaxAge(60*60*24*30);       
		response.addCookie(cookie);

		
	}
}


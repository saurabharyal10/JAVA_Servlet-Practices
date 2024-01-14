package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionData extends HttpServlet{
		
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session = request.getSession();
			String username = (String) session.getAttribute("username");
			
			PrintWriter out=response.getWriter();
			out.println("Username: "+username);

			Cookie cookies[] = request.getCookies(); 
			Cookie mycookie = null;
			if (cookies != null) {       
				for (int i = 0; i < cookies.length; i++) {
					if (cookies[i].getName().equals("username")) { 
						mycookie = cookies[i];
						break;            
					}       
				}    
			}
			String userName = mycookie.getValue();
			out.println("Username: "+userName);
		}
		
			
}

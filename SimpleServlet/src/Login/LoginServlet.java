package Login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(description = "login page", urlPatterns = { "/LoginServletPath" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	
	   
		// PrintWriter w= response.getWriter();
		   
		String user = request.getParameter("username");
		String pswd = request.getParameter("password");		
		
		if(user.equals("tom") && pswd.equals("jerry"))
		{
			response.sendRedirect("success.html");
			// w.println("<h2>Hello tom</h2>"); 
		}
		
		else
		{
			response.sendRedirect("login.html");
			
	
		}
	
	}
}
	

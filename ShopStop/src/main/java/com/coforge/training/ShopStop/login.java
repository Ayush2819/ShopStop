package com.coforge.training.ShopStop;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		// write the message on the web Page
		PrintWriter out= response.getWriter();
		
		Date d1=new Date();
		
		String user=request.getParameter("userName");
		String pass=request.getParameter("userPassword");
		
		if(user.equals("ayush") && pass.equals("redhat101")) {
			out.println("<h1>Login Successful - Shop Stop</h1>");
			out.println("Login Time: "+d1);
			out.println("<h3>Enjoy Shopping.....</h3>");
		}else {
			out.println("<h1>Login Failed!!!</h1>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

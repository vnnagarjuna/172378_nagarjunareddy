package com.sampleflipkart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.connection.ClassDao;

/**
 * Servlet implementation class LoginnServlet
 */
@WebServlet("/LoginnServlet")
public class LoginnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginnServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String uemail=request.getParameter("uname");
		String upassword=request.getParameter("pass");
		ClassDao userdao_Object=new ClassDao(); 
	       boolean status=false;
	       
	     status= userdao_Object.validate(uemail,upassword);
		
		 PrintWriter out=response.getWriter();
		 if(status==true)
	
		{
			
			response.sendRedirect("payment.jsp");
			
		}
		 
		 }
	}


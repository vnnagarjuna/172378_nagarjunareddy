package com.sampleflipkart;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.connection.ClassDao;
import com.org.pojo.User;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uemail=request.getParameter("fname");
		String upassword=request.getParameter("lname");
		String uphonenumber=request.getParameter("email");
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
System.out.println(uemail);

		ClassDao userdao_Object=new ClassDao();
		User user=new User(uemail,upassword,uphonenumber,uname,pass);
		userdao_Object.insert(user);
		response.sendRedirect("loginn.jsp");
		
	}

}

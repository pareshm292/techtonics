package com.registerservlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.login.LoginDao;
import com.dao.register.RegistrationDao;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String nextpage;
		try {
			if(LoginDao.isEmployeeRegistered(request.getParameter("email")))
			{
				session.setAttribute("loginstatus", "You are already registered.Please Login.");
				response.sendRedirect("login.jsp");
			}
			boolean registrationStatus = RegistrationDao.registerEmployee(request.getParameter("name"),
											request.getParameter("email"), 
											request.getParameter("password"));
			if(registrationStatus){
				session.setAttribute("loginstatus", "Thank You for registering.Please Login to proceed.");
				response.sendRedirect("login.jsp");
			}
			else{
				session.setAttribute("registrationstatus", "Registration Failed.Please Try again.");
				response.sendRedirect("register.jsp");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}

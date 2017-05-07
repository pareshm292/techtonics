package com.registerservlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.regex.Pattern;

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
		String email = request.getParameter("email");
		Pattern ptr = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "atmecs.com");
		if(ptr.matcher(email).matches())
		try {
			if(ptr.matcher(email).matches()){
				
				if(LoginDao.isEmployeeRegistered(email))
				{
				session.setAttribute("loginstatus", "You are already registered.Please Login.");
				response.sendRedirect("login.jsp");
				}
				else{	
					boolean registrationStatus = RegistrationDao.registerEmployee(request.getParameter("name"),
											email, 
											request.getParameter("password"));
			
					if(registrationStatus){
						session.setAttribute("loginstatus", "Thank You for registering.Please Login to proceed.");
						response.sendRedirect("login.jsp");
					}
			}
			}
			else{
				session.setAttribute("registrationstatus", "Registration Failed.Please Try again with a valid email.");
				response.sendRedirect("register.jsp");
			}
		
		}catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}

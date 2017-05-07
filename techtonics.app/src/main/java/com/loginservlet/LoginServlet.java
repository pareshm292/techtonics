package com.loginservlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.login.AdminLoginDao;
import com.dao.login.LoginDao;
import com.model.Employee;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
   
	public LoginServlet() {
        super();
        //System.out.println("Login Servlet constr");
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Login Servlet dopost");
		try {
			HttpSession session = request.getSession();
			String email = request.getParameter("email");
			Pattern ptr = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
					+ "atmecs.com");
			if(ptr.matcher(email).matches()){
				
			
			if(LoginDao.isEmployeeRegistered(email)){
			
			Employee empnormal = LoginDao.verifyLogin(email,request.getParameter("password"));
			
					if(empnormal == null){
					session.setAttribute("loginstatus", "Wrong Password,Please try to login again.");
					response.sendRedirect("login.jsp");
					}
					else{
					session.setAttribute("user", empnormal);
					//request.getRequestDispatcher("GetTechTalks").forward(request, response);
					response.sendRedirect("GetTechTalks");
					}
			}
			else{
				session.setAttribute("loginstatus", "Not Registered.Please register first.");
				response.sendRedirect("login.jsp");
			}
		
		}
		else{
				session.setAttribute("loginstatus", "Invalid Email.");
				response.sendRedirect("login.jsp");
		}
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

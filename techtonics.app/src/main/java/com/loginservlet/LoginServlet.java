package com.loginservlet;

import java.io.IOException;
import java.sql.SQLException;

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
	
//	LoginDao logindao = new LoginDao();
   
	public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			HttpSession session = request.getSession();
			session.setAttribute("loginstatus", "This is a new session");
			if(AdminLoginDao.isAdmin(request.getParameter("email"),request.getParameter("password"))){
				Employee emp = LoginDao.verifyLogin(request.getParameter("email"),request.getParameter("password"));
				session.setAttribute("user", emp);
				response.sendRedirect("GetTechTalks");
				
			}
			if(LoginDao.isEmployeeRegistered(request.getParameter("email"))){
			
			Employee emp = LoginDao.verifyLogin(request.getParameter("email"),request.getParameter("password"));
			
			if(emp == null){
				session.setAttribute("loginstatus", "Wrong Password,Please try to login again.");
				response.sendRedirect("login.jsp");
			}
			else{
					session.setAttribute("user", emp);
					//request.getRequestDispatcher("GetTechTalks").forward(request, response);
					response.sendRedirect("GetTechTalks");
			}
			}
			else{
				session.setAttribute("loginstatus", "Not Registered.Please register first.");
				response.sendRedirect("login.jsp");
		}
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

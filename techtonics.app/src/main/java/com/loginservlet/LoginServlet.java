package com.loginservlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.login.LoginDao;
import com.model.Employee;
import com.mysql.cj.api.Session;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	LoginDao logindao = new LoginDao();
    public LoginServlet() {
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
		try {
			System.out.println(request.getParameter("email")+ " " + request.getParameter("password"));
			Employee emp = logindao.verifyLogin(request.getParameter("email"),request.getParameter("password"));
			HttpSession session = request.getSession();
			if(emp == null){
				session.setAttribute("loginstatus", "Employee doesnt exist,Please Register yourself first.");
				response.sendRedirect("login.jsp");
			}
			else{
				session.setAttribute("employee", emp);
				response.sendRedirect("homepage.jsp");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		doGet(request, response);
	}

}

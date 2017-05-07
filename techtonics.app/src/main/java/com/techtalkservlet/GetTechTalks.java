package com.techtalkservlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.login.AdminLoginDao;
import com.dao.techtalklist.TechTalkDao;
import com.model.Employee;

/**
 * Servlet implementation class GetTechTalks
 */
@WebServlet("/GetTechTalks")
public class GetTechTalks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetTechTalks() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session.getAttribute("user")==null){
			response.sendRedirect("login.jsp");
		}
		try {
		//	System.out.println(TechTalkDao.getAllUpcomingTalks());
			Employee emp = (Employee) session.getAttribute("user");
			if(AdminLoginDao.isAdmin(emp.getEmpEmail(), emp.getPassword())){
				session.setAttribute("listOfTechTalks", TechTalkDao.getAllUpcomingTalks());
				//response.sendRedirect("adminhomepage.jsp");
				request.getRequestDispatcher("adminhomepage.jsp").forward(request, response);
			}
			else{
			session.setAttribute("listOfTechTalks", TechTalkDao.getAllUpcomingTalks());
			//response.sendRedirect("homepage.jsp");
			request.getRequestDispatcher("homepage.jsp").forward(request, response);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				doGet(request, response);
	}

}

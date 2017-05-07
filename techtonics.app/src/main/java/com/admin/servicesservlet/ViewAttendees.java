package com.admin.servicesservlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.adminservices.AdminServicesDao;

/**
 * Servlet implementation class ViewAttendees
 */
@WebServlet("/ViewAttendees")
public class ViewAttendees extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAttendees() {
        super();
        System.out.println("view attendees servlet");    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		try {
			ArrayList<String> talkAttendees = AdminServicesDao.techTalkAttendees(request.getParameter("talkTitle"));
			session.setAttribute("listOfAttendees", talkAttendees);
			response.sendRedirect("viewattendees.jsp");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

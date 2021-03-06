package com.registerservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.register.RegistrationDao;
import com.dao.register.TechTalkRegister;

/**
 * Servlet implementation class RegisterForTechTalk
 */
@WebServlet("/RegisterForTalk")
public class RegisterForTechTalk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterForTechTalk() {
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
		HttpSession session = request.getSession();
		try {
		String status = "Not Registered";
		if(TechTalkRegister.registerForTalk(request.getParameter("talktitle"), request.getParameter("email")))
		{
			status = "Successfully Registered";
			session.setAttribute("talkRegistrationStatus", status);
			session.setAttribute("registeredTalk", request.getParameter("talktitle"));
			response.sendRedirect("homepage.jsp");
		}
		else
		{
			status = "Already Registered";
			session.setAttribute("talkRegistrationStatus", status);
			response.sendRedirect("homepage.jsp");
		}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}

}

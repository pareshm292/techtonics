package com.admin.servicesservlet;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.adminservices.AdminServicesDao;
import com.dao.requests.TechTalkRequest;
import com.model.TechTalk;

/**
 * Servlet implementation class NewTechTalk
 */
@WebServlet("/AddNewTalk")
public class NewTechTalk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewTechTalk() {
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
		try {
			
			boolean requestStatus = AdminServicesDao.addNewTalk(new TechTalk(request.getParameter("talktitle"),
										request.getParameter("description"), 
										request.getParameter("name"), 
										Date.valueOf(request.getParameter("date"))));
			System.out.println(requestStatus);	
			if(requestStatus){
				request.setAttribute("requestStatus", "New Talk -"+request.getParameter("talktitle")+
													" on date "+request.getParameter("date")+" is added.");
			}
			else{
				request.setAttribute("requestStatus", "New Talk - "+request.getParameter("talktitle")+
						" on date "+request.getParameter("date")+" is unsuccessful.");
			}
			request.getRequestDispatcher("GetTechTalks").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}

}

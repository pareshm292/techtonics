package com.requests;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.requests.TechTalkRequest;

/**
 * Servlet implementation class RequestForTalk
 */
@WebServlet("/RequestForTalk")
public class RequestForTalk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestForTalk() {
    	super();
    	System.out.println("Request for talk..");
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//HttpSession session = request.getSession();
		try {
		
			boolean requestStatus = TechTalkRequest.requestTalk(request.getParameter("name"),
										request.getParameter("talktitle"), 
										request.getParameter("description"), 
										Date.valueOf(request.getParameter("date")));
			System.out.println(requestStatus);	
			if(requestStatus){
				request.setAttribute("requestStatus", "Request for "+request.getParameter("talktitle")+
													" on date "+request.getParameter("date")+" is made.");
			}
			else{
				request.setAttribute("requestStatus", "Request for "+request.getParameter("talktitle")+
						" on date "+request.getParameter("date")+" is unsuccessful.");
			}
			request.getRequestDispatcher("homepage.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

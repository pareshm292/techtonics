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
        // TODO Auto-generated constructor stub
    }

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
		
			TechTalkRequest.requestTalk(request.getParameter("name"),
										request.getParameter("talktitle"), 
										request.getParameter("description"), 
										Date.valueOf(request.getParameter("date")));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

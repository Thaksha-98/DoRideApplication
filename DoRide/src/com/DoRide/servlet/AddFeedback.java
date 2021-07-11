package com.DoRide.servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DoRide.model.Feedback;
import com.DoRide.service.FeedbackServiceImpl;

/**
 * Servlet implementation class AddFeedback
 */
@WebServlet("/AddFeedback")
public class AddFeedback extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFeedback() {
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
		//doGet(request, response);
		
		PrintWriter r = response.getWriter();
		r.print(request.getParameter("nic"));
		
		
		Feedback feedback = new Feedback();
		feedback.setNic(request.getParameter("nic")); 
		feedback.setName(request.getParameter("name"));
		feedback.setEmail(request.getParameter("email"));
		feedback.setComments(request.getParameter("comments"));
		feedback.setRate(request.getParameter("rate")); 
		
		
		
		FeedbackServiceImpl impl = new FeedbackServiceImpl();
		try {
		impl.addFeedback(feedback);                                     	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			r.print(e);
		} 
		
		
		
	}

}

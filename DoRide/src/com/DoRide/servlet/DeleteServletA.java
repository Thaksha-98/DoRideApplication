package com.DoRide.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DoRide.service.CustomerService;
import com.DoRide.service.ICustomerService;


/**
 * Servlet implementation class DeleteServletA
 */
@WebServlet("/DeleteServletA")
public class DeleteServletA extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServletA() {
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
		response.setContentType("text/html");
		
		String Nic= (String)request.getParameter("Nic");
		
		ICustomerService cusService = new CustomerService();
		cusService.deleteCustomer(Nic);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/CustomerProfile.jsp");  //redirects the page to customer profile
		dispatcher.forward(request, response);
	}

}
		



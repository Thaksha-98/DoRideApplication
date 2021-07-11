package com.DoRide.servlet;

import java.io.IOException;




import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DoRide.model.Customer;
import com.DoRide.service.CustomerService;
import com.DoRide.service.ICustomerService;


/**
 * Servlet implementation class UpdateServletA
 */
@WebServlet("/UpdateServletA")
public class UpdateServletA extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServletA() {
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
		
		Customer customer = new Customer();
		String Nic = request.getParameter("Nic");
		customer.setNic(Nic);
		
		

		
		
		customer.setName(request.getParameter("Name"));
		customer.setEmail(request.getParameter("Email"));
		customer.setMobile(request.getParameter("Mobile"));
		customer.setAddress(request.getParameter("Address"));
		customer.setUsername(request.getParameter("Username"));
		customer.setPassword(request.getParameter("Password"));

		ICustomerService custService = new CustomerService();
		custService.updateCustomer(customer);
		
		RequestDispatcher dispatcher =getServletContext().getRequestDispatcher("/CustomerProfile.jsp");  //redirects the page to customer profile
		dispatcher.forward(request, response);
		
	}

}
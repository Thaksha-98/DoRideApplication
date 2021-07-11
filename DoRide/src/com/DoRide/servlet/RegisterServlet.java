package com.DoRide.servlet;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DoRide.model.Customer;
import com.DoRide.service.IRegisterService;
import com.DoRide.service.RegisterService;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register-servlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		
		

		PrintWriter r = response.getWriter();
		r.print(request.getParameter("Nic"));
		
	
			
			Customer customer = new Customer();
			
			customer.setNic(request.getParameter("Nic"));
			customer.setName(request.getParameter("Name"));
			customer.setEmail(request.getParameter("Email"));
			customer.setMobile(request.getParameter("Mobile"));
			customer.setAddress(request.getParameter("Address"));
			customer.setUsername(request.getParameter("Username"));
			customer.setPassword(request.getParameter("Password"));
			
			
			
			IRegisterService registrationService = new RegisterService();
			
			try {
				registrationService.registrationService(customer);  
				
				response.sendRedirect("Register.jsp");  //redirects the page to register 
				} catch (Exception e) {
					// TODO Auto-generated catch block
					r.print(e);
				} 
				
				
				
			}

		}



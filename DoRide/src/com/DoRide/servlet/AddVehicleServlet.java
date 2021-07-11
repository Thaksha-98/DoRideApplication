package com.DoRide.servlet;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DoRide.model.Vehicle;
import com.DoRide.service.IVehicleService;
import com.DoRide.service.VehicleServiceImpl;

/**
 * Servlet implementation class AddVehicleServlet
 */
@WebServlet("/AddVehicleServlet")
public class AddVehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddVehicleServlet() {
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
		
		
		
		
		Vehicle vehicle = new Vehicle();
		
		vehicle.setRegistrationNum(request.getParameter("registrationNum"));
		vehicle.setVehicleName(request.getParameter("vehicleName")); 
		vehicle.setType(request.getParameter("type"));
		vehicle.setDescription(request.getParameter("description"));
		vehicle.setRatePerDay(request.getParameter("ratePerDay")); 
		
		System.out.println("vehicle name is"+request.getParameter("vehicleName"));
		
		IVehicleService iVehicleService = new VehicleServiceImpl();
		iVehicleService.addVehicle(vehicle); 
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Dashboard.jsp");
		dispatcher.forward(request, response);

	}

}



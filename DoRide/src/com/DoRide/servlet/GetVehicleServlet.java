package com.DoRide.servlet;

import java.io.IOException;

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
 * Servlet implementation class GetVehicleServlet
 */
@WebServlet("/GetVehicleServlet")
public class GetVehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetVehicleServlet() {
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
		response.setContentType("text/html");

 		String registrationNum = request.getParameter("registrationNum");			
		IVehicleService iVehicleService = new VehicleServiceImpl();
		Vehicle vehicle = iVehicleService.getVehicle(registrationNum);

		request.setAttribute("vehicle", vehicle);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("UpdateVehicle.jsp");
		dispatcher.forward(request, response);	}

}

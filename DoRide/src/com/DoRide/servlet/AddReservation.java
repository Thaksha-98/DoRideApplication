package com.DoRide.servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DoRide.model.Reservation;
import com.DoRide.service.ReservationServiceImpl;


/**
 * Servlet implementation class AddReservation
 */
@WebServlet("/AddReservation")
public class AddReservation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddReservation() {
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
        r.print(request.getParameter("pickuplocation"));
        
        
		Reservation reservation = new Reservation();
		reservation.setPickuplocation(request.getParameter("pickuplocation"));
		reservation.setPickupdate(request.getParameter("pickupdate"));
		reservation.setPickuptime(request.getParameter("pickuptime"));
		reservation.setDropofflocation(request.getParameter("dropofflocation"));
		reservation.setReturndate(request.getParameter("returndate"));
		reservation.setReturntime(request.getParameter("returntime"));
		reservation.setAdditionalinfo(request.getParameter("additionalinfo"));
	
		
		ReservationServiceImpl impl = new ReservationServiceImpl();

		try {
			impl.addReservation(reservation);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			r.print(e);
		} 
		
		
		
	}

}

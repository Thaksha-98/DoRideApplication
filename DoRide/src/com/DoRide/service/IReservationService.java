package com.DoRide.service;


import java.sql.SQLException;



import com.DoRide.model.Reservation;


public interface IReservationService {
	
	public void addReservation(Reservation reservation) throws SQLException, ClassNotFoundException;
	


}

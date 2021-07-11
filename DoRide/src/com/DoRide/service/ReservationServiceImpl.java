package com.DoRide.service;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import com.DoRide.model.Reservation;
import com.DoRide.conUtil.DBConUtil;
import com.DoRide.conUtil.DBConUtil;

public class ReservationServiceImpl implements IReservationService {

	
	private static Connection connection;
	private static Statement st;
	private static PreparedStatement ps;
	
	
	
	
	@Override
	public void addReservation(Reservation reservation) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
	
		DBConUtil DB = new DBConUtil();
	    connection = DB. createCon();		 
	    ps =connection.prepareStatement("insert into Reservation values (?,?,?,?,?,?,?)");
		
		ps.setString(1, reservation.getPickuplocation());
		ps.setString(2, reservation.getPickupdate());
		ps.setString(3, reservation.getPickuptime());
		ps.setString(4, reservation.getDropofflocation());
		ps.setString(5, reservation.getReturndate());
		ps.setString(6, reservation.getReturntime());
		ps.setString(7, reservation.getAdditionalinfo());
		
		
		ps.execute();
		ps.close();

		
		 
		 
		 
		
	}
	
	
	
}

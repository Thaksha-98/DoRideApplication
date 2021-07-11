package com.DoRide.service;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.DoRide.model.Customer;
import com.DoRide.conUtil.DBConUtil;



public class RegisterService implements IRegisterService {
	
	
	private static Connection connection;
	//private static Statement st;
	private static PreparedStatement ps;
	
	
	
	@Override
	public void registrationService(Customer customer) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
	
		DBConUtil DB = new DBConUtil();
	    connection = DB. createCon();    
    ps =connection.prepareStatement("insert into Register values (?,?,?,?,?,?,?)");
	
	ps.setString(1, customer.getNic());
	ps.setString(2, customer.getName());
	ps.setString(3, customer.getEmail());
	ps.setString(4, customer.getMobile());
	ps.setString(5, customer.getAddress());
	ps.setString(6, customer.getUsername());
	ps.setString(7, customer.getPassword());
	
	
	ps.execute();
	ps.close();
	
	}


}

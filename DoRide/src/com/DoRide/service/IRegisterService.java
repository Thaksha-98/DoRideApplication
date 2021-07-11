package com.DoRide.service;


import java.sql.SQLException;

import com.DoRide.model.Customer;


public interface IRegisterService {
	
	public void registrationService(Customer customer) throws SQLException, ClassNotFoundException  ;
	
}

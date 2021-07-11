package com.DoRide.service;

import java.util.ArrayList;
import java.util.logging.Logger;

import com.DoRide.model.Customer;


public interface ICustomerService {
	
	public static final Logger log = Logger.getLogger(ICustomerService.class.getName());  
	
	public ArrayList<Customer> selectAllCustomers();
	
	public void updateCustomer(Customer customer);
	
	public void deleteCustomer(String Nic);
	
	public Customer getCustomer(String Nic);


}

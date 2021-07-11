package com.DoRide.service;

import java.sql.Connection;




import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.DoRide.model.Customer;
import com.DoRide.conUtil.DBConUtil;
import com.DoRide.conUtil.TCommonConstants;


public class CustomerService implements ICustomerService {
	
	public static final Logger log = Logger.getLogger(CustomerService.class.getName());  //implementing loggers
	
	
	
	public void deleteCustomer(String Nic) {  //delete customer details
		
		try {
		DBConUtil dbConnection = new DBConUtil();  //creating connection
		@SuppressWarnings("static-access")
		Connection con = dbConnection.createCon();
		
		String sql = "delete from Register where Nic=?";
		PreparedStatement preparedStatement = con.prepareStatement(sql);  //Statement is used to write queries
		
		preparedStatement.setString(TCommonConstants.COLUMN_INDEX_ONE, Nic);  //common constant is used 
		preparedStatement.executeUpdate();
		
		}catch (Exception e) {
			
		}
		
	}
	
	public Customer getCustomer(String Nic) {  //retrieve customer details based on NIC
		
		Customer customer = new Customer();
		
		try {
		
			DBConUtil dbConnection = new DBConUtil();  //creating connection
			@SuppressWarnings("static-access")
			Connection con = dbConnection.createCon();
		
		PreparedStatement preparedStatement = null; 
		ResultSet resultset = null;
		
		
		
		
			
			String sql = "select * from Register where Nic=?";
			preparedStatement = con.prepareStatement(sql);  //Statement is used to write queries
			preparedStatement.setString(TCommonConstants.COLUMN_INDEX_ONE, Nic); //common constant is used
			resultset = preparedStatement.executeQuery();  //execution of query
			
			while(resultset.next()) {
				
				customer.setNic(resultset.getString("Nic"));
				customer.setName(resultset.getString("Name"));
				customer.setEmail(resultset.getString("Email"));
				customer.setMobile(resultset.getString("Mobile"));
				customer.setAddress(resultset.getString("Address"));
				customer.setUsername(resultset.getString("Username"));
				customer.setPassword(resultset.getString("Password"));
			}
		} catch(Exception e) {
			log.log(Level.SEVERE, e.getMessage());
		}
		
		return customer;
	}
	
	public ArrayList<Customer> selectAllCustomers(){  //list of customers are listed on array
		
		ArrayList<Customer> arrayList = new ArrayList<>();

		
		try {
			
			DBConUtil dbConnection = new DBConUtil();  //creating connection
			@SuppressWarnings("static-access")
			Connection con = dbConnection.createCon();
			
			PreparedStatement preparedStatement = null;
			ResultSet rs = null;
			
			
			
				
				String sql = "select * from Register";
				preparedStatement = con.prepareStatement(sql);  //Statement is used to write queries
				rs = preparedStatement.executeQuery();  //execution of query
				
				while(rs.next()) {
					
					Customer customer = new Customer();
					
					customer.setNic(rs.getString("Nic"));
					customer.setName(rs.getString("Name"));
					customer.setEmail(rs.getString("Email"));
					customer.setMobile(rs.getString("Mobile"));
					customer.setAddress(rs.getString("Address"));
					customer.setUsername(rs.getString("Username"));
					customer.setPassword(rs.getString("password"));
					
					arrayList.add(customer);
				}

			}catch(Exception e) {
				log.log(Level.SEVERE, e.getMessage());
				
			}
		return arrayList;
		}

	
	public void updateCustomer(Customer customer) {
		
		try {
			
			DBConUtil dbConnection = new DBConUtil();  //creating connection
			@SuppressWarnings("static-access")
			Connection con = dbConnection.createCon();
			
			PreparedStatement preparedStatement = null;
			
			
			
			
			String sql = "update Register set Name=?, Email=?, Mobile=?, Address=?, Username=?, Password=? where Nic=?";
			preparedStatement = con.prepareStatement(sql);  //Statement is used to write queries
			
			
			preparedStatement.setString(TCommonConstants.COLUMN_INDEX_ONE, customer.getName()); //common constant is used
			preparedStatement.setString(TCommonConstants.COLUMN_INDEX_TWO, customer.getEmail());
			preparedStatement.setString(TCommonConstants.COLUMN_INDEX_THREE, customer.getMobile());
			preparedStatement.setString(TCommonConstants.COLUMN_INDEX_FOUR, customer.getAddress());
			preparedStatement.setString(TCommonConstants.COLUMN_INDEX_FIVE, customer.getUsername());
			preparedStatement.setString(TCommonConstants.COLUMN_INDEX_SIX, customer.getPassword());
			preparedStatement.setString(TCommonConstants.COLUMN_INDEX_SEVEN, customer.getNic());
			
		
			

			preparedStatement.executeUpdate();
			
		}catch(Exception e) {
			log.log(Level.SEVERE, e.getMessage());
		}
	}
	


}



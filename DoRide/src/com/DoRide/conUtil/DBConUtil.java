package com.DoRide.conUtil;

import java.sql.Connection;

import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.DoRide.service.IVehicleService;

public class DBConUtil {
	
	public static final Logger log = Logger.getLogger(IVehicleService.class.getName());

	
	 public static Connection createCon()
	 {
		
	 Connection con = null;
	 String url = "jdbc:sqlserver://localhost:1433;databaseName=sample"; //MySQL URL followed by the database name
	 String username = "root"; //MySQL username
	 String password = "root"; //MySQL password
	 
	 try 
	 {
	 try 
	 {
	 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //loading MySQL drivers. This differs for database servers 
	 } 
	 catch (ClassNotFoundException e)
	 {
		log.log(Level.SEVERE, e.getMessage());
	 }
	 
	 con = DriverManager.getConnection(url, username, password); //attempting to connect to MySQL database
	
	 } 
	 catch (Exception e) 
	 {
		log.log(Level.SEVERE, e.getMessage());
	 }
	 
	 return con; 
	 }

}


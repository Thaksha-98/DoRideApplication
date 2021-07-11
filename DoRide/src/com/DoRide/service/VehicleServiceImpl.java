package com.DoRide.service;

import java.sql.Connection;


import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.DoRide.model.Vehicle;
import com.DoRide.conUtil.DBConUtil;
import com.DoRide.conUtil.TCommonConstants;


public class VehicleServiceImpl implements IVehicleService {

	//Initialize logger
	public static final Logger log = Logger.getLogger(VehicleServiceImpl.class.getName());
	
	
	//Add set of vehicles
	public void addVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		
	DBConUtil dbConUtil = new DBConUtil();
	@SuppressWarnings("static-access")
	Connection con = dbConUtil.createCon();
		
	String sql = "insert into vehicle values(?,?,?,?,?)";
		
	try {
    con = DBConUtil.createCon();
    PreparedStatement preparedStatement = null;
    
    preparedStatement =con.prepareStatement(sql);
    preparedStatement.setString(TCommonConstants.COLUMN_INDEX_ONE, vehicle.getRegistrationNum());
    preparedStatement.setString(TCommonConstants.COLUMN_INDEX_TWO, vehicle.getVehicleName());
    preparedStatement.setString(TCommonConstants.COLUMN_INDEX_THREE, vehicle.getType());
    preparedStatement.setString(TCommonConstants.COLUMN_INDEX_FOUR, vehicle.getDescription());
    preparedStatement.setString(TCommonConstants.COLUMN_INDEX_FIVE, vehicle.getRatePerDay());
    // Add vehicle
    preparedStatement.execute();
    con.commit();
	

	}catch(Exception e) {
		log.log(Level.SEVERE, e.getMessage());
	}
  }
	

	/*
	  This method delete a vehicle based on the provided registrationNum
	 
	  @param registrationNum
	             - Delete vehicle according to the filtered vehicle details
	 */
	public void deleteVehicle(String registrationNum) {
		
		try {
		DBConUtil dbConUtil = new DBConUtil();
		@SuppressWarnings("static-access")
		Connection con = dbConUtil.createCon();
		
		String sql = "delete from vehicle where registrationNum=?";
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		
		preparedStatement.setString(TCommonConstants.COLUMN_INDEX_ONE, registrationNum);
		preparedStatement.executeUpdate();
		
		}catch (Exception e) {
			
		}
		
	}
	
	/*
	  Vehicle details can be retrieved based on the provided registration number
	  
	  @param registrationNum
	             - Vehicle details are filtered based on the registrationNum
	 */
	
	public Vehicle getVehicle(String registrationNum) {
		
		DBConUtil dbConUtil = new DBConUtil();
		@SuppressWarnings("static-access")
		Connection con = dbConUtil.createCon();
		
		PreparedStatement preparedStatement = null;
		ResultSet resultset = null;
		
		Vehicle vehicle = new Vehicle();
		
		try {
			
			String sql = "select * from vehicle where registrationNum=?";
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(TCommonConstants.COLUMN_INDEX_ONE, registrationNum);
			resultset = preparedStatement.executeQuery();
			
			while(resultset.next()) {
				
				vehicle.setRegistrationNum(resultset.getString("registrationNum"));
				vehicle.setVehicleName(resultset.getString("vehicleName"));
				vehicle.setType(resultset.getString("type"));
				vehicle.setDescription(resultset.getString("description"));
				vehicle.setRatePerDay(resultset.getString("ratePerDay"));
			}
		} catch(Exception e) {
			log.log(Level.SEVERE, e.getMessage());
		}
		
		return vehicle;
	}
	
	/*
	  Get all list of vehicles
	  
	  @return ArrayList<Vehicle> 
	  						- Array of vehicle list will be return
	 */
	public ArrayList<Vehicle> selectAllVehicles(){
		
		DBConUtil dbConUtil = new DBConUtil();
		@SuppressWarnings("static-access")
		Connection con = dbConUtil.createCon();
		
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		
		ArrayList<Vehicle> arrayList = new ArrayList<>();
		
		try {
			
			String sql = "select * from vehicle";
			preparedStatement = con.prepareStatement(sql);
			rs = preparedStatement.executeQuery();
			
			while(rs.next()) {
				
				Vehicle vehicle = new Vehicle();
				
				vehicle.setRegistrationNum(rs.getString("registrationNum"));
				vehicle.setVehicleName(rs.getString("vehicleName"));
				vehicle.setType(rs.getString("type"));
				vehicle.setDescription(rs.getString("description"));
				vehicle.setRatePerDay(rs.getString("ratePerDay"));
				
				arrayList.add(vehicle);
			}

		}catch(Exception e) {
			log.log(Level.SEVERE, e.getMessage());
			
		}
		
		return arrayList;
	}
	
	
	/*
	  Get the updated vehicle
	  
	  @param registrationNum
	             registrationNum of the vehicle to select from the list
	 */
	public void updateVehicle(Vehicle vehicle) {
		
		try {
			
			DBConUtil dbConUtil = new DBConUtil();
			@SuppressWarnings("static-access")
			Connection con = dbConUtil.createCon();
			
			PreparedStatement preparedStatement = null;
			ResultSet resultset = null;
			
			String sql = "update vehicle set vehicleName=?, type=?, description=?, ratePerDay=? where registrationNum=?";
			preparedStatement = con.prepareStatement(sql);
			
			preparedStatement.setString(TCommonConstants.COLUMN_INDEX_ONE, vehicle.getVehicleName());
			preparedStatement.setString(TCommonConstants.COLUMN_INDEX_TWO, vehicle.getType());
			preparedStatement.setString(TCommonConstants.COLUMN_INDEX_THREE, vehicle.getDescription());
			preparedStatement.setString(TCommonConstants.COLUMN_INDEX_FOUR, vehicle.getRatePerDay());
			preparedStatement.setString(TCommonConstants.COLUMN_INDEX_FIVE, vehicle.getRegistrationNum());

			preparedStatement.executeUpdate();
			
		}catch(Exception e) {
			log.log(Level.SEVERE, e.getMessage());
		}
	}
}

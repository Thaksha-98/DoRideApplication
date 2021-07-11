package com.DoRide.service;

import java.util.ArrayList;
import java.util.logging.Logger;

import com.DoRide.model.Vehicle;
import java.util.logging.Logger;

public interface IVehicleService {
	
	public static final Logger log = Logger.getLogger(IVehicleService.class.getName());

	public void addVehicle(Vehicle vehicle);
	
	public ArrayList<Vehicle> selectAllVehicles();
	
	public void updateVehicle(Vehicle vehicle);
	
	public void deleteVehicle(String registrationNum);
	
	public Vehicle getVehicle(String registrationNum);


}

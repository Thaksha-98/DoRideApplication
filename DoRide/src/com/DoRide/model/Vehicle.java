package com.DoRide.model;

public class Vehicle {

	private String registrationNum;
	
	private String vehicleName;
	
	private String type;
	
	private String description;
	
	private String ratePerDay;
	

	public String getRegistrationNum() {
		return registrationNum;
	}

	public void setRegistrationNum(String registrationNum) {
		this.registrationNum = registrationNum;
	}
	
	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRatePerDay() {
		return ratePerDay;
	}

	public void setRatePerDay(String ratePerDay) {
		this.ratePerDay = ratePerDay;
	}
	
	@Override
	public String toString() {
		
		return "Registration Number = " + registrationNum + "\n" + "Vehicle Name = " + vehicleName + "\n"
				+ "Type = " + type + "\n" + "Description = " + description + "\n" + "Rate Per Day = "
				+ ratePerDay;
	}
	

}

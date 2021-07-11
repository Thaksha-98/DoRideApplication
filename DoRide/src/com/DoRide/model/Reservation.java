package com.DoRide.model;

public class Reservation {
	
	

	private String pickuplocation;
	
	private String pickupdate;

	private String pickuptime;
	
    private String dropofflocation;
	
	private String returndate;

	private String returntime;

	private String additionalinfo;
	
	

	public String getPickuplocation() {
		return pickuplocation;
	}

	public void setPickuplocation(String pickuplocation) {
		this.pickuplocation = pickuplocation;
	}

	public String getPickupdate() {
		return pickupdate;
	}

	public void setPickupdate(String pickupdate) {
		this.pickupdate = pickupdate;
	}

	public String getPickuptime() {
		return pickuptime;
	}

	public void setPickuptime(String pickuptime) {
		this.pickuptime = pickuptime;
	}
	
	
	
	
	

	public String getDropofflocation() {
		return dropofflocation;
	}

	public void setDropofflocation(String dropofflocation) {
		this.dropofflocation = dropofflocation;
	}

	public String getReturndate() {
		return returndate;
	}

	public void setReturndate(String returndate) {
		this.returndate = returndate;
	}
	
	public String getReturntime() {
		return returntime;
	}

	public void setReturntime(String returntime) {
		this.returntime = returntime;
	}
	
	
	public String getAdditionalinfo() {
		return additionalinfo;
	}

	public void setAdditionalinfo(String additionalinfo) {
		this.additionalinfo = additionalinfo;
	}

	
	@Override
	public String toString() {
		
		return "Pickuplocation = " + pickuplocation + "\n" + "Pickupdate = " + pickupdate + "\n" + "Pickuptime = " + pickuptime + "\n"
				+ "Dropofflocation = " + dropofflocation + "\n" + "Returndate = " + returndate + "\n" + "Returntime = " + returntime 
				+ "\n" +"Additionalinfo = " + additionalinfo;
		
		
	}

}

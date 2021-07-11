package com.DoRide.model;

public class Feedback {
	
	private String nic;

	private String name;
	
	private String email;

	private String comments;

	private String rate;
	
	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}


	
	@Override
	public String toString() {
		
		return "Nic = " + nic + "\n" + "Name = " + name + "\n" + "Email = " + email + "\n" + "Comments = " + comments + "\n"
				+ "Rate = " + rate;
	}
	
	

}

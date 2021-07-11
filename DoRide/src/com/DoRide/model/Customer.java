package com.DoRide.model;


public class Customer {
	
	private String Nic;
	
	private String Name;
	
	private String Email;
	
	private String Mobile;
	
	private String Address;
	
	private String Username;
	
	private String Password;

	

	
	public String getNic() {
		return Nic;
	}


	public void setNic(String Nic) {
		this.Nic = Nic;
	}


	public String getName() {
		return Name;
	}


	public void setName(String Name) {
		this.Name = Name;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String Email) {
		this.Email = Email;
	}


	public String getMobile() {
		return Mobile;
	}


	public void setMobile(String Mobile) {
		this.Mobile = Mobile;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String Address) {
		this.Address = Address;
	}


	public String getUsername() {
		return Username;
	}

	public void setUsername(String Username) {
		this.Username = Username;
	}


	public String getPassword() {
		return Password;
	}

	public void setPassword(String Password) {
		this.Password = Password;
	}





	@Override
	public String toString() {
		
		return "NIC = " + Nic + "\n" + "Name = " + Name + "\n"
				 + "Email = " + Email + "\n" + "Mobile = " + Mobile + "\n" + "Address = "
				+ Address + "\n" + "Username = "+ Username + "\n" + "Password = "+ Password;
	}
}

package com.DoRide.service;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.DoRide.conUtil.DBConUtil;

public class LoginService {

	String sql = "select username,password from users where username=? and password=?";
	
	public boolean check(String uname, String pass)
	 {
	 
	 try
	 {
	 Connection con = DBConUtil.createCon(); //establishing connection
	 PreparedStatement st = con.prepareStatement(sql); //Statement is used to write queries. Read more about it.
	 st.setString(1, uname);
	 st.setString(2, pass);
	 ResultSet rs = st.executeQuery(); //Here table name is users and userName,password are columns. fetching all the records and storing in a resultSet.
	 if(rs.next()) {
		 return true;
	 }

	 }	 catch (Exception e) 
	 {
	 e.printStackTrace();
	 }
	 
	 return false;
	 }		 
}

package com.DoRide.service;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.IOException;
import java.sql.SQLException;

import com.DoRide.conUtil.DBConUtil;
import com.DoRide.model.Feedback;
import com.DoRide.conUtil.TCommonConstants;
import com.DoRide.service.IFeedbackService;

public class FeedbackServiceImpl implements IFeedbackService {

	private static Connection connection;
	private static Statement st;
	private static PreparedStatement ps,ps1,ps2,ps3;
	private static ResultSet rs;
	
	@Override
	public void addFeedback(Feedback feedback) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
	DBConUtil DB = new DBConUtil();
    connection = DB. createCon();
    ps =connection.prepareStatement("insert into Feedback values(?,?,?,?,?)");
	ps.setString(1, feedback.getNic());
	ps.setString(2, feedback.getName());
	ps.setString(3, feedback.getEmail());
	ps.setString(4, feedback.getComments());
	ps.setString(5, feedback.getRate());
	
	ps.execute();
	ps.close();

	}

	@Override
	public void getFeedbackByNic(String nic) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
	  
		Feedback feedback =new Feedback();  
		
		DBConUtil DB = new DBConUtil();
	    connection = DB. createCon();
	    ps1 =connection.prepareStatement("select* from Feedback where nic=?");
		
		ps1.setString(1,nic);  
		
		rs = ps1.executeQuery(); 
	    
		while(rs.next()) {
			
			feedback.setNic(rs.getString(1));
			feedback.setName(rs.getString(2));
			feedback.setEmail(rs.getString(2));
			feedback.setComments(rs.getString(2));
			feedback.setRate(rs.getString(2));
			
		
		}
		
		return ;
		
	}



	@Override
	public Feedback updateFeedback(String nic, Feedback feedback) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		DBConUtil DB = new DBConUtil();
	    connection = DB. createCon();
	    ps2 =connection.prepareStatement("update Feedback set name=?,email =?,comments=?,rate=? where nic=?");
		
		ps2.setString(2, feedback.getName()); 
        ps2.setString(1, feedback.getEmail());  
        ps2.setString(3, feedback.getComments());  
        ps2.setString(4, feedback.getRate());  
        ps2.setString(5, feedback.getNic()); 
          
        ps2.executeUpdate();  
        ps2.close();  
		
		
		return null;
	}



	@Override
	public void removeFeedback(String nic) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		DBConUtil DB = new DBConUtil();
	    connection = DB. createCon();
	    ps3 =connection.prepareStatement("delete from Feedback where nic=? ");
		
		ps3.setString(1,nic);  
		
		ps3.executeUpdate();  
		ps3.close();  
		
	}

	
   
	
	
	
}


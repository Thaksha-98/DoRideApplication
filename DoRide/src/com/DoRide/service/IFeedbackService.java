package com.DoRide.service;


import java.sql.SQLException;



import com.DoRide.model.Feedback;

public interface IFeedbackService {
	
	
public void addFeedback(Feedback feedback) throws SQLException, ClassNotFoundException  ;
	
public Feedback updateFeedback(String nic, Feedback feedback) throws SQLException, ClassNotFoundException;

public void removeFeedback(String nic) throws SQLException, ClassNotFoundException;

void getFeedbackByNic(String nic) throws SQLException, ClassNotFoundException;



}

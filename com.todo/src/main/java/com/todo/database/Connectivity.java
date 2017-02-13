package com.todo.database;

import java.sql.*;
import java.util.ArrayList;
import com.todo.module.Activity;

public class Connectivity {
	String url = "jdbc:mysql://localhost:3306/todo";
	String username = "root";
	String password ="mensinkai";
	Connection myConn;
	Statement myStmt;
	ResultSet myRs;
		
	@SuppressWarnings("finally")
	public ArrayList<Activity> getActivity(){
		
		ArrayList<Activity> activities = new ArrayList<Activity>();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			myConn = DriverManager.getConnection(url, username, password);
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery("select * from activity");
			while(myRs.next()){
				Activity activity = new Activity();
				activity.setActivityid(myRs.getInt("article_id"));
				activity.setUserid(myRs.getInt("user_id"));
				activity.setTitle(myRs.getString("article_title"));
				activity.setStatus(myRs.getString("article_status"));
				activity.setDate(myRs.getDate("created_date"));
				activities.add(activity);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			return activities;			
		}
		
	}
	
	public void addActivity(Activity activity){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			myConn = DriverManager.getConnection(url, username, password);
			myStmt = myConn.createStatement();
			String sql ="insert into activity(user_id,article_title,article_status,created_date) values(1,'"+activity.getTitle()+"','Open',NOW());";
			myStmt.executeUpdate(sql);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void updateActivity(Activity activity){
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			myConn = DriverManager.getConnection(url, username, password);
			myStmt = myConn.createStatement();
			String sql1 ="update activity set article_status='"+activity.getStatus()+"' where article_id = "+activity.getActivityid()+";";
			String sql2 ="update activity set article_title='"+activity.getTitle()+"' where article_id = "+activity.getActivityid()+";";
			myStmt.executeUpdate(sql1);
			myStmt.executeUpdate(sql2);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public void deleteActivity(int activityId){
		
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			myConn = DriverManager.getConnection(url, username, password);
			myStmt = myConn.createStatement();
			String sql ="delete from activity where article_id="+activityId+";";
			myStmt.executeUpdate(sql);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}


}





/**
 * 
 */
package com.todo.module;

import java.util.Date;

/**
 * @author shren
 *
 */
public class Activity {
	
	public int userid;
	public int activityid;
	public String title;
	public String Status="OPEN";
	public Date date; 
		
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public double getActivityid() {
		return activityid;
	}
	public void setActivityid(int activityid) {
		this.activityid = activityid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	

}

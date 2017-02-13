/**
 * 
 */
package com.todo.service;

import java.util.ArrayList;
import com.todo.database.Connectivity;

import com.todo.database.Database;
import com.todo.module.Activity;


/**
 * @author shren
 *
 */
public class Activityservice{

		ArrayList<Activity> activities = Database.getActivity();
		Connectivity connectivity = new Connectivity();
		
		public ArrayList<Activity> get(){
			
			return connectivity.getActivity();
		}
		
		public Activity add(String title){
			Activity b = new Activity();
			
			b.setTitle(title);
			b.setUserid(1);
			connectivity.addActivity(b);
			return b;
		}
		
		public void update(Activity activity){
				connectivity.updateActivity(activity);
				
		}
		
		public void delete(int activityId){
			connectivity.deleteActivity(activityId);
		}
}

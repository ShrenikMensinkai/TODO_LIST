/**
 * 
 */
package com.todo.resource;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.todo.module.Activity;
import com.todo.service.Activityservice;

/**
 * @author shren
 *
 */
@Path("/todo")


public class Activityresource {
	
	Activityservice activityservice = new Activityservice();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Activity> getActivity(){
		return activityservice.get();
	}
	
	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	public Activity addActivity(String title){
		return activityservice.add(title);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void updateActivity(Activity activity){
		activityservice.update(activity);
	}
	
	@DELETE
	@Consumes(MediaType.TEXT_PLAIN)
	public void deleteActivity(int activityId){
		activityservice.delete(activityId);
		
	}
	
}


	package Test;

import java.util.ArrayList;

import com.todo.database.Connectivity;
import com.todo.module.Activity;
import com.todo.resource.Activityresource;
import com.todo.service.Activityservice;


public class Test {

	public static void main(String[] args) {
		Connectivity con = new Connectivity();
		Activityservice as = new Activityservice();
		ArrayList<Activity> ar = new ArrayList<Activity>();
		Activityresource aar = new Activityresource(); 
		aar.addActivity("meet girlfriend");
		
				
				
	}
}
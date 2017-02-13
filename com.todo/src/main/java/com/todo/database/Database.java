/**
 * 
 */
package com.todo.database;

import java.util.ArrayList;

import com.todo.module.Activity;

/**
 * @author shren
 *
 */
public class Database {
	
	public static ArrayList<Activity> activity = new ArrayList<Activity>();
	
	public static ArrayList<Activity> getActivity()
	{
		return activity;
	}
	
}

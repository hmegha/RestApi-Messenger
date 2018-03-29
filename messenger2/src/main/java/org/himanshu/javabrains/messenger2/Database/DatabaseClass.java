package org.himanshu.javabrains.messenger2.Database;

import java.util.HashMap;
import java.util.Map;

import org.himanshu.javabrains.messenger2.model.Message;
import org.himanshu.javabrains.messenger2.model.Profile;

public class DatabaseClass {

	private static Map<Long,Message> messages=new HashMap<>();
	private static Map<Long,Profile> profiles=new HashMap<>();
	
	public static Map<Long,Message> getMessages()
	{
		return messages;		
	}
	
	public static Map<Long,Profile> Profiles()
	{
		return profiles;		
	}
	
	
}

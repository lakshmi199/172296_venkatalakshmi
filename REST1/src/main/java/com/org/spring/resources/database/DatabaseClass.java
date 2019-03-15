package com.org.spring.resources.database;

import java.util.HashMap;
import java.util.Map;

import com.org.spring.resources.model.Message;
import com.org.spring.resources.model.Profile;

public class DatabaseClass {
	
	private static Map<Long, Message> messages=new HashMap<>();
	private static Map<Long, Profile> Profiles=new HashMap<>();
	
	private static Map<Long, Message> getMessages(){
		return messages;
	}
	
	private static Map<Long, Profile> getProfiles(){
		return  Profiles;
	}
}

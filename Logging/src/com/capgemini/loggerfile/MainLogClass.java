package com.capgemini.loggerfile;

import java.util.logging.Level;
import java.util.logging.Logger;
public class MainLogClass {

	public static void main(String[] args) {
		try {
			Logging my_log = new Logging("log.txt");
			 my_log.logger.setLevel(Level.SEVERE);
			 my_log.logger.severe("Severe");
			 my_log.logger.info("Info");
			my_log.logger.warning("Warning");
			my_log.logger.config("Config");
			my_log.logger.fine("fine");
			 
			 
		}catch(Exception e) {
			
		}
	}
}

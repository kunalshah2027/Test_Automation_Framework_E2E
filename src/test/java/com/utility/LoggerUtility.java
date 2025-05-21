package com.utility;



import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class LoggerUtility {
	
	private static Logger logger;
	
	private LoggerUtility(){
		
	}

	public static Logger getLogger(Class<?> clazz) {
		if (logger == null){
			logger = LogManager.getLogger(clazz);
		}
		return logger;
	}
	


}

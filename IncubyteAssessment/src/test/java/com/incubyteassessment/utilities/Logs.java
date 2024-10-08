package com.incubyteassessment.utilities;


import org.apache.logging.log4j.*;

import com.aventstack.extentreports.model.Log;

public class Logs {

	public static Logger  log = LogManager.getLogger(Log.class.getName());
	
	public static void startTestCase(String stestCaseName) {
			log.info("==========="+stestCaseName+"Test Starts"+"===============");
	}
	
	
	public static void endTestCase(String stestCaseName) {
		log.info("==========="+stestCaseName+"Test Ends"+"===============");
	}

	public static void info(String message) {
		log.info(message);
	}

	public static void warn(String message) {
		log.warn(message);
	}

	public static void error(String message) {
		log.error(message);
	}
	
	public static void debug(String message) {
		log.debug(message);
	}
	
	public static void fatal(String message) {
		log.fatal(message);
	}

	
}

package com.global;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/*
 *This class contains all the methods which is releated to the Logs
 *@Author Mohammed Imran */
public class CreateLog {
public static Logger logger= Logger.getLogger(CreateLog.class);
/* This method is used to send as a info message
 * @Param message */
	public void Info(String message) {
		PropertyConfigurator.configure("Log4j.properties");
		logger.info(message);
	}

}

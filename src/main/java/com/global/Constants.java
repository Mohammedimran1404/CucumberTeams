package com.global;

/*
 *This class contains all the paths which is releated to the framework
 *@Author Mohammed Imran 
 * */
public class Constants {
	private String propertyfilepath=System.getProperty("user.dir")+"/src/test/resources/config.properties";
	
	/* This method is used to store propertyfilepath */
	public String getpropertyfilepath() {
		return propertyfilepath;
	}

}

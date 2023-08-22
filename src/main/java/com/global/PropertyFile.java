package com.global;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/* This class contains the methods which is used to read data from propertyfile
 *@Author Mohammed Imran */
public class PropertyFile {
	Constants constantutility= new Constants();
	FileInputStream fis;
	Properties pro;
	/* This methods will read specific key value form the propertyfile */
	public PropertyFile() {
		File file=new File(constantutility.getpropertyfilepath());
		try {
			fis= new FileInputStream(file);
			pro=new Properties();
			pro.load(fis);
		}
		catch(Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}
	}
	public String getApplicationUrl() {
		String url=pro.getProperty("baseUrl");
		return url;
	}
	public String getApplicationEmail() {
		String emailid=pro.getProperty("email");
		return emailid;
	}
	public String getApplicationPassword() {
		String pass=pro.getProperty("password");
		return pass;
	}
	public String getBrowserName() {
		String browser=pro.getProperty("browser_name");
		return browser;
	}
}


